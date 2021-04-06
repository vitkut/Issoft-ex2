package service;

import data.OrderTestSamples;
import model.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import persistance.OrderStorage;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    private OrderService orderService;
    private OrderStorage orderStorage;

    @BeforeEach
    public void before(){
        orderStorage = Mockito.mock(OrderStorage.class);
        orderService = new OrderService(orderStorage);
    }

    @Test
    void placeOrderTest() {
        //given
        Order order = OrderTestSamples.getValidOrder();

        //then
        assertNotNull(orderService.placeOrder(order));
    }

    @Test
    void placeOrderTest_invalid() {
        //given
        Order order = OrderTestSamples.getInvalidOrder();

        //then
        assertThrows(IllegalArgumentException.class, () -> orderService.placeOrder(order));
    }

    @Test
    void loadAllByUserIdTest() {
        //given
        String userId = "someId";

        //then
        assertNull(orderService.loadAllByUserId(userId));
    }

    @Test
    void loadAllByUserIdTest_invalid() {
        //given
        String userId = "";

        //then
        assertThrows(IllegalArgumentException.class, () -> orderService.loadAllByUserId(userId));
    }
}
