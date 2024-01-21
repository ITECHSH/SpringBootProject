package ru.neoflex.springbootlibrary;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String HelloAnswer(String name){
        return "Hello, " + name;
    }
}
