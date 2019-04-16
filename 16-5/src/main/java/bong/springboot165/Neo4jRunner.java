package bong.springboot165;

import bong.springboot165.account.Account;
import bong.springboot165.account.Role;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Neo4jRunner implements ApplicationRunner {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    AccountRepostiory accountRepostiory;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setUsername("choi");
        account.setEmail("xxxxx@naver.com");

        Role role = new Role();
        role.setName("user");

        account.getRoles().add(role);

        accountRepostiory.save(account);
//        Session session = sessionFactory.openSession();
//        session.save(account);
//        sessionFactory.close();
        //session.clear(); 세션안의 캐싱된 객체를 클리어하는것 같다.

        System.out.println("Finsihed");
    }
}
