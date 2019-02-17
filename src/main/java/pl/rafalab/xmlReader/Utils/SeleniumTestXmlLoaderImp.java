package pl.rafalab.xmlReader.Utils;

import pl.rafalab.xmlReader.Model.Testrun;
import pl.rafalab.xmlReader.Model.XmlSeleniumTest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;
import java.io.File;

public class SeleniumTestXmlLoaderImp implements SeleniumTestXmlLoader {


    @Override
    public Testrun getSeleniumTest() {

        File file1 = new File("/home/rafau/Desktop/Test Results - Tests.xml");

        Testrun xmlSeleniumTest = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(XmlSeleniumTest.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            xmlSeleniumTest = (Testrun) unmarshaller.unmarshal(file1);

            System.out.println(xmlSeleniumTest.getName());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlSeleniumTest;
    }
}
