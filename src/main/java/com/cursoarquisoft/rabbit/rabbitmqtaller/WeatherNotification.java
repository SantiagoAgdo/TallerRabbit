package com.cursoarquisoft.rabbit.rabbitmqtaller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherNotification {
    private String location;
    private String condition;
    private double temperature;
    private LocalDateTime timestamp;
}
