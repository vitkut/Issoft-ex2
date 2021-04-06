package persistance;

import data.OrderTestSamples;
import model.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class OrderStorageTest {

    private OrderStorage orderStorage = new OrderStorage();

    @Test
    void testSave() {
        //given
        Order order = OrderTestSamples.getValidOrder();

        //when
        Integer id = orderStorage.save(order);
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(order);

        //then
        assertNotEquals(id, null);
        Order loaded = orderStorage.findById(order.getId()).get();
        assertEquals(loaded, order);
        ArrayList<Order> loadedArray = orderStorage.findByUserId(order.getUserId()).get();
        assertEquals(loadedArray, orders);
    }
}
