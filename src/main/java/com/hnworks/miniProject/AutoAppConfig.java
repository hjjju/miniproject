package com.hnworks.miniProject;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//
//  @ComponentScan( excludeFilters = @ComponentScan.Filter(type =
//  FilterType.ANNOTATION,classes = Configuration.class) )
@Configuration
public class AutoAppConfig implements WebMvcConfigurer {

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/nexa/**").addResourceLocations("classpath:/static/nexaP/") // 반드시 '/'로 끝나야 함
//				.setCachePeriod(20); // 없어도 됨.(캐시 지속시간 설정 (초))
//	}
	// 루트 "/" 접속 시 index 페이지로 포워딩
	@Override
	@Order(Ordered.HIGHEST_PRECEDENCE + 1)
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/index.html");
	}

	// Web Resource 경로 설정
	@Override
	@Order(Ordered.HIGHEST_PRECEDENCE + 2)
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/_resource_/**").addResourceLocations("classpath:/static/nexaP/_resource_/");
//		registry.addResourceHandler("/FrameBase/**").addResourceLocations("classpath:/static/nexaP/FrameBase/");
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/nexaP/");
		registry.addResourceHandler("/nexacrolib/**").addResourceLocations("classpath:/static/nexaP/nexacrolib/");
		registry.addResourceHandler("/*.json").addResourceLocations("classpath:/static/nexaP/");
		registry.addResourceHandler("/*.html").addResourceLocations("classpath:/static/nexaP/");
		registry.addResourceHandler("/*.js").addResourceLocations("classpath:/static/nexaP/");
	}

}
