package pl.rafalab.xmlReader.Model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Extension {
    private String name;

    private Pattern pattern;
}
