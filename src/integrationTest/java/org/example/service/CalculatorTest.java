package org.example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class CalculatorTest {

  @Test
  public void testMultiply() {
    Calculator calculator = new Calculator();
    int result = calculator.multipy(5, 5);
    assertEquals(25, result);
  }
}
