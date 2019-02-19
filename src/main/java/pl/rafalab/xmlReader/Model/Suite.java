package pl.rafalab.xmlReader.Model;

import javax.xml.bind.annotation.XmlAttribute;

public class Suite {
    private String duration;

    private String locationUrl;

    private Test[] test;

    private Suite[] suite;

    private String name;

    private String status;

    public Suite[] getSuite() {
        return suite;
    }

    public void setSuite(Suite[] suite) {
        this.suite = suite;
    }

    @XmlAttribute
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    @XmlAttribute
    public String getLocationUrl() {
        return locationUrl;
    }

    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }

    public Test[] getTest() {
        return test;
    }

    public void setTest(Test[] test) {
        this.test = test;
    }
    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlAttribute
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
