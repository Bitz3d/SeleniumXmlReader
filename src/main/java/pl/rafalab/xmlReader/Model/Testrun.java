package pl.rafalab.xmlReader.Model;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Component
@XmlRootElement
public class Testrun
{

    private String duration;

    private Suite suite;

    private String footerText;


    private Root root;

    private String name;

    private Count[] count;

    private Config config;

    @XmlAttribute
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    @XmlAttribute
    public String getFooterText() {
        return footerText;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Count[] getCount() {
        return count;
    }

    public void setCount(Count[] count) {
        this.count = count;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}