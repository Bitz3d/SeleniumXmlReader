package pl.rafalab.xmlReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pl.rafalab.xmlReader.Utils")
public class XmlReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlReaderApplication.class, args);
	}

}

