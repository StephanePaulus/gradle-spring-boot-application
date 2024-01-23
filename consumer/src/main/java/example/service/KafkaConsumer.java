package example.service;

import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializerConfig;
import lombok.extern.slf4j.Slf4j;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.examples.HelloRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class KafkaConsumer {

  @KafkaListener(topics = "test",groupId = "2",id = "2"
      ,properties = {KafkaProtobufDeserializerConfig.SPECIFIC_PROTOBUF_VALUE_TYPE+" org.examples.HelloRequest"})
  public void listenNote(ConsumerRecord<String, HelloRequest> record) {
    //Note.
    System.out.println(record.value().getName());
    System.out.println(record);
  }
}
