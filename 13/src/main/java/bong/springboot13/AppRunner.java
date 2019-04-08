package bong.springboot13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

//    @Value("${bong.name}")
//    private String name;
//
//    @Value("${bong.age}")
//    private int age;

    @Autowired
    private BongProperties bongProperties;

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===============");
        System.out.println(bongProperties.getName());
//        System.out.println(bongProperties.getAge());
        System.out.println(bongProperties.getFullName());
//        System.out.println(bongProperties.getSessionTimeOut());
        System.out.println(hello);
        System.out.println("===============");
    }
}
