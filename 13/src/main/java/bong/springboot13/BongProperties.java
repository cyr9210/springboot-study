package bong.springboot13;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.time.Duration;

@Component
@ConfigurationProperties("bong")
@Validated
public class BongProperties {

    @NotEmpty
    private String name;

    private int age;

    private String fullName;

    private Duration sessionTimeOut = Duration.ofSeconds(30);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Duration getSessionTimeOut() {
        return sessionTimeOut;
    }

    public void setSessionTimeOut(Duration sessionTimeOut) {
        this.sessionTimeOut = sessionTimeOut;
    }
}
