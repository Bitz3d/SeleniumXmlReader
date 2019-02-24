package pl.rafalab.xmlReader.Model;


import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;

@Component
public class Output {
    private String type;

    private String content;

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
