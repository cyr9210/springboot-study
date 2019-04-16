package bong.springboot163.account;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("accounts")
public class Account {

    @Id
    String id;

    String username;

    String email;
}
