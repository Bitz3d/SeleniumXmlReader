package pl.rafalab.xmlReader.Model;

import lombok.Data;

@Data
public class Root {
    private Output[] output;

    private String name;

    private String location;
}
