package com.uyong.example.web;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.SearchStrategy;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureOrder(Integer.MIN_VALUE)
public class LiteMyWeb implements InitializingBean {

    @Bean
    @ConditionalOnMissingBean(value = {ServletWebServerFactory.class},
        search = SearchStrategy.CURRENT
    )
    public MyWebServletWebServerFactory myWebServletWebServerFactory() {
        return new MyWebServletWebServerFactory();
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
