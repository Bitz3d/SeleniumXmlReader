package pl.rafalab.xmlReader.Model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Module {
    private String name;
}
