package com.jungyeons.springintroductory.autowired;

import com.jungyeons.springintroductory.AppConfig;
import com.jungyeons.springintroductory.discount.DiscountPolicy;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllBeanTest {
    @Test
    void findAllBean(){
        new AnnotationConfigApplicationContext(Di);
    }
    static class DiscountService {
        private final Map<String, DiscountPolicy> policyMap;
        private final List<DiscountPolicy> policies;

        public DiscountService(Map<String, DiscountPolicy> policyMap, List<DiscountPolicy> policies) {
            this.policyMap = policyMap;
            this.policies = policies;
            System.out.println("policyMap = " + policyMap);
            System.out.println("policies = " + policies);
        }

    }
}
