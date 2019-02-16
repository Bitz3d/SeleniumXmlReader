package pl.rafalab.xmlReader.Model;

import lombok.Data;

@Data
public class Testrun
{
    private String duration;

    private Suite suite;

    private String footerText;

    private Root root;

    private String name;

    private Count[] count;

    private Config config;


}