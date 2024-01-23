package org.example.service;

import com.example.test.Msg;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaService {

  private final KafkaTemplate<String, Msg> kafkaTemplate1;

  public void workPlease() {
    Msg helloWorld = Msg.newBuilder().setFoo("hello world 456").build();
    Msg helloWorld2 = Msg.newBuilder().setFoo("Test 456").build();
    Msg helloWorld3 = Msg.newBuilder().setFoo("working 456").build();
    Msg helloWorld4 = Msg.newBuilder().setFoo("gcp 456").build();
    Msg helloWorld5 = Msg.newBuilder().setFoo("big query 456").build();
    kafkaTemplate1.send("Hello", "123", helloWorld );
  }
}
