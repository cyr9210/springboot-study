package bong.springboot162.account;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Account {

    @Id @GeneratedValue
    private long id;

    private String username;

    private String password;

    private String addOption;

    private boolean active;


}
