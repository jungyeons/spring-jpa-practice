package com.jungyeons.springintroductory.scan;

import com.jungyeons.springintroductory.AppConfig;
import com.jungyeons.springintroductory.member.MemberService;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoAppConfigTest {

    @Test
    void basicScan(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.AutoAppConfig.class);
        MemberService memberService =ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
