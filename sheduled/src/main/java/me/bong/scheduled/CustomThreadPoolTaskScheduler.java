package me.bong.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.Date;
import java.util.concurrent.ScheduledFuture;

@Slf4j
public class CustomThreadPoolTaskScheduler extends ThreadPoolTaskScheduler {

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable task, long period) {
        if (period == 0) {
            log.info("custom scheduler");
            return null;
        }
        return super.scheduleAtFixedRate(task, period);
    }

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable task, Date startTime, long period) {
        if (period == 0) {
            log.info("custom scheduler");
            return null;
        }
        return super.scheduleAtFixedRate(task, startTime, period);
    }
}
