package com.josephrodriguez.springboot.starterkit.config;

import com.josephrodriguez.springboot.starterkit.filters.ScopedResponseFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<ScopedResponseFilter> filterRegistrationBean() {
        FilterRegistrationBean<ScopedResponseFilter> registrationBean = new FilterRegistrationBean<>();
        var filter = new ScopedResponseFilter();

        registrationBean.setFilter(filter);
        registrationBean.addUrlPatterns("/status/*");
        registrationBean.setOrder(2); //set precedence
        return registrationBean;
    }
}
