package persistance;

import model.OrderItem;

import java.util.ArrayList;
import java.util.Optional;

//Repo
public class OrderItemStorage {

    public Optional<OrderItem> findByName(String name){
        return Optional.empty();
    }

    public void save(OrderItem item){
        throw new UnsupportedOperationException("not implemented yet");
    }

    public void remove(OrderItem item){
        throw new UnsupportedOperationException("not implemented yet");
    }
}
