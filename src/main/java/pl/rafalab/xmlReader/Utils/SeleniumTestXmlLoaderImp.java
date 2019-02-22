package pl.rafalab.xmlReader.Utils;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;
import pl.rafalab.xmlReader.Model.Testrun;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;
import java.io.File;

@Component()
public class SeleniumTestXmlLoaderImp implements SeleniumTestXmlLoader {


    @Override
    public Testrun getSeleniumTest(File file) {
        Testrun testrun = new Testrun();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Testrun.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            testrun = (Testrun) unmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return testrun;
    }
}
