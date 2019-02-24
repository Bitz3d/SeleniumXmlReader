package pl.rafalab.xmlReader.Model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Component
public class Root {

    private Output[] output;

    private String name;

    private String location;

    public Output[] getOutput() {
        return output;
    }

    public void setOutput(Output[] output) {
        this.output = output;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlAttribute
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
