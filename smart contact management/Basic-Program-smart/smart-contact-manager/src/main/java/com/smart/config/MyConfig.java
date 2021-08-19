package com.smart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService getUserDetailsService() {
		return new UserDetailsServiceImplementation();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();

	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {

		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(this.getUserDetailsService());
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());

		return daoAuthenticationProvider;
	}

	// here configuration our method

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*
		 * we have to say AuthenticationManagerBuilder which type i m using
		 * authentication here we are using here database authentication then we have to
		 * pass the method of authenticationProvider() which is created on the top
		 * position
		 */
		auth.authenticationProvider(authenticationProvider());
	}

	/* this method for routing like providing the accessibility of USER and ADMIN */

	/*
	 * here loginPage("/signin") use for remove spring security login page and apply
	 * our custome login page
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/user/**").hasRole("USER")
		.antMatchers("/**").permitAll()
		.and().formLogin()
		.loginPage("/signin")//it is responsible for customize Log in page
		.loginProcessingUrl("/login")//this is for sign in page action we can write any name but match with with sign up page action name
		.defaultSuccessUrl("/user/index")//after success full login open this URL 
		//.failureUrl("/signin-fail")//if i want to show any error page then make error page and pass URL here
		.and().csrf().disable();
	}

}
