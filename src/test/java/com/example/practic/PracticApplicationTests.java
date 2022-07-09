package com.example.practic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PracticApplicationTests {

    @Test
    void contextLoads() throws IllegalAccessException {
        new AuthControllerTest().contextLoads();
        new OrderControllerTest().contextLoads();
        new PhonesControllerTest().contextLoads();
        new WorksControllerTest().contextLoads();
    }
}
