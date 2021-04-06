package service;

import model.Order;
import model.OrderItem;
import model.Status;

import java.util.ArrayList;

public class OrderValidationService {

    public static boolean validate(Order order){
        //if
        if(order.getId() == null || order.getId().isEmpty()){
            return false;
        }
        //userId
        if(order.getUserId() == null || order.getUserId().isEmpty()){
            return false;
        }
        //items
        if(!validateItems(order.getItems())){
            return false;
        }

        return true;
    }

    private static boolean validateItems(ArrayList<OrderItem> items){
        if(items.isEmpty()){
            return false;
        }
        return true;
    }
}
