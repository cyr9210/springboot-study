package bong.springboot12;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Arguments implements ApplicationRunner {
//    //빈에 생성자가 한개고 생성자의 파라미터가 빈인경우, 자동으로 주입해준다.
//    public Arguments(ApplicationArguments arguments){
//        System.out.println("foo : " + arguments.containsOption("foo"));
//        System.out.println("bar : " + arguments.containsOption("bar"));
//
//    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("apprun 2");
//        System.out.println("foo : " + args.containsOption("foo"));
//        System.out.println("bar : " + args.containsOption("bar"));
    }
}
