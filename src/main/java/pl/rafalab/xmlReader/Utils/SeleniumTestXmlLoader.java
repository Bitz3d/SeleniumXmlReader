package pl.rafalab.xmlReader.Utils;

import java.io.File;
import java.util.List;

import pl.rafalab.xmlReader.Model.SeleniumTestXml;

public interface SeleniumTestXmlLoader {

	public List<SeleniumTestXml> getSeleniumTest(File file);
	
}
