package org.example.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class CalculatorTest {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int result = calculator.sum(5,5);
        assertEquals(10,result);
    }

}
