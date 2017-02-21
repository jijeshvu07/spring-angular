package com.jo.educare.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.jo.educare.services.impl.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
		 http.csrf().disable();
		 
		 http
         .authorizeRequests()
             .antMatchers("/*", "/static/**", "/css/**", "/js/**", "/images/**").permitAll()
             .antMatchers("/school-admin/*").hasAuthority("SCHOOL_ADMIN").anyRequest().fullyAuthenticated()
             .antMatchers("/teacher/*").hasAuthority("TEACHER").anyRequest().fullyAuthenticated()
             .anyRequest().authenticated().and()
             
         .formLogin()
             .loginPage("/login.html").defaultSuccessUrl("/loginSuccess.html")
         	.failureUrl("/login.html?error").permitAll().and()
         	
         .logout()
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout.html")).logoutSuccessUrl("/login.html?logout");
            
	 }
	 
	 @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		 auth.userDetailsService(customUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	    }
}
