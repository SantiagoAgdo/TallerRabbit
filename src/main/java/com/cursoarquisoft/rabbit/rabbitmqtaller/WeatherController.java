package com.cursoarquisoft.rabbit.rabbitmqtaller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
class WeatherController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/notify")
    public String sendNotification(@RequestBody WeatherNotification notification) {
        rabbitTemplate.convertAndSend(WeatherNotificationApplication.topicExchangeName, "weather.update", notification);
        return "Notificación enviada: " + notification.toString();
    }
}