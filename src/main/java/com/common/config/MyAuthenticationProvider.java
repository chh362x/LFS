package com.common.config;

import com.lfs.entity.SysUsers;
import com.lfs.services.impl.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by zl on 17/12/17.
 */
@Component
public class MyAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private CustomUserService customUserService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException{
        String username = authentication.getName();
        String password = (String)authentication.getCredentials();
        SysUsers user = (SysUsers) customUserService.loadUserByUsername(username);
        if(user == null){
            throw new BadCredentialsException("");
        }
        password = "";
        if(!password.equals(user.getPassword())){
            throw  new BadCredentialsException("");
        }

        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        return new UsernamePasswordAuthenticationToken(user,password,authorities);

    }

    @Override
    public boolean supports(Class<?> aClass){
        return true;
    }
}
