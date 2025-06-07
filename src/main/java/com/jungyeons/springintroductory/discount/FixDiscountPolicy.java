package com.jungyeons.springintroductory.discount;

import com.jungyeons.springintroductory.member.Grade;
import com.jungyeons.springintroductory.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return discountFixAmount;
        }else {
            return 0;
        }

    }
}
