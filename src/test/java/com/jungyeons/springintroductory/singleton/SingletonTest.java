package com.jungyeons.springintroductory.singleton;

import com.jungyeons.springintroductory.AppConfig;
import com.jungyeons.springintroductory.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    @DisplayName("스프링없는 순수한 di 컨테이너")
    void pureContainer(){
        AppConfig appConfig = new AppConfig();
        //호출할 떄마다 객체를 생성
        MemberService memberService1 = appConfig.memberService();
        //호출할 떄마다 객체를 생성
        MemberService memberService2 = appConfig.memberService();
        //
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
        // !=
        assertThat(memberService1).isNotSameAs(MemberService.class);

    }
@Test
    @DisplayName("싱글톤 패턴을 적용 ")
    void singletonServiceTest(){
        SingletonService singletoninstance1 = SingletonService.getInstance();
        SingletonService singletoninstance2 = SingletonService.getInstance();
        System.out.println("singletoninstance1 = " + singletoninstance1);
        System.out.println("singletoninstance2 = " + singletoninstance2);
        assertThat(singletoninstance1).isSameAs(singletoninstance2);
    }
    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springContainer(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        //호출할 떄마다 객체를 생성
        MemberService memberService1 = ac.getBean("memberService",MemberService.class);
        //호출할 떄마다 객체를 생성
        MemberService memberService2 = ac.getBean("memberService",MemberService.class);
        //
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
        // !=
        assertThat(memberService1).isSameAs(memberService2);
    }
}
