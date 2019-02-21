package pl.rafalab.xmlReader.Utils;

import org.springframework.stereotype.Component;
import pl.rafalab.xmlReader.Model.Testrun;
import pl.rafalab.xmlReader.Utils.Interfaces.SeleniumTestXmlLoader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.util.Arrays;

@Component
public class SeleniumTestXmlLoaderImp implements SeleniumTestXmlLoader {

    @Override
    public Testrun getSeleniumTest(File file) {

        Testrun xmlSeleniumTest = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Testrun.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            xmlSeleniumTest = (Testrun) unmarshaller.unmarshal(file);

            Arrays.asList(xmlSeleniumTest.getSuite().getSuite()).forEach(souite->{
                Arrays.asList(souite.getTest()).forEach(test -> System.out.println(test.getStatus()));
            });

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlSeleniumTest;
    }
}
