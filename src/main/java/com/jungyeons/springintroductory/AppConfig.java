package com.jungyeons.springintroductory;

import com.jungyeons.springintroductory.discount.DiscountPolicy;
import com.jungyeons.springintroductory.discount.RateDiscountPolicy;
import com.jungyeons.springintroductory.member.*;
import com.jungyeons.springintroductory.order.OrderService;
import com.jungyeons.springintroductory.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    //@Bean memberService -> new MemoryMemberRepository()
    //@Bean orderService -> new MemoryMemberRepository()
    @Bean
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        System.out.println("call AppConfig.MemberRepository");
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        System.out.println("call AppConfig.orderService");
  //      return new OrderServiceImpl(memberRepository(), discountPolicy());
        return null;
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }

}
