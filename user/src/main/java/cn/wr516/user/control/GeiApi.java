package cn.wr516.user.control;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeiApi {


    @GetMapping("/password")
    @ResponseBody
    public String getInfo(String key) {
        return "s";
    }

}
