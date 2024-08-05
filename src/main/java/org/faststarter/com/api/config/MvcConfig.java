package org.faststarter.com.api.config;

import org.faststarter.com.api.interceptor.DefaultGlobalExceptionHandler;
import org.faststarter.com.api.interceptor.DefaultWebMvcInterceptor;
import org.faststarter.com.api.interceptor.DefaultWrapperResponseAdvice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DefaultWebMvcInterceptor())
                .addPathPatterns("/**");
    }

    @Bean
    public DefaultWrapperResponseAdvice wrapperResponseAdvice() {
        return new DefaultWrapperResponseAdvice();
    }

    @Bean
    public DefaultGlobalExceptionHandler defaultExceptionHandler() {
        return new DefaultGlobalExceptionHandler();
    }

}
