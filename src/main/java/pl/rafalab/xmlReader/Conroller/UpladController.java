package pl.rafalab.xmlReader.Conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.xmlReader.Utils.SaveFileImp;
import pl.rafalab.xmlReader.Utils.SeleniumTestXmlLoaderImp;

import java.io.File;
import java.io.IOException;
import java.util.Locale;


@RestController
@RequestMapping("/api/")
public class UpladController {

    private SeleniumTestXmlLoaderImp seleniumTestXmlLoaderImp;
    private MessageSource messageSource;
    private SaveFileImp saveFileImp;

    @Autowired
    public UpladController(SeleniumTestXmlLoaderImp seleniumTestXmlLoaderImp, MessageSource messageSource,SaveFileImp saveFileImp) {
        this.seleniumTestXmlLoaderImp = seleniumTestXmlLoaderImp;
        this.messageSource = messageSource;
        this.saveFileImp = saveFileImp;
    }

    @GetMapping("hello")
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @PostMapping("upload")
    ResponseEntity<String> upload(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        Locale locale = Locale.getDefault();
        if(multipartFile == null && !multipartFile.getName().contains(".xml")){
            return new ResponseEntity<>(messageSource.getMessage("empty.file", null, locale),HttpStatus.BAD_REQUEST);
        }
        File file = new File(multipartFile.getOriginalFilename());
        multipartFile.transferTo(file);
        return new ResponseEntity<>("upload done", HttpStatus.OK);
    }

    @PostMapping("test")
    ResponseEntity<String> test(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        saveFileImp.saveFileInDirectory(multipartFile);
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

}
