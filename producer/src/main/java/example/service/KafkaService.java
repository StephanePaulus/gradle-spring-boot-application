package example.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.examples.HelloRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaService {

  private final KafkaTemplate<String, HelloRequest> kafkaTemplate;


  public void workPlease() {
    HelloRequest helloRequest = HelloRequest.newBuilder().setName("Hello").build();
    kafkaTemplate.send("test",helloRequest);


  }
}
