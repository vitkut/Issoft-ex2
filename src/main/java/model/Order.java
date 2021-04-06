package model;

import java.util.ArrayList;
import java.util.Date;

//Entity
public class Order {

    private String id;
    private String userId;
    private Status status;
    private ArrayList<OrderItem> items;
    private Date date;
    private String deliveryAddress;

    public Order(String id, String userId, Status status, ArrayList<OrderItem> items, Date date, String deliveryAddress) {
        this.id = id;
        this.userId = userId;
        this.status = status;
        this.items = items;
        this.date = date;
        this.deliveryAddress = deliveryAddress;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public Status getStatus() {
        return status;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public Date getDate() {
        return date;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", status=" + status +
                ", items=" + items +
                ", date=" + date +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}
