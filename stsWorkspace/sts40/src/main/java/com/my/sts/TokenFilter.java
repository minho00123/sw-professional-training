package com.my.sts;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.my.sts.service.JwtService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TokenFilter extends OncePerRequestFilter {
	final JwtService jwtService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String[] ignores= {"/","/login"};
		if(Stream.of(ignores).anyMatch(
				ignore->ignore.equals(request.getRequestURI()))) {
			filterChain.doFilter(request, response);
			return;
		}
		String auth = request.getHeader("Authorization");

		if (auth == null || !auth.startsWith("Bearer ")) {
			filterChain.doFilter(request, response);
			return;
		}
		String token=auth.substring("Bearer ".length());
		System.out.println("필터 수행전");
		String user=jwtService.parseInfo(token);
		SecurityContext ctxt=SecurityContextHolder.getContext();
		ctxt.setAuthentication(
				new UsernamePasswordAuthenticationToken(
						user,null,List.of(new SimpleGrantedAuthority("USER"))));
		filterChain.doFilter(request, response);
		System.out.println("필터 수행후");
	}

}
