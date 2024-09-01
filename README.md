# Taller RabbitMQ y Spring Boot diploamdo

Este proyecto implementa un sistema simple pero efectivo de notificaciones de clima utilizando RabbitMQ como broker de mensajes y Spring Boot como framework de aplicación.

## Descripción

El sistema consta de un productor que envía notificaciones de clima y un consumidor que las recibe y procesa. Utiliza RabbitMQ para gestionar la cola de mensajes, permitiendo una comunicación asíncrona y desacoplada entre los componentes.

## Características

- Productor de notificaciones de clima (REST API)
- Consumidor de notificaciones
- Integración con RabbitMQ
- Serialización/deserialización JSON de mensajes
- Uso de intercambio de temas para enrutamiento flexible

## Requisitos previos

- Java 11 o superior
- Maven
- RabbitMQ instalado y en ejecución
- (Opcional) Postman u otro cliente REST para probar la API

```
curl --location 'http://localhost:8080/api/weather/notify' \
--header 'Content-Type: application/json' \
--data '{
    "location": "Bogota",
    "condition": "Soleado",
    "temperature": 19,
    "timestamp": "2024-08-29T14:30:00"
}'
```
