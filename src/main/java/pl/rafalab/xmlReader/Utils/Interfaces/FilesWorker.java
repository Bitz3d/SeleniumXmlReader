package pl.rafalab.xmlReader.Utils.Interfaces;

import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.xmlReader.Model.Testrun;

import java.io.IOException;
import java.util.List;

public interface FilesWorker {

    public void saveFileInDirectory(MultipartFile multipartFile) throws IOException;
    public List<Testrun> allXMLFiles();

}
