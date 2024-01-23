package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.service.Calculator;
import org.example.service.KafkaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/")
@AllArgsConstructor
public class CalculatorController {

  private Calculator calculator;
  private KafkaService kafkaService;

  @GetMapping("sum")
  public int sum() {
    log.info("Hello this is the sum method");
    kafkaService.workPlease();
    return calculator.sum(5, 5);
  }
}
