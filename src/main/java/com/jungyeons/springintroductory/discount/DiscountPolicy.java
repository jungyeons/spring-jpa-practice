package com.jungyeons.springintroductory.discount;

import com.jungyeons.springintroductory.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);


}
