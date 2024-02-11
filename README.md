# Napptilus - Prueba backend

## Requisitos

Solución debe ser Spring como WAR o EAR; utilizando Spring Boot y empaquetando la aplicación en un WAR.
Debe utilizar una h2 database en memoria.

- Acepte como parámetros de entrada: fecha de aplicación, identificador de producto, identificador de cadena.
- Devuelva como datos de salida: identificador de producto, identificador de cadena, tarifa a aplicar, fechas de
  aplicación y precio final a aplicar.

Además:

- Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1
- Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1
- Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1
- Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1
- Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1

## Valorarán

- Diseño de la solución
- Calidad del código
- Resultados correctos en los test unitarios

## Descripción

Organización del código realizada por capas, app/controller/inbound layer => core/domain layer => infra/outbound layer,
en un proyecto real haríamos un maven multimodulo restringiendo la visibilidad de entre capas but... is a little test.

MapStruct da problemas en sus interacciones con Lombok, no quiero invertir más tiempo del ya perdido trackeando el
problema; quito la dependencia y hago mappers a mano.

