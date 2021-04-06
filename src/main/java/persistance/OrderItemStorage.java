package persistance;

import model.OrderItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Optional;

//Repo
public class OrderItemStorage {

    private static final Logger logger = LoggerFactory.getLogger(OrderItemStorage.class);

    public Optional<OrderItem> findByName(String name){
        logger.debug("Starting findByName("+name+")");
        logger.debug("Finish findByName(): "+Optional.empty());
        return Optional.empty();
    }

    public Integer save(OrderItem item){
        logger.debug("Starting save("+item+")");
        logger.debug("Finish save(): UnsupportedOperationException: not implemented yet");
        throw new UnsupportedOperationException("not implemented yet");
    }

    public String remove(OrderItem item){
        logger.debug("Starting remove("+item+")");
        logger.debug("Finish remove(): UnsupportedOperationException: not implemented yet");
        throw new UnsupportedOperationException("not implemented yet");
    }
}
