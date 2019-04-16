package bong.springboot163;

import bong.springboot163.account.Account;
import bong.springboot163.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RedisRunner implements ApplicationRunner {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ValueOperations<String, String> values =  redisTemplate.opsForValue();
        values.set("bong", "choi");
        values.set("spring", "boot");
        values.set("hello", "world");

        Account account = new Account();
        account.setEmail("xxx@naver.com");
        account.setUsername("bong");

        accountRepository.save(account);
        Optional<Account> byId = accountRepository.findById(account.getId());
        System.out.println(byId);
        System.out.println(byId.get());
        System.out.println(byId.get().getEmail());
        System.out.println(byId.get().getUsername());

    }
}
