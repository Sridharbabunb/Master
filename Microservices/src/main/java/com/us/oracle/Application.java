package com.us.oracle;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.oracle.bmc.http.internal.ExplicitlySetFilter;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * Created by snb on 3/13/2019.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Configuration
    class WebMvcConfiguration extends WebMvcConfigurationSupport {

        protected void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
            for(HttpMessageConverter<?> converter: converters) {
                if(converter instanceof MappingJackson2HttpMessageConverter) {
                    ObjectMapper mapper = ((MappingJackson2HttpMessageConverter)converter).getObjectMapper();
                    mapper.setFilterProvider(new SimpleFilterProvider().addFilter(ExplicitlySetFilter.NAME, SimpleBeanPropertyFilter.serializeAll()));
                }
            }
        }

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {

            registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");

            registry.addResourceHandler("/webjars/**")
                    .addResourceLocations("classpath:/META-INF/resources/webjars/");

        }
    }
}
