package com.bis.config;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.bis"})
public class AppConfiguration implements WebMvcConfigurer
{
    private static final Logger logger = Logger.getLogger(AppConfiguration.class);

    @Bean
    public TilesConfigurer tilesConfigurer()
    {
        TilesConfigurer tilesConfig = new TilesConfigurer();
        logger.info("Inside AppConfiguration tilesConfigurer()");
        tilesConfig.setDefinitions(new String[] {"/WEB-INF/tile.xml"});
        tilesConfig.setCheckRefresh(true);
        return tilesConfig;
    }
    
    public void configureViewResolvers(ViewResolverRegistry registry) 
    {
        logger.info("Inside AppConfiguration configureViewResolvers()");
        TilesViewResolver tilesViewResolver = new TilesViewResolver();
        registry.viewResolver(tilesViewResolver);
        registry.order(0);
    }
    
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		logger.info("Inside AplicationConfiguration addResourceHandlers()---");
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}