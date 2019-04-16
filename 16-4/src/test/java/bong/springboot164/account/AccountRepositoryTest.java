package bong.springboot164.account;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataMongoTest
public class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void test(){
        Account account = new Account();
        account.setUsername("bong");
        account.setEmail("추가되나?@naver.com");

        accountRepository.insert(account);

        Optional<Account> byId = accountRepository.findById(account.getId());
        assertThat(byId.get().getId()).isNotEmpty();

        Optional<Account> byEmail = accountRepository.findByEmail(account.getEmail());
        assertThat(byEmail.get().getEmail()).isNotEmpty();

        assertThat(byId.get().getUsername()).isEqualTo(account.getUsername());

    }

    @Test
    public void test2(){
        Optional<Account> byEmail = accountRepository.findByEmail("xxx@naver.com");
        assertThat(byEmail.get()).isNotNull();
    }
}