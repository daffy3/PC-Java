package org.daffy3.interceptor.config;

import lombok.RequiredArgsConstructor;
import org.daffy3.interceptor.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class MvcConfig implements WebMvcConfigurer {

    private final AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns: 특정 URL에 매칭시키고 싶을 때 사용
        registry.addInterceptor(authInterceptor).addPathPatterns("/api/private/*");
    }
}
