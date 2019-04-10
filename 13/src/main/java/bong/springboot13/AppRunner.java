package bong.springboot13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(AppRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("===============");
//        System.out.println(bongProperties.getName());
////        System.out.println(bongProperties.getAge());
//        System.out.println(bongProperties.getFullName());
////        System.out.println(bongProperties.getSessionTimeOut());
//        System.out.println(hello);
//        System.out.println("===============");

        logger.debug("================");
        logger.debug(bongProperties.getName());
        logger.debug(bongProperties.getFullName());
        logger.debug("================");
    }
}
