package pl.rafalab.xmlReader.Model;

import lombok.Data;

@Data
public class XmlSeleniumTest {

    private Testrun testrun;

    public Testrun getTestrun() {
        return testrun;
    }

    public void setTestrun(Testrun testrun) {
        this.testrun = testrun;
    }

}
