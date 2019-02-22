package pl.rafalab.xmlReader.Conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Locale;


@RestController
@RequestMapping("/api/")
public class UpladController {


    @PostMapping("upload")
    ResponseEntity<String> hello(@RequestParam("file") MultipartFile multipartFile) throws IOException  {

        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @PostMapping("check")
    ResponseEntity<String> upload(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        File file = new File(multipartFile.getOriginalFilename());
        multipartFile.transferTo(file);
        return new ResponseEntity<>("upload done", HttpStatus.OK);
    }
}
