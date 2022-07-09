package com.example.practic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class WorksControllerTest {

    @Test
    void contextLoads() {
/*        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 1),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 1)
        );*/
        int x = 2;
        int y = 3;
        assertEquals(5,2+3);
        assertEquals(7,2*3);
    }
}
