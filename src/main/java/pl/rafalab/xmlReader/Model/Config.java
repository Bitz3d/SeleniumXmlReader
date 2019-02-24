package pl.rafalab.xmlReader.Model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Component
@XmlRootElement
public class Config {
    private Extension extension;

    private String listeners;

    private String configId;

    private Module module;

    private String nameIsGenerated;

    private String name;

    private String properties;

    private Option[] option;

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    public String getListeners() {
        return listeners;
    }

    public void setListeners(String listeners) {
        this.listeners = listeners;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    @XmlAttribute
    public String getNameIsGenerated() {
        return nameIsGenerated;
    }

    public void setNameIsGenerated(String nameIsGenerated) {
        this.nameIsGenerated = nameIsGenerated;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Option[] getOption() {
        return option;
    }

    public void setOption(Option[] option) {
        this.option = option;
    }

    @XmlAttribute
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }
}
