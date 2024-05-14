package com.hnworks.miniProject;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.nexacro.spring.context.ApplicationContextProvider;
import com.nexacro.spring.resolve.NexacroHandlerMethodReturnValueHandler;
import com.nexacro.spring.resolve.NexacroMappingExceptionResolver;
import com.nexacro.spring.resolve.NexacroMethodArgumentResolver;
import com.nexacro.spring.resolve.NexacroRequestMappingHandlerAdapter;
import com.nexacro.spring.view.NexacroFileView;
import com.nexacro.spring.view.NexacroView;
import com.nexacro.xapi.tx.PlatformType;

//@Configuration
//@ComponentScan(
//        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Configuration.class))
public class NexacroConfig /*extends AutoAppConfig implements WebMvcConfigurer*/ {
//
//	@Bean
//	@Lazy(false)
//	public ApplicationContextProvider applicationContextProvider() {
//		return new ApplicationContextProvider();
	}

//    @Override
//    public RequestMappingHandlerAdapter getRequestMappingHandlerAdapter() {
//        return new NexacroRequestMappingHandlerAdapter();
//    }

//	@Override
//	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
//		NexacroMethodArgumentResolver nexacroResolver = new NexacroMethodArgumentResolver();
//		resolvers.add(nexacroResolver);
//		super.addArgumentResolvers(resolvers);
//	}
//
//	@Override
//	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {
//
//		NexacroHandlerMethodReturnValueHandler returnValueHandler = new NexacroHandlerMethodReturnValueHandler();
//
//		NexacroFileView nexacroFileView = new NexacroFileView();
//		NexacroView nexacroView = new NexacroView();
//		nexacroView.setDefaultContentType(PlatformType.CONTENT_TYPE_XML);
//		nexacroView.setDefaultCharset("UTF-8");
//
//		returnValueHandler.setView(nexacroView);
//		returnValueHandler.setFileView(nexacroFileView);
//
//		handlers.add(returnValueHandler);
//
//		super.addReturnValueHandlers(handlers);
//	}

/*    *//**
		 * 넥사크로플랫폼 에러 처리 ExceptionResolver 등록
		 *//*
			 * @Override public void
			 * configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers)
			 * {
			 * 
			 * NexacroView nexacroView = new NexacroView();
			 * nexacroView.setDefaultContentType(PlatformType.CONTENT_TYPE_XML);
			 * nexacroView.setDefaultCharset("UTF-8");
			 * 
			 * NexacroMappingExceptionResolver nexacroException = new
			 * NexacroMappingExceptionResolver();
			 * 
			 * nexacroException.setView(nexacroView);
			 * nexacroException.setShouldLogStackTrace(true);
			 * nexacroException.setShouldSendStackTrace(true);
			 * nexacroException.setDefaultErrorMsg("fail.common.msg"); //
			 * nexacroException.setMessageSource(messageSource());
			 * nexacroException.setOrder(1); resolvers.add(nexacroException);
			 * 
			 * super.configureHandlerExceptionResolvers(resolvers); }
			 */
