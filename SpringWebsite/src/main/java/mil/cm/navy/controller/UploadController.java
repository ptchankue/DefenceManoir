package mil.cm.navy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by patricktchankue on 4/9/17.
 */
@RestController
public class UploadController {

    public static final String uploadingdir = System.getProperty("user.dir") + "/uploadingdir/";


    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void myUploadExample(@RequestParam("file") MultipartFile[]
                                             submissions) {

        for (MultipartFile item: submissions){
            System.out.println(item.getOriginalFilename());
        }
    }
    @RequestMapping(value = "/upload2", method = RequestMethod.POST)
    public String uploadingPost(@RequestParam("file") MultipartFile[] uploadingFiles) throws IOException {
        for(MultipartFile uploadedFile : uploadingFiles) {
            File file = new File(uploadingdir + uploadedFile.getOriginalFilename());
            file.getParentFile().mkdirs();
            uploadedFile.transferTo(file);
        }

        System.out.println(uploadingdir);
        return "redirect:/";
    }
}
