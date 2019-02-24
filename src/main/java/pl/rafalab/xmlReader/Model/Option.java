package pl.rafalab.xmlReader.Model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;

@Component
@Data
@XmlRootElement
public class Option {
    private String name;

    private String value;
}
