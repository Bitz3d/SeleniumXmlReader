package pl.rafalab.xmlReader.Conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.xmlReader.Utils.FilesWorkerImp;
import pl.rafalab.xmlReader.Utils.SeleniumTestXmlLoaderImp;

import java.io.File;
import java.io.IOException;
import java.util.Locale;


@RestController
@RequestMapping("/api/")
public class UpladController {

    private SeleniumTestXmlLoaderImp seleniumTestXmlLoaderImp;
    private MessageSource messageSource;
    private FilesWorkerImp saveFileImp;

//    @Autowired
//    public UpladController(SeleniumTestXmlLoaderImp seleniumTestXmlLoaderImp, MessageSource messageSource,FilesWorkerImp saveFileImp) {
//        this.seleniumTestXmlLoaderImp = seleniumTestXmlLoaderImp;
//        this.messageSource = messageSource;
//        this.saveFileImp = saveFileImp;
//    }

    @PostMapping("upload")
    ResponseEntity<String> hello(@RequestParam("file") MultipartFile multipartFile) throws IOException  {
        Locale locale = Locale.getDefault();
        saveFileImp = new FilesWorkerImp();
//
//        if(multipartFile == null || !multipartFile.getOriginalFilename().contains(".xml")){
//            return new ResponseEntity<>(messageSource.getMessage("empty.file", null, locale),HttpStatus.BAD_REQUEST);
//        }
        System.out.println(multipartFile.getOriginalFilename());
        saveFileImp.saveFileInDirectory(multipartFile);
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @PostMapping("check")
    ResponseEntity<String> upload(@RequestParam("file") MultipartFile multipartFile) throws IOException {

        File file = new File(multipartFile.getOriginalFilename());
        multipartFile.transferTo(file);
        return new ResponseEntity<>("upload done", HttpStatus.OK);
    }
}
