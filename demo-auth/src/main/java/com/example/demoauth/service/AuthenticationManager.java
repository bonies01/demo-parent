//package com.example.demoauth.service;
//
//import com.example.demoauth.util.JwtTokenUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.ReactiveAuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.stereotype.Component;
//import reactor.core.publisher.Mono;
//
//import java.util.Collections;
//
///**
// * Author: Administrator
// * DATE: 2019/1/31
// * DESC:
// **/
//@Component
//public class AuthenticationManager implements ReactiveAuthenticationManager {
//
//    @Override
//    public Mono<Authentication> authenticate(Authentication authentication) {
//        String authToken = String.valueOf(authentication.getCredentials());
//        boolean expiration = JwtTokenUtils.isExpiration(authToken);
//        if (expiration) {
//            throw new IllegalArgumentException("token超时了");
//        }else{
//            String username = JwtTokenUtils.getUsername(authToken);
//            String role = JwtTokenUtils.getUserRole(authToken);
//            if (username != null) {
//                return  Mono.just(new UsernamePasswordAuthenticationToken(username, null,
//                        Collections.singleton(new SimpleGrantedAuthority(role))
//                ));
//        }
//            return Mono.empty();
//        }
//    }
//}
