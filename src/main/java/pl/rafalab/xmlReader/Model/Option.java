package pl.rafalab.xmlReader.Model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Option {
    private String name;

    private String value;
}
