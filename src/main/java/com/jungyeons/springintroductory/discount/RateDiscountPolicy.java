package com.jungyeons.springintroductory.discount;

import com.jungyeons.springintroductory.annotation.MainDiscountPolicy;
import com.jungyeons.springintroductory.member.Grade;
import com.jungyeons.springintroductory.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent =10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return price * discountPercent/100;
        }else{
            return 0;
        }
    }
}
