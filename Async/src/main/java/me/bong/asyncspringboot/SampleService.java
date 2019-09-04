package me.bong.asyncspringboot;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class SampleService {

    private final AsyncService asyncService;

    public void asyncCall(int i) {
        asyncService.asyncRun(() -> async(i));
    }

    public void async(int i) {
        log.info("async test - " + i);
    }
}
