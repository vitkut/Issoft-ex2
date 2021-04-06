package persistance;

import data.OrderItemTestSamples;
import model.OrderItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class OrderItemStorageTest {

    private OrderItemStorage orderItemStorage = new OrderItemStorage();

    @Test
    void testSave() {
        //given
        OrderItem orderItem = OrderItemTestSamples.getValidOrderItem();

        //when
        Integer id = orderItemStorage.save(orderItem);

        //then
        assertNotEquals(id, null);
        OrderItem loaded = orderItemStorage.findByName(orderItem.getName()).get();
        assertEquals(loaded, orderItem);
    }
}
