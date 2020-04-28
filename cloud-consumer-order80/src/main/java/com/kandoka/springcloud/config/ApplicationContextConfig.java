package com.kandoka.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Kandoka
 * @createTime: 2020/04/28 16:41
 * @description:
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
