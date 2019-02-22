package pl.rafalab.xmlReader.Conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rafalab.xmlReader.Model.Test;
import pl.rafalab.xmlReader.Model.Testrun;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class FileController {


    Test test;

    @Autowired
    public FileController(Test test) {
        this.test = test;
    }

    @GetMapping("all/files")
    ResponseEntity<String> getAllFiles(){
        return new ResponseEntity<>("dziala",HttpStatus.OK);
    }
}
