package com.SR.CHHAICHIVON.SPRING.IOC.DI.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SR.CHHAICHIVON.SPRING.IOC.DI.model.CategoryDAO;
import com.SR.CHHAICHIVON.SPRING.IOC.DI.model.VideoDAO;
@Configuration
public class WebConfigure {
	@Bean
	public VideoDAO videoDAO(){
		return new VideoDAO();
	}
	@Bean
	public CategoryDAO categoryDAO(){
		return new CategoryDAO();
	}
}
