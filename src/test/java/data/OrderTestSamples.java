package data;

import model.Order;
import model.OrderItem;
import model.Status;

import java.util.ArrayList;
import java.util.Date;

public class OrderTestSamples {

    public static Order getValidOrder(){
        String id = "jf9f";
        String userId = "j33l";
        Status status = Status.PROCESSED;
        ArrayList<OrderItem> items = new ArrayList<>();
        items.add(OrderItemTestSamples.getValidOrderItem());
        Date date = new Date();
        String deliveryAddress = "Belarus, st.Yakuba Kolasa, 28";
        Order order = new Order(id, userId, status, items, date, deliveryAddress);
        return order;
    }

    public static Order getInvalidOrder(){
        String id = "2fef";
        String userId = "8eur";
        Status status = Status.ERROR;
        ArrayList<OrderItem> items = new ArrayList<>();
        items.add(OrderItemTestSamples.getValidOrderItem());
        Date date = new Date();
        String deliveryAddress = "Belarus, st.Yakuba Kolasa, 28";
        Order order = new Order(id, userId, status, items, date, deliveryAddress);
        return order;
    }
}
