package com.bis.config;

import com.bis.factory.MongoFactory;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    private static final Logger logger = Logger.getLogger(AppInitializer.class);

    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        logger.info("Inside AppInitializer getRootConfigClasses()");
        return new Class[] {MongoFactory.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses(){
        logger.info("Inside AppInitializer getServletConfigClasses()");
        return new Class[] {AppConfiguration.class};
    }
    @Override
    protected String[] getServletMappings()
    {
        logger.info("Inside AppInitializer getServletMappings()");
        return new String[] {"/"};
    }
}