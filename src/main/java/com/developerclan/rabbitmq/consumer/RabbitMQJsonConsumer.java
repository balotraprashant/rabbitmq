package com.developerclan.rabbitmq.consumer;

import com.developerclan.rabbitmq.dto.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.json.queue.name}"})
    public void consume(Student student) {
        LOGGER.info(String.format("Received JSON message -> %s", student.toString()));
    }
}
