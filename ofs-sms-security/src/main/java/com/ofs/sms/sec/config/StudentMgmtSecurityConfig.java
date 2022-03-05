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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
			.withUser("sekhar").password("{bcrypt}$2a$10$cNSJOH/IdBugXs6b1WeLd.pqeVR9gzw7rN4RCtk7Zl7xTGI/KUrkm").roles("ADMIN", "TEACHER", "STUDENT")
			.and().withUser("babu").password("{pbkdf2}ff2327363394ed76c29fe232eea29a9133e21314f7fb613133e30cd0434e9d9c8533de0d1da7af66").roles("STUDENT")
			.and().withUser("kiran").password("{sha256}f5821c502db109775c6355c30337c58e24f128a19515ab4719e332ad4b471f49348ef78dae3aebee").roles("TEACHER");
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/admins/**").hasRole("ADMIN")
		//.antMatchers("/admins/teachers").hasRole("ADMIN")
		//.antMatchers("/admins/students").hasRole("ADMIN")
			.antMatchers("/teachers").hasRole("TEACHER")
			//.antMatchers("/teachers").hasAnyRole("TEACHER", "ADMIN")
			//.antMatchers("/students").hasRole("STUDENT")
			.antMatchers("/students").hasAnyRole("STUDENT", "ADMIN")
			.antMatchers("/security").permitAll()
			.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		//return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder();
	}

}
