package bong.springboot14;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private String name = "bong";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
