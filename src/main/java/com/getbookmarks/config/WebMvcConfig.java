package com.getbookmarks.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.getbookmarks.rest.StoryResource;

@EnableWebMvc
@ComponentScan(basePackageClasses = StoryResource.class)
@Configuration
public class WebMvcConfig {

}
