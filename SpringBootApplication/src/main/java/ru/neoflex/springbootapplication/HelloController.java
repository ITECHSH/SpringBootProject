package ru.neoflex.springbootapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.springbootlibrary.HelloService;

@RestController
public class HelloController {
    @Autowired private HelloService helloService;
    @RequestMapping(method=RequestMethod.GET, value="/hello")
    public String hello(String name){
        return helloService.HelloAnswer(name);
    }
}
