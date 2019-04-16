package bong.springboot165.account;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
public class Role {

    private Long id;

    private String name;


}