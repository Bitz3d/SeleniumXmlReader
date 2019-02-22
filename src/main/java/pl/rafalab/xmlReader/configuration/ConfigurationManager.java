package pl.rafalab.xmlReader.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.rafalab.xmlReader.Utils.Test;

@Configuration
public class ConfigurationManager {

    @Bean
    public Test dd(){
        return new Test();
    }
}
