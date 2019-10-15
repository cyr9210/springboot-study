package me.bong.scheduled;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestScheduled {

    @Scheduled(initialDelay = 3000, fixedRate = 0)
    public void testScheduled() {
      log.info("hello scheduled");
    }
}
