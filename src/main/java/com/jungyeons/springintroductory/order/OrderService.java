package com.jungyeons.springintroductory.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
