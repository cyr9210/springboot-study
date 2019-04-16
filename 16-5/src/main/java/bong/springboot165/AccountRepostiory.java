package bong.springboot165;

import bong.springboot165.account.Account;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AccountRepostiory extends Neo4jRepository<Account, Long> {

}
