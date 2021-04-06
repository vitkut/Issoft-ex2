package service;

import model.Order;
import model.OrderItem;
import model.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import persistance.OrderItemStorage;
import persistance.OrderStorage;


import java.util.ArrayList;
import java.util.Optional;

//Service
public class OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    private OrderStorage orderStorage;

    public OrderService(OrderStorage orderStorage) {
        this.orderStorage = orderStorage;
    }

    public Integer placeOrder(Order order){
        logger.debug("Starting placeOrder("+order+")");
        if(!OrderValidationService.validate(order)){
            logger.debug("Finish placeOrder(): IllegalArgumentException: Order is not valid");
            throw new IllegalArgumentException("Order is not valid");
        }
        Optional<Order> orderFromStorage = orderStorage.findById(order.getId());
        if(!orderFromStorage.equals(Optional.empty())){
            logger.debug("Finish placeOrder(): IllegalArgumentException: Order is already placed");
            throw new IllegalArgumentException("Order is already placed");
        }
        order.setStatus(Status.PROCESSED);
        Integer id = orderStorage.save(order);
        logger.debug("Finish placeOrder(): "+id.toString());
        return id;
    }

    public ArrayList<Order> loadAllByUserId(String userId){
        logger.debug("Starting loadAllByUserId("+userId+")");
        if(userId == null || userId.isEmpty()){
            logger.debug("Finish loadAllByUserId(): IllegalArgumentException: Incorrect userId: ["+userId+"]");
            throw new IllegalArgumentException("Incorrect userId: ["+userId+"]");
        }
        Optional<ArrayList<Order>> orders = orderStorage.findByUserId(userId);
        if(!orders.equals(Optional.empty())){
            logger.debug("Finish loadAllByUserId(): "+orders.get());
            return orders.get();
        }
        logger.debug("Finish loadAllByUserId(): null");
        return null;
    }
}
