package com.jungyeons.springintroductory;

import com.jungyeons.springintroductory.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "com.jungyeons.springintroductory",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public  class AutoAppConfig {

    @Bean( name ="memoryMemberRepository")
    public MemoryMemberRepository memoryMemberRepository(){
        return new MemoryMemberRepository();
    }
}