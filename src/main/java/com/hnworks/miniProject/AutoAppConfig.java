package com.hnworks.miniProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
@Configuration
public abstract class AutoAppConfig implements WebMvcConfigurer {

	// 루트 "/" 접속 시 index 페이지로 포워딩
	@Override
	@Order(Ordered.HIGHEST_PRECEDENCE + 1)
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/index.html");
	}

	// view Resolver 경로 설정
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/jsp", ".jsp");
	}

	// Web Resource 경로 설정
	@Override
	@Order(Ordered.HIGHEST_PRECEDENCE + 2)
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/nexaP/");
		registry.addResourceHandler("/nexacrolib14/**").addResourceLocations("classpath:/static/nexaP/nexacrolib14/");
		registry.addResourceHandler("/*.json").addResourceLocations("classpath:/static/nexaP/");
		registry.addResourceHandler("/*.html").addResourceLocations("classpath:/static/nexaP/");
		registry.addResourceHandler("/*.js").addResourceLocations("classpath:/static/nexaP/");
	}
	// 메세지 소스 생성
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();

		//메세지 프로퍼티 팔일의 위치와 이름을 지정
		source.setBasename("classpath:/messages/message");
		//기본 인코딩을 지정한다.
		source.setDefaultEncoding("UTF-8");
		//프로퍼티 파일의 변경을 감지할 시간 간격을 지정한다.
		source.setCacheSeconds(60);
		//없는 메세지일 경우 예외를 발생시키는 대신 코드를 기본 메세지로 한다.
		source.setUseCodeAsDefaultMessage(true);
		return source;
	}

	// 변경된 언어 정보를 기억할 로케일 리졸버 생성
	// 여기서는 세션에 저장하는 방식 사용
	@Bean
	public SessionLocaleResolver localeResolver() {
		return new SessionLocaleResolver();
	}

	// 언어 변경을 위한 인터셉터를 생성
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}

	// 인터셉터 등록
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}

	public abstract RequestMappingHandlerAdapter getRequestMappingHandlerAdapter();
}
