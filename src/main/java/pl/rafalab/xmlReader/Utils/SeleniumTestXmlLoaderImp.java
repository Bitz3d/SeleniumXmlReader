package pl.rafalab.xmlReader.Utils;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;
import pl.rafalab.xmlReader.Model.Testrun;
import pl.rafalab.xmlReader.Utils.Interfaces.SeleniumTestXmlLoader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;
import java.io.File;

@Component
@Log4j
public class SeleniumTestXmlLoaderImp implements SeleniumTestXmlLoader {


    @Override
    public Testrun getSeleniumTest(File file) {
        Testrun testrun = new Testrun();
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
