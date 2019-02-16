package pl.rafalab.xmlReader.Model;

import lombok.Data;

@Data
public class Config {
    private Extension extension;

    private String listeners;

    private String configId;

    private Module module;

    private String nameIsGenerated;

    private String name;

    private String properties;

    private Option[] option;
}
