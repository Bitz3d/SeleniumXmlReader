package pl.rafalab.xmlReader.Conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.rafalab.xmlReader.Utils.SeleniumTestXmlLoader;
import pl.rafalab.xmlReader.Utils.SeleniumTestXmlLoaderImp;


@RestController
@RequestMapping("/api/")
public class UpladController {



    @GetMapping("hello")
    ResponseEntity<String> hello() {

        SeleniumTestXmlLoaderImp seleniumTestXmlLoaderImp = new SeleniumTestXmlLoaderImp();
        seleniumTestXmlLoaderImp.getSeleniumTest();
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @PostMapping("upload")
    ResponseEntity<String> upload(){


        return new ResponseEntity<>("upload done", HttpStatus.OK);
    }

}
