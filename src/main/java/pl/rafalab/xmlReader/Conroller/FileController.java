package pl.rafalab.xmlReader.Conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rafalab.xmlReader.Model.Test;
import pl.rafalab.xmlReader.Utils.Test12;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class FileController {

    Test12 test;

    @Autowired
    public FileController(Test12 test) {
        this.test = test;
    }

    @GetMapping("all/files")
    ResponseEntity<String> getAllFiles(){

        test.siema();
        return new ResponseEntity<>(test.siema(),HttpStatus.OK);
    }
}
