package com.cursoarquisoft.rabbit.rabbitmqtaller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
class WeatherConsumer {

    @RabbitListener(queues = WeatherNotificationApplication.queueName)
    public void receiveMessage(WeatherNotification notification) {
        System.out.println("Notificación recibida: " + notification.toString());
    }
}
