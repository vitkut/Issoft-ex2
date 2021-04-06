package service;

import model.Order;
import model.OrderItem;
import model.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class OrderValidationService {

    private static final Logger logger = LoggerFactory.getLogger(OrderValidationService.class);

    public static boolean validate(Order order){
        logger.debug("Starting validate("+order+")");
        //id
        if(order.getId() == null || order.getId().isEmpty()){
            logger.debug("Id is not validate");
            return false;
        }
        logger.debug("Id is validate");
        //userId
        if(order.getUserId() == null || order.getUserId().isEmpty()){
            logger.debug("UserId is not validate");
            return false;
        }
        logger.debug("UserId is validate");
        //status
        if(order.getStatus() == null || order.getStatus().equals(Status.ERROR)){
            logger.debug("Status is not validate");
            return false;
        }
        logger.debug("Status is validate");
        //items
        if(!validateItems(order.getItems())){
            logger.debug("Items is not validate");
            return false;
        }
        logger.debug("Items is validate");

        return true;
    }

    private static boolean validateItems(ArrayList<OrderItem> items){
        if(items.isEmpty()){
            return false;
        }
        return true;
    }
}
