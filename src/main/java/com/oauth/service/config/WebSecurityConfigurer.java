package com.oauth.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

	// The Authentication- ManagerBean is used by Spring Security to handle
	// authentication.
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	// The UserDetailsService is used by Spring Security to handle user information
	// that will be returned the Spring Security.
	@Override
	@Bean
	public UserDetailsService userDetailsServiceBean() throws Exception {
		return super.userDetailsServiceBean();
	}

	// The configure() method is where you’ll define users, their passwords, and
	// their roles.
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("isaac").password("{noop}password1").roles("USER").and()
				.withUser("chambers").password("{noop}password2").roles("USER", "ADMIN");
//		 
//		auth.inMemoryAuthentication().withUser("isaack").password("{noop}password1").roles("USER").and()
//				.withUser("isaackadmin").password("{noop}password2").roles("USER", "ADMIN");
	}
}
