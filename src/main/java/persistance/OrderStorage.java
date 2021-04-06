package persistance;

import model.Order;

import java.util.ArrayList;
import java.util.Optional;

//Repo
public class OrderStorage {

    public Optional<Order> findById(String id){
        return Optional.empty();
    }

    public Optional<ArrayList<Order>> findByUserId(String userId){
        return Optional.empty();
    }

    public Integer save(Order order){
        throw new UnsupportedOperationException("not implemented yet");
    }

    public String remove(Order order){
        throw new UnsupportedOperationException("not implemented yet");
    }
}
