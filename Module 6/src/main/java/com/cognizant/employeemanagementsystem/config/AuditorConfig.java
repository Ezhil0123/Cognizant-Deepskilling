package com.cognizant.employeemanagementsystem.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;


@Configuration
public class AuditorConfig {
    
    @CreatedBy
    private String createdBy;
    
    @LastModifiedBy
    private String lastModifiedBy;
    
    @Bean
    public AuditorAware<String> auditorProvider() {
        return () -> Optional.of("Admin");
    }
}