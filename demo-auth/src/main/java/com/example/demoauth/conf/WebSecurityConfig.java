//package com.example.demoauth.conf;
//
//import com.example.demoauth.service.AuthenticationManager;
//import com.example.demoauth.service.SecurityContextRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
///**
// * Author: Administrator
// * DATE: 2019/1/31
// * DESC:
// **/
//@EnableWebFluxSecurity
//@EnableReactiveMethodSecurity
//public class WebSecurityConfig {
//
//	@Bean
//	public MapReactiveUserDetailsService userDetailsService() {
//		UserDetails user = User.withDefaultPasswordEncoder()
//				.username("bonies")
//				.password("123456")
//				.roles("")
//				.build();
//		return new MapReactiveUserDetailsService(user);
//	}
//	@Autowired
//	private AuthenticationManager authenticationManager;
//
//	@Autowired
//	private SecurityContextRepository securityContextRepository;
//
//	@Bean
//	public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//		return http.csrf().disable()
//				.formLogin().disable()
//				.httpBasic().disable()
//				.authenticationManager(authenticationManager)
//				.securityContextRepository(securityContextRepository)
//				.authorizeExchange()
//				.pathMatchers(HttpMethod.OPTIONS).permitAll()
//				.pathMatchers("/login").permitAll()
//				.pathMatchers("/connect").permitAll()
//				.anyExchange().authenticated()
//				.and().build();
//	}
//
//}
