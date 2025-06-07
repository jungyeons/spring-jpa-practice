package com.jungyeons.springintroductory;

import com.jungyeons.springintroductory.discount.DiscountPolicy;
import com.jungyeons.springintroductory.discount.FixDiscountPolicy;
import com.jungyeons.springintroductory.discount.RateDiscountPolicy;
import com.jungyeons.springintroductory.member.MemberRepository;
import com.jungyeons.springintroductory.member.MemberService;
import com.jungyeons.springintroductory.member.MemberServiceImpl;
import com.jungyeons.springintroductory.member.MemoryMemberRepository;
import com.jungyeons.springintroductory.order.OrderService;
import com.jungyeons.springintroductory.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
