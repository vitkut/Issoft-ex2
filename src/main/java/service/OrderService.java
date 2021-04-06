package service;

import model.Order;
import model.OrderItem;
import model.Status;
import persistance.OrderItemStorage;
import persistance.OrderStorage;


import java.util.ArrayList;
import java.util.Optional;

//Service
public class OrderService {

    private OrderStorage orderStorage;
    private OrderItemStorage orderItemStorage;

    public OrderService(OrderStorage orderStorage, OrderItemStorage orderItemStorage) {
        this.orderStorage = orderStorage;
        this.orderItemStorage = orderItemStorage;
    }

    public String placeOrder(Order order){
        if(!OrderValidationService.validate(order)){
            throw new IllegalArgumentException("Order is not valid");
        }

        Optional<Order> orderFromStorage = orderStorage.findById(order.getId());
        if(!orderFromStorage.isPresent()){
            return "Order is already placed";
        }

        order.setStatus(Status.PROCESSED);
        Integer id = orderStorage.save(order);
        return id.toString();
    }

    public ArrayList<Order> loadAllByUserId(String userId){
        if(userId == null || userId.isEmpty()){
            return null;
        }
        Optional<ArrayList<Order>> orders = orderStorage.findByUserId(userId);
        if(orders.isPresent()){
            return orders.get();
        }
        return null;
    }
}
