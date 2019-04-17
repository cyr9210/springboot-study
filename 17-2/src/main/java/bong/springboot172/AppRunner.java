package bong.springboot172;

import bong.springboot172.account.Account;
import bong.springboot172.account.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AppRunner implements ApplicationRunner {

    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account bong = accountService.createAccount("bong", "1234");
        System.out.println(bong.getPassword());
    }
}
