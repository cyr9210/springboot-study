package bong.springboot164.account;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "accounts")
public class Account {

    @Id
    private String id;

    private String username;

    private String email;


}
