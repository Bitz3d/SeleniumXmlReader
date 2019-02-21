package pl.rafalab.xmlReader.Utils.Interfaces;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.xmlReader.Model.Testrun;

import java.io.File;

public interface SeleniumTestXmlLoader {

	public Testrun getSeleniumTest(File file);

}
