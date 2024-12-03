package estudodevdojo.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hi")
    public String hi(){
        return "ola mais uma vez";
    }
}
