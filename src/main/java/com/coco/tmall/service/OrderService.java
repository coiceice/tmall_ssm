package com.coco.tmall.service;

import com.coco.tmall.pojo.Order;

import java.util.List;

public interface OrderService {

    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);

    void delete(int id);
    void update(Order c);
    Order get(int id);
    List list();
}