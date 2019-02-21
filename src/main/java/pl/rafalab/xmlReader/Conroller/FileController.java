package pl.rafalab.xmlReader.Conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rafalab.xmlReader.Model.Testrun;
import pl.rafalab.xmlReader.Utils.Interfaces.FilesWorker;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class FileController {

    private FilesWorker filesWorker;

    @Autowired
    public FileController(FilesWorker filesWorker) {
        this.filesWorker = filesWorker;
    }

    @GetMapping("all/files")
    ResponseEntity<List<Testrun>> getAllFiles(){
        return new ResponseEntity<>(filesWorker.allXMLFiles(),HttpStatus.OK);
    }
}
