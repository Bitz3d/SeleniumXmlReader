package pl.rafalab.xmlReader.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.xmlReader.Utils.Interfaces.SaveFile;

import java.io.File;
import java.io.IOException;

@Component
public class SaveFileImp implements SaveFile {

    @Value("${file.location}")
    private String path;


    @Override
    public void saveFileInDirectory(MultipartFile multipartFile) throws IOException {
        File desktop = new File(path);
        if (!desktop.exists()) {
            desktop.mkdir();
        }
        System.out.println(multipartFile.getOriginalFilename());
        File saveFile = new File(path+"/"+multipartFile.getOriginalFilename());
        multipartFile.transferTo(saveFile);
    }
}
