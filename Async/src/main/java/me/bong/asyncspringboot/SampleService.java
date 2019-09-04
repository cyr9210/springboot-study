package me.bong.asyncspringboot;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class SampleService {

    private final Executor myPool;

    public void asyncCall(int i) {
        CompletableFuture.runAsync(() -> async(i), myPool);
    }

    public void async(int i) {
        log.info("async test - " + i);
    }
}
