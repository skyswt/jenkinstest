package cn.hyperchain.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String hello() {
        return "hello worfs32ld";
    }

    public void sayBye() {
        System.out.println("bye");
    }
}
