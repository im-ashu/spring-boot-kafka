package kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringBootKafkaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootKafkaApplication.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
    return args -> {
      for (int i = 0; i < 10; i++) {
        kafkaTemplate.send("topic1", "hello kafka :)" + i);
      }
    };
  }

}
