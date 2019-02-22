package pl.rafalab.xmlReader.Utils;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.xmlReader.Model.Testrun;

import java.io.IOException;
import java.util.List;

@Service
public interface FileWorker {

    public void saveFileInDirectory(MultipartFile multipartFile) throws IOException;
    public List<Testrun> allXMLFiles();

}
