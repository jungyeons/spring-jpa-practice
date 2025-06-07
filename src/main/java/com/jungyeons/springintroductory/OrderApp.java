package com.jungyeons.springintroductory;

import com.jungyeons.springintroductory.member.Grade;
import com.jungyeons.springintroductory.member.Member;
import com.jungyeons.springintroductory.member.MemberService;
import com.jungyeons.springintroductory.member.MemberServiceImpl;
import com.jungyeons.springintroductory.order.Order;
import com.jungyeons.springintroductory.order.OrderService;
import com.jungyeons.springintroductory.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 20000);
        System.out.println(order);
 //       System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
