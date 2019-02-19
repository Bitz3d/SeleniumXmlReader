package pl.rafalab.xmlReader.Utils;

import pl.rafalab.xmlReader.Model.Testrun;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SeleniumTestXmlLoaderImp implements SeleniumTestXmlLoader {


    @Override
    public Testrun getSeleniumTest() {

        File file1 = new File("/home/rafau/Desktop/Test Results - Tests.xml");

        Testrun xmlSeleniumTest = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Testrun.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            xmlSeleniumTest = (Testrun) unmarshaller.unmarshal(file1);


            Arrays.asList(xmlSeleniumTest.getSuite().getSuite()).forEach(souite->{
                Arrays.asList(souite.getTest()).forEach(test ->
                {
                    System.out.println(test.getStatus());
                });

            });

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlSeleniumTest;
    }
}
