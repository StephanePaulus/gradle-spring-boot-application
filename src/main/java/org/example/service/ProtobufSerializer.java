package org.example.service;

import com.google.protobuf.Message;
import org.apache.kafka.common.serialization.Serializer;

public class ProtobufSerializer implements Serializer<Message> {

  @Override
  public byte[] serialize(String topic, Message data) {
    return data.toByteArray();
  }

  @Override
  public void close() {
    // Close logic if needed
  }
}
