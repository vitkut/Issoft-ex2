package model;

//Entity
public class OrderItem {

    private String name;
    private Integer count;
    private Double price;

    public OrderItem(String name, Integer count, Double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public Double getPrice() {
        return price;
    }
}
