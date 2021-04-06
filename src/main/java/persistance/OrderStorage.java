package persistance;

import model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Optional;

//Repo
public class OrderStorage {

    private static final Logger logger = LoggerFactory.getLogger(OrderStorage.class);

    public Optional<Order> findById(String id){
        logger.debug("Starting findById("+id+")");
        logger.debug("Finish findById(): "+Optional.empty());
        return Optional.empty();
    }

    public Optional<ArrayList<Order>> findByUserId(String userId){
        logger.debug("Starting findByUserId("+userId+")");
        logger.debug("Finish findByUserId(): "+Optional.empty());
        return Optional.empty();
    }

    public Integer save(Order order){
        logger.debug("Starting save("+order+")");
        logger.debug("Finish save(): UnsupportedOperationException: not implemented yet");
        throw new UnsupportedOperationException("not implemented yet");
    }

    public String remove(Order order){
        logger.debug("Starting remove("+order+")");
        logger.debug("Finish remove(): UnsupportedOperationException: not implemented yet");
        throw new UnsupportedOperationException("not implemented yet");
    }
}
