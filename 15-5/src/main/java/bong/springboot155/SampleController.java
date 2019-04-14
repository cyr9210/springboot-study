package bong.springboot155;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin("http://localhost:18080")
@RestController
public class SampleController {

//    @CrossOrigin("http://localhost:18080")
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
