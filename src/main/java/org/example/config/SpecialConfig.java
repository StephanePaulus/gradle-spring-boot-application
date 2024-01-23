/*
package org.example.config;

import java.util.Map;

import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import org.apache.kafka.common.serialization.ByteArraySerializer;
import org.apache.kafka.common.serialization.BytesSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.common.utils.Bytes;
import org.example.service.ProtobufSerializer;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.DelegatingByTypeSerializer;

@Configuration(proxyBeanMethods = false)
public class SpecialConfig {

  @Bean
  public ProducerFactory<?, ?> producerFactory(KafkaProperties kafkaProperties) {
    return new DefaultKafkaProducerFactory<>(kafkaProperties.buildProducerProperties(),
        null, new DelegatingByTypeSerializer(Map.of(
        Message.class, new ProtobufSerializer(),
        byte[].class, new ByteArraySerializer(),
        Bytes.class, new BytesSerializer(),
        String.class, new StringSerializer()),true));
  }
}

*/
