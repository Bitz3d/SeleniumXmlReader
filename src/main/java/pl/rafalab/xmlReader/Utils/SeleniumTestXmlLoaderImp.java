package pl.rafalab.xmlReader.Utils;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.rafalab.xmlReader.Model.Test;
import pl.rafalab.xmlReader.Model.Testrun;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Component
@Log4j
public class SeleniumTestXmlLoaderImp implements SeleniumTestXmlLoader {

    Testrun testrun;

    @Autowired
    public SeleniumTestXmlLoaderImp(Testrun testrun) {
        this.testrun = testrun;
    }

    @Override
    public Testrun getSeleniumTest(File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Testrun.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            testrun = (Testrun) unmarshaller.unmarshal(file);
            log.info("Przetwarzamy plik - " + file.getName());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return testrun;
    }
}
