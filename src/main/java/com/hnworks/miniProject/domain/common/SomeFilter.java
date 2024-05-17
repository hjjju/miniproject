package com.hnworks.miniProject.domain.common;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

//@Component
@WebFilter(urlPatterns="/.do/*")
@Slf4j
@Configuration
public class SomeFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		log.info("fileter");
		chain.doFilter(request,response);
		
	}

}




