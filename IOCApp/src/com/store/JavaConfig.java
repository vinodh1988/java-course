package com.store;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.system.Activity;
import com.system.Coding;
import com.system.Document;
import com.system.Testing;

@Configuration
@ComponentScan(basePackages = {"com.system"})
public class JavaConfig {
    @Bean(name="coding")
    @Scope("prototype")
    public Activity getActivity() {
    	return new Coding();
    }
    
    @Bean(name="document")
    public Activity getActivity2() {
    	return new Document();
    }
    
    @Bean(name="testing")
    public Activity getActivity3() {
    	return new Testing();
    }
    

}
