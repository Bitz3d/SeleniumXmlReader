package pl.rafalab.xmlReader.Conroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class FileController {

    @GetMapping("all/files")
    ResponseEntity<String> getAllFiles(){

        return new ResponseEntity<>("s",HttpStatus.OK);
    }
}
