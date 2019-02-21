package pl.rafalab.xmlReader.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.xmlReader.Model.Testrun;
import pl.rafalab.xmlReader.Utils.Interfaces.FilesWorker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FilesWorkerImp implements FilesWorker {

    @Value("${file.location}")
    private String path;

    @Autowired
    SeleniumTestXmlLoaderImp seleniumTestXmlLoaderImp;

    @Override
    public void saveFileInDirectory(MultipartFile multipartFile) throws IOException {
        File desktop = new File(path);
        if (!desktop.exists()) {
            desktop.mkdir();
        }
        File saveFile = new File(path + File.separator + multipartFile.getOriginalFilename());
        multipartFile.transferTo(saveFile);
    }

    @Override
    public List<Testrun> allXMLFiles() {
        List<Testrun> allXmlList = new ArrayList<>();
        File file = new File(path);
        Arrays.asList(file.listFiles()).forEach(file1 -> allXmlList.add(seleniumTestXmlLoaderImp.getSeleniumTest(file1)));
        return allXmlList;
    }
}
