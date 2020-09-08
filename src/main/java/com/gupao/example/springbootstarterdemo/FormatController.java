package com.gupao.example.springbootstarterdemo;

import com.gupaoedu.starter.HelloFormatTemplate;
import com.gupaoedu.starter.format.JsonFormatProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lipu
 * @since : 2020-09-08 21:09
 */
@RestController
public class FormatController {

    @Autowired
    HelloFormatTemplate helloFormatTemplate;

    @GetMapping("format")
    public String format(){
//        JsonFormatProcessor formatProcessor = new JsonFormatProcessor();
//        HelloFormatTemplate helloFormatTemplate = new HelloFormatTemplate(formatProcessor);
        User user = new User();
        user.setName("pupu");
        user.setAge(18);
        String format = helloFormatTemplate.doFormat(user);

        return format;
    }
}
