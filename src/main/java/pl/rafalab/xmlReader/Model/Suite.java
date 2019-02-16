package pl.rafalab.xmlReader.Model;

import lombok.Data;

@Data
public class Suite {
    private String duration;

    private String locationUrl;

    private Test[] test;

    private String name;

    private String status;
}
