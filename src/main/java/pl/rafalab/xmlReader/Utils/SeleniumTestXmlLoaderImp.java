package pl.rafalab.xmlReader.Utils;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;
import pl.rafalab.xmlReader.Model.Testrun;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Component
@Log4j
public class SeleniumTestXmlLoaderImp implements SeleniumTestXmlLoader {

    @Override
    public String getSeleniumTest(File file) {

        return "sss";
    }
}
