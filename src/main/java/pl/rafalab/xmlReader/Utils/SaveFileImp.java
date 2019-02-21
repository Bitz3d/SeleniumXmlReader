package pl.rafalab.xmlReader.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.rafalab.xmlReader.Utils.Interfaces.SaveFile;

import java.io.File;

@Component
public class SaveFileImp implements SaveFile {


    @Value("${file.location}")
    private String path;


    @Override
    public void saveFileInDirectory(String path, File file) {


    }
}
