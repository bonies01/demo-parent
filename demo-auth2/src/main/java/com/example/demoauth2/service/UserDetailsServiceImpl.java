package com.example.demoauth2.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demoauth2.pojo.User;
import com.example.demoauth2.pojo.JwtUser;

/**
 * Created by echisan on 2018/6/23
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {



    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = new User();
        user.setUsername("bonies");
        String password=new BCryptPasswordEncoder().encode("123456");
        user.setPassword(password);
        String role="role1";
        user.setRole(role);
        return new JwtUser(user);
    }

}
