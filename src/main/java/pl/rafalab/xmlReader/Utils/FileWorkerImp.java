package pl.rafalab.xmlReader.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.xmlReader.Model.Testrun;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FileWorkerImp implements FileWorker {


    @Override
    public void saveFileInDirectory(MultipartFile multipartFile) throws IOException {

    }

    @Override
    public List<Testrun> allXMLFiles() {
        return null;
    }
}
