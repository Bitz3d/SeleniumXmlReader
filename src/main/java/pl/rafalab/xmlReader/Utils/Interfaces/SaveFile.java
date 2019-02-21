package pl.rafalab.xmlReader.Utils.Interfaces;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public interface SaveFile {
    public void saveFileInDirectory(MultipartFile multipartFile) throws IOException;
}
