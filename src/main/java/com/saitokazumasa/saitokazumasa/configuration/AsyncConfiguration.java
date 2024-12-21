package com.saitokazumasa.saitokazumasa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AsyncConfiguration {
    @Bean
    public ThreadPoolTaskExecutor taskExecutor() {
        final var executor = new ThreadPoolTaskExecutor();
        executor.initialize();
        return executor;
    }
}
