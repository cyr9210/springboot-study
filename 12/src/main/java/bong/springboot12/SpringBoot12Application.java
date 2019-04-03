package bong.springboot12;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class SpringBoot12Application {

    public static void main(String[] args) {
//        new SpringApplicationBuilder()
//                .sources(SpringBoot12Application.class)
//                .banner(new Banner() {
//                    @Override
//                    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//                        out.println("=======");
//                        out.println("adsf");
//                        out.println("=======");
//
//                    }
//                })
//                .listeners(new SampleListener())
//                .run(args);

        SpringApplication app = new SpringApplication(SpringBoot12Application.class);
//        app.addListeners(new SampleListener());
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);

    }

}
