package com.my.sts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	// index - X, hello - O, login - X, logout - X
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.cors(cors -> cors.disable());
//		http.httpBasic(basic -> basic.disable());
//		http.csrf(config -> config.disable());

		http.csrf(config -> config.disable()); // form
		http.authorizeHttpRequests(req -> req.requestMatchers("/h2/**").permitAll()).headers().frameOptions().sameOrigin();

		http.authorizeHttpRequests((requests) -> requests
//				.requestMatchers("/", "/home", "/ex02").permitAll().anyRequest().authenticated())
				.requestMatchers("/hello").authenticated()
				.requestMatchers("/ex01").hasAuthority("ADMIN")
				.requestMatchers("/ex02").hasAuthority("USER")
				.requestMatchers("/ex03").hasAnyAuthority("USER")
				.requestMatchers("/ex04").hasAnyAuthority("ADMIN", "USER")
				.anyRequest().permitAll())
//				.formLogin(Customizer.withDefaults()).logout(Customizer.withDefaults());
				.formLogin((form) -> form.loginPage("/login").permitAll()).logout((logout) -> logout.permitAll());

		return http.build();
	}

	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// 인증 인가
//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails user =
//				// User.withDefaultPasswordEncoder()
//				User.withUsername("scott")
//				//.username("scott")
////				.password("$2a$10$tZgfSWSbWruB0saasJ1ZcuhEn4FSzMF2mujQ8sP3yr/0nj3q75SXm")
//				.password(passwordEncoder().encode("tiger"))
//				.roles("USER").build();
//
//		// 단방향 암호화
//		String code = passwordEncoder().encode("tiger");
//		System.out.println(code);
//		System.out.println(passwordEncoder().matches("tiger", code));
//
//		return new InMemoryUserDetailsManager(user);
//	}

}
