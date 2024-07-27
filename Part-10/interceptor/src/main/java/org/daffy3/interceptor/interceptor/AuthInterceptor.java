package org.daffy3.interceptor.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.parser.Authorization;
import org.daffy3.interceptor.annotation.Auth;
import org.daffy3.interceptor.exception.AuthException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class AuthInterceptor implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(AuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();

        URI uri = UriComponentsBuilder.fromUriString(request.getRequestURI()).query(request.getQueryString()).build().toUri();

        log.info("request url: {}", url);
        boolean hasAnnotation = checkAnnotation(handler, Auth.class);
        log.info("has annotation: {}", hasAnnotation);

        // 나의 서버는 모두 public으로 동작을 하는데
        // 단, Auth 권한을 가진 요청에 대해서는 쿠키, 세션 체크 정책 등 추가할 수 있다.
        if (hasAnnotation) {
            // 권한 체크
            String query = uri.getQuery();
            log.info("query: {}", query);

            if (query.equals("name=marco")) {
                return true;
            }
            // return false;
            throw new AuthException();
        }
        return true;
    }

    private boolean checkAnnotation(Object handler, Class clazz) {
        // resource, javascript, html
        if (handler instanceof ResourceHttpRequestHandler) {
            return true;
        }

        // Annotation Check
        HandlerMethod handlerMethod = (HandlerMethod) handler;

        if (null != handlerMethod.getMethodAnnotation(clazz) || null != handlerMethod.getBeanType().getAnnotation(clazz)) {
            // Auth Annotation이 있을 때는 true
            return true;
        }
        return false;
    }
}
