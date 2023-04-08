package com.example.demoauth.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebFlux
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        //配置白名单和访问规则，CommonEnum枚举类
        http.csrf().disable();
        return http.build();
    }

}
