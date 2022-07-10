package com.example.practic;

import com.example.practic.entity.*;
import com.example.practic.models.NewOrderModel;
import com.example.practic.models.RegModel;
import com.example.practic.repository.*;
import com.example.practic.services.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@SpringBootTest
class OrderControllerTest {

    @InjectMocks
    private OrderService orderService;
    @Mock
    private OrderRepository orderRepository;
    @Mock
    private ClientRepository clientRepository;
    @Mock
    private PhoneRepository phoneRepository;
    @Mock
    private PhoneModelsRepository phoneModelsRepository;
    @Mock
    private OrderStatusRepository orderStatusRepository;
    @Mock
    private StoryOrderMoveRepository storyOrderMoveRepository;

    Client clientTrue = new Client(new RegModel( "family", "name",  "patronymic",  "email",  "phone",  "clpassword"), 1);
    Guarantee guarantee = new Guarantee(1,1,"conditions");
    Manufacturer manufacturer = new Manufacturer(1, "name manufacturer");
    PhoneModel phoneModel = new PhoneModel(1,"namephone","specifications",guarantee,manufacturer);
    OrderStatus orderStatus = new OrderStatus("add_0", "заказ добавлен", 1);
    NewOrderModel newOrderModel_FullTrue = new NewOrderModel(1,"phone","adress",1,"descrition order");
    NewOrderModel newOrderModel_NotFilled = new NewOrderModel(1,"phone",null,1,"descrition order");
    NewOrderModel newOrderModel_NotClient = new NewOrderModel(2,"phone","adress",1,"descrition order");
    NewOrderModel newOrderModel_NotPhone = new NewOrderModel(1,"phone","adress",2,"descrition order");
    Order order = new Order(newOrderModel_FullTrue, clientTrue, phoneModel, 1);

    @Test
    void contextLoads() {

    }
    @Test
    void addingNewOrder_FulTrue() {
        assertTrue(newOrderModel_FullTrue.Truly());

        assertEquals(clientTrue.getId(), newOrderModel_FullTrue.getIdClient());
        doReturn (clientTrue)
                .when(clientRepository)
                .getClientById(newOrderModel_FullTrue.getIdClient());

        assertEquals(phoneModel.getId(), newOrderModel_FullTrue.getIdPhoneModel());
        doReturn (phoneModel)
                .when(phoneModelsRepository)
                .getPhoneModelById(newOrderModel_FullTrue.getIdPhoneModel());

        doReturn(orderStatus)
                .when(orderStatusRepository)
                .getOrderStatusById("add_0");

        assertTrue(orderService.CreateNewOrder(newOrderModel_FullTrue));

        verify(orderRepository, times(1)).save(any());
    }
    @Test
    void addingNewOrder_FailNotFilled() {
        assertFalse(newOrderModel_NotFilled.Truly());

        assertEquals(clientTrue.getId(), newOrderModel_NotFilled.getIdClient());
        doReturn (clientTrue)
                .when(clientRepository)
                .getClientById(newOrderModel_NotFilled.getIdClient());

        assertEquals(phoneModel.getId(), newOrderModel_NotFilled.getIdPhoneModel());
        doReturn (phoneModel)
                .when(phoneModelsRepository)
                .getPhoneModelById(newOrderModel_NotFilled.getIdPhoneModel());

        doReturn(orderStatus)
                .when(orderStatusRepository)
                .getOrderStatusById("add_0");

        assertFalse(orderService.CreateNewOrder(newOrderModel_NotFilled));

        verify(orderRepository, times(0)).save(any());
    }
    @Test
    void addingNewOrder_FailNotClient() {
        assertTrue(newOrderModel_NotClient.Truly());

        assertNotEquals(clientTrue.getId(), newOrderModel_NotClient.getIdClient());
/*        doReturn (clientTrue)
                .when(clientRepository)
                .getClientById(newOrderModel_NotClient.getIdClient());*/

        assertEquals(phoneModel.getId(), newOrderModel_NotClient.getIdPhoneModel());
        doReturn (phoneModel)
                .when(phoneModelsRepository)
                .getPhoneModelById(newOrderModel_NotClient.getIdPhoneModel());

        doReturn(orderStatus)
                .when(orderStatusRepository)
                .getOrderStatusById("add_0");

        assertNull(orderService.CreateNewOrder(newOrderModel_NotClient));

        verify(orderRepository, times(0)).save(any());
    }
    @Test
    void addingNewOrder_FailNotPhone() {
        assertTrue(newOrderModel_NotPhone.Truly());

        assertEquals(clientTrue.getId(), newOrderModel_NotPhone.getIdClient());
        doReturn (clientTrue)
                .when(clientRepository)
                .getClientById(newOrderModel_NotPhone.getIdClient());

        assertNotEquals(phoneModel.getId(), newOrderModel_NotPhone.getIdPhoneModel());
/*        doReturn (phoneModel)
                .when(phoneModelsRepository)
                .getPhoneModelById(newOrderModel_NotPhone.getIdPhoneModel());*/

        doReturn(orderStatus)
                .when(orderStatusRepository)
                .getOrderStatusById("add_0");

        assertNull(orderService.CreateNewOrder(newOrderModel_NotPhone));
        verify(orderRepository, times(0)).save(any());
    }

    @Test
    void settingAgreement_FullTrue(){ // +
        doReturn (order)
                .when(orderRepository)
                .getOrderById(order.getId());

        assertTrue(orderService.OrderSetAgreement(order.getId(), true));
        assertTrue(orderService.OrderSetAgreement(order.getId(), false));
        verify(orderRepository, times(2)).save(any());
    }
    @Test
    void settingAgreement_NotFilledAgree(){ // +
        doReturn (order)
                .when(orderRepository)
                .getOrderById(order.getId());

        assertNull(orderService.OrderSetAgreement(order.getId(), null));
        verify(orderRepository, times(0)).save(any());
    }
    @Test
    void settingAgreement_NotFindOrder(){ // +
/*        doReturn (order)
                .when(orderRepository)
                .getOrderById(order.getId());*/

        assertFalse(orderService.OrderSetAgreement(order.getId()+1, true));
        verify(orderRepository, times(0)).save(any());
    }

    @Test
    void settingPay_FullTrue(){ //
        doReturn (order)
                .when(orderRepository)
                .getOrderById(order.getId());

        assertTrue(orderService.OrderSetPayed(order.getId(), true));
        verify(orderRepository, times(1)).save(any());
    }
    @Test
    void settingPay_NotFilledAgree(){ //
        doReturn (order)
                .when(orderRepository)
                .getOrderById(order.getId());

        assertNull(orderService.OrderSetPayed(order.getId(), null));
        verify(orderRepository, times(0)).save(any());
    }
    @Test
    void settingPay_NotFindOrder(){ //
/*        doReturn (order)
                .when(orderRepository)
                .getOrderById(order.getId());*/

        assertFalse(orderService.OrderSetPayed(order.getId()+1, true));
        verify(orderRepository, times(0)).save(any());
    }

}
