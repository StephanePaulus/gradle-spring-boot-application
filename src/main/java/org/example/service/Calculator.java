package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Calculator {

  public int sum(final int a, final int b) {
    log.info("Hello {} + {} is {}", a, b, a + b);
    return a + b;
  }

  public int multipy(final int a, final int b) {
    log.info("Hello {} + {} is {}", a, b, a * b);
    return a * b;
  }
}
