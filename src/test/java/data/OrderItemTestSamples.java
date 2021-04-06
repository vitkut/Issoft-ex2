package data;

import model.Order;
import model.OrderItem;

public class OrderItemTestSamples {

    public static OrderItem getValidOrderItem(){
        OrderItem orderItem = new OrderItem("Bread", 2, 5.2d);
        return orderItem;
    }

    public static OrderItem getInvalidOrderItem(){
        OrderItem orderItem = new OrderItem("", 2, 5.2d);
        return orderItem;
    }
}
