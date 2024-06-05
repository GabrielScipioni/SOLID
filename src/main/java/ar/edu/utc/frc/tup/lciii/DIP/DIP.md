<div align="center">

# Dependency Inversion Principle


Este principio establece dos reglas claves:

- que un módulo de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de Abstracciones
- las abstracciones no deben depender de los detalles. Los detalles deben depender de las abstracciones
---

en este proyecto veremos de manera simple un ejemplo del principio, haremos un servicio de mensajeria donde tendremos una Abstracion llamada [NotificacionService.](src/main/java/ar/edu/utn/frc/tup/lciii/Abstracion/NotificacionService.java) Módulos de Bajo Nivel que implementaran la abstraccion, estos modulos tendran que ser la representacion de un servicio de Email y otro de MSM.

Por ultimo tenemos un módulo de Alto Nivel que **dependera** de la abstraccion para Servir un mensaje al usuario en pantalla


para entender mejor el contexto haremos una divicion entre modulos de Bajo nivel y alto nivel

|Alto Nivel| Bajo Nivel                                                                                                                                                          |
|----------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|se encargan de la logica del negocio y las politicas generales del sistema. Normalmente, toman decisiones sobre el flujo de control del programa| Son componentes que se encargan de tareas concreats y especificas como la comunicacion con BD, el Hardware o la implementacion de servicios especificos por ejemplo |

</div>