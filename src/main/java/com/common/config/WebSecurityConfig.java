package com.common.config;

import com.lfs.services.impl.CustomUserService;
import com.utils.AjaxRequestMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * Created by zl on 17/12/17.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService customUserService(){
        return new CustomUserService();
    }
    @Autowired
    private MyAuthenticationProvider provider;//自定义验证
    @Autowired
    private AuthenticationEntryPoint authenticationEntryPoint;

    protected  void configure(HttpSecurity http) throws Exception{
        http.csrf().disable()
                .httpBasic().and()
                .authorizeRequests()
                    .antMatchers("/","/static/**","/static/js/**","/js/**","/html","/html/**","/page/**")
                    .permitAll()
                    .anyRequest()
                    .authenticated()
                    .and()
                .formLogin()
                    .loginPage("/index")
                    .loginProcessingUrl("/login")
                    .usernameParameter("username")
                    .passwordParameter("password")
                    .failureUrl("/loginError")
                    .defaultSuccessUrl("/loginSuccess")
                    .permitAll()
                    .and()
                .logout()
                    .permitAll()
                    .and()
                .exceptionHandling()
                .defaultAuthenticationEntryPointFor(authenticationEntryPoint, new AjaxRequestMatcher());
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(customUserService());
        auth.authenticationProvider(provider);
    }


}
