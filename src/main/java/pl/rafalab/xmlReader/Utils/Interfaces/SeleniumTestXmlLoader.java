package pl.rafalab.xmlReader.Utils.Interfaces;

import org.springframework.stereotype.Component;
import pl.rafalab.xmlReader.Model.Testrun;

import java.io.File;

@Component
public interface SeleniumTestXmlLoader {

	public Testrun getSeleniumTest(File file);

}
