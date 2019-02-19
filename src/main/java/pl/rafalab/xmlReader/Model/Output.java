package pl.rafalab.xmlReader.Model;


import javax.xml.bind.annotation.XmlAttribute;

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
