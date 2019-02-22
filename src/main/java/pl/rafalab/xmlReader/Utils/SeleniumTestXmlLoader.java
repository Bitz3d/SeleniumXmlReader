package pl.rafalab.xmlReader.Utils;

import pl.rafalab.xmlReader.Model.Testrun;

import java.io.File;

public interface SeleniumTestXmlLoader {
    public Testrun getSeleniumTest(File file);
}
