package com.codealpha.tbs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SecurityConfig {
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	UserDetailsService userDetails() {
		UserDetails user =User.withUsername("User").password(passwordEncoder().encode("User123")).roles("User").build();
		UserDetails admin =User.withUsername("Admin").password(passwordEncoder().encode("Admin123")).roles("Admin").build();
		
		return new InMemoryUserDetailsManager(user, admin);
		
	}
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)throws Exception{
		httpSecurity.csrf(customizer ->customizer.disable())
		.httpBasic(Customizer.withDefaults())
		.formLogin(Customizer.withDefaults())
		.authorizeHttpRequests(authorize->
		      authorize.requestMatchers("/api/flights").hasRole("User")
		      .requestMatchers("/api/hotels").hasRole("User")
		      .requestMatchers("/api/transportations").hasRole("User")
				.requestMatchers("/bookings").hasRole("Admin")
				.anyRequest().authenticated());
		return httpSecurity.build();
	}

}

