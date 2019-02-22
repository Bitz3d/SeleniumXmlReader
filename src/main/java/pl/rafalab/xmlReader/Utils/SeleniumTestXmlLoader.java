package pl.rafalab.xmlReader.Utils;

import org.springframework.stereotype.Service;
import pl.rafalab.xmlReader.Model.Testrun;

import java.io.File;

@Service
public interface SeleniumTestXmlLoader {
    public String getSeleniumTest(File file);
}
