package edu.nuist.qdb.control;

import edu.nuist.qdb.service.ajax.result.ResultMessage;
import edu.nuist.qdb.util.FileUploader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {
    @Autowired
    private FileUploader fileUploader;

    @PostMapping("/upload")
    public ResultMessage upload(@RequestParam MultipartFile file) {
        return fileUploader.singel(file, "xlshaha", "all");
    }
}
