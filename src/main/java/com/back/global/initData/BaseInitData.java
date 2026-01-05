package com.back.global.initData;

import com.back.domain.post.post.service.PostSerivice;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class BaseInitData {
    private final PostSerivice postSerivice;

    @Bean
    public ApplicationRunner baseInitDataRunner() {
        return args -> {
            work1();
        };
    }

    private void work1() {
        log.debug("Post entity 개수: {}", postSerivice.count());
    }
    
}
