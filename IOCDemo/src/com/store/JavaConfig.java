package com.store;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.system.Activity;
import com.system.Coding;
import com.system.Document;
import com.system.Testing;

@Configuration
public class JavaConfig {
    @Bean(name="coding")
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
