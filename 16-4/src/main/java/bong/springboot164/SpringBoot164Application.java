package bong.springboot164;

import bong.springboot164.account.Account;
import bong.springboot164.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class  SpringBoot164Application {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    AccountRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot164Application.class, args);
    }


    @Bean
    public ApplicationRunner applicationRunner(){
        return args -> {
            Account account = new Account();
            account.setEmail("xxx@naver.com");
            account.setUsername("bong");

//            mongoTemplate.insert(account);

            accountRepository.insert(account);
        };
    }
}
