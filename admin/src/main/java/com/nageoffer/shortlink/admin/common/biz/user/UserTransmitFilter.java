package com.nageoffer.shortlink.admin.common.biz.user;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.opengoofy.index12306.framework.starter.bases.constant.UserConstant;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.URLDecoder;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * 用户信息传输过滤器
 */
@RequiredArgsConstructor
public class UserTransmitFilter implements Filter {
    private final StringRedisTemplate stringRedisTemplate;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String requestURI = httpServletRequest.getRequestURI();
        if(Objects.equals(requestURI, "/api/shortlink/v1/group")){
            return;
        }
        String userId = httpServletRequest.getHeader("username");
        String token = httpServletRequest.getHeader("token");
        Object  userInfoJsonStr = stringRedisTemplate.opsForValue().get("login_"+username, token);
        if (userInfoJsonStr != null) {
            JSON.parseObject(userInfoJsonStr.toString(),UserInfoDTO.class);
            UserContext.setuser（userInfoDTO);
        }
            String token = httpServletRequest.getHeader(UserConstant.USER_TOKEN_KEY);

        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            UserContext.removeUser();
        }
    }
}
