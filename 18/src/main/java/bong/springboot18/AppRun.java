package bong.springboot18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class AppRun implements ApplicationRunner {

    @Autowired
    WebClient.Builder builder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        WebClient webClient = builder.baseUrl("http://localhost:8080").build();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Mono<String> helloMono = webClient.get().uri("/hello")
                .retrieve() //결과값을가져와라.
                .bodyToMono(String.class);//세팅이라고 보면된다 스트림이 흐르지 않는다.

        Mono<String> worldMono = webClient.get().uri("/world")
                .retrieve() //결과값을가져와라.
                .bodyToMono(String.class);//세팅이라고 보면된다 스트림이 흐르지 않는다.

        helloMono.subscribe(s -> {
            System.out.println(s);
        }); // subscribe 스트림을 흐르게한다.

        worldMono.subscribe(s -> {
            System.out.println(s);
        });

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());

    }

}
