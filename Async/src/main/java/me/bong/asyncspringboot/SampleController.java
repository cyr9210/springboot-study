package me.bong.asyncspringboot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/async")
    public void async() {
        for (int i = 0; i < 1000; i++) {
            sampleService.asyncCall(i);
        }
    }
}
