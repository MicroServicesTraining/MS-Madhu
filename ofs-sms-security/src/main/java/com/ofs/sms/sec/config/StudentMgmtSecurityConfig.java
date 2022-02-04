/**
 * 
 */
package com.ofs.sms.sec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Lalitha
 *
 */
@Configuration
@EnableWebSecurity
public class StudentMgmtSecurityConfig extends WebSecurityConfigurerAdapter {

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder)
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("sekhar").password("1234").roles("ADMIN", "TEACHER", "STUDENT")
			.and().withUser("babu").password("abcd").roles("STUDENT")
			.and().withUser("kiran").password("abcd").roles("TEACHER");
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/admins").hasRole("ADMIN")
			.antMatchers("/teachers").hasRole("TEACHER")
			//.antMatchers("/teachers").hasAnyRole("TEACHER", "ADMIN")
			//.antMatchers("/students").hasRole("STUDENT")
			.antMatchers("/students").hasAnyRole("STUDENT", "ADMIN")
			.antMatchers("/security").permitAll()
			.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
