package kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(
      topics = "topic1",
      groupId = "groupId"
  )
  public void listener(String data) {
    System.out.println("Message Received : " + data);
  }
}
