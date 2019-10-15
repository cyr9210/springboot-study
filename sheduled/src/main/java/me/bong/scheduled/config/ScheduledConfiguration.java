package me.bong.scheduled.config;

import me.bong.scheduled.CustomThreadPoolTaskScheduler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class ScheduledConfiguration {

    @Bean
    public TaskScheduler poolScheduler() {
        ThreadPoolTaskScheduler threadpool = new CustomThreadPoolTaskScheduler();
        threadpool.setPoolSize(Runtime.getRuntime().availableProcessors() * 2);
        threadpool.setThreadNamePrefix("my-scheduler2");
        return threadpool;
    }
}
