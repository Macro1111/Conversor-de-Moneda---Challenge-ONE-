# Conversor-de-Moneda---Challenge-ONE
Un programa en Java para convertir entre varias divisas usando datos en tiempo real de una API de cambio de divisas. Incluye un menú interactivo en consola, manejo de excepciones y salida formateada. Utiliza HttpClient y Gson para procesar respuestas JSON de la API.



# Conversor de Divisas

Este proyecto en Java es un conversor de divisas que permite al usuario convertir entre varias monedas a través de una interfaz en consola. Utiliza Exchange Rate API para obtener datos actualizados de los tipos de cambio y la biblioteca `Gson` para procesar la respuesta en formato JSON.

## Tabla de contenidos

- [Requisitos](#requisitos)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Uso](#uso)
- [Ejemplo de Salida](#ejemplo-de-salida)
- [Contribuciones](#contribuciones)

## Requisitos

- **Java 8** o superior
- Biblioteca `Gson` para manejar datos en formato JSON
- Conexión a Internet para acceder a la API de divisas
- Es necesario tener una key para ExchangeRate API https://www.exchangerate-api.com/

## Estructura del Proyecto

### Clases principales

1. **principalConversion**: 
   - Esta es la clase principal que controla el flujo del programa.
   - Proporciona un menú en consola donde el usuario selecciona la divisa de origen, la divisa de destino y la cantidad a convertir.
   - Llama a otras clases para procesar la conversión y mostrar el resultado en consola.

2. **menu**: 
   - Muestra el mensaje de bienvenida y un menú de opciones de conversión al usuario.
   - La clase contiene el mensaje estático con las opciones de divisas que el usuario puede seleccionar.

3. **obtenerDivisas**:
   - Define las divisas de origen y destino según la opción ingresada por el usuario.
   - Retorna una lista que contiene las divisas seleccionadas para su posterior procesamiento.

4. **obtenerCambio**:
   - Realiza la solicitud a la API de cambio de divisas.
   - Recibe una lista de divisas y la cantidad que el usuario desea convertir.
   - Devuelve los datos de la conversión en formato JSON.

5. **recibirJson**:
   - Define una estructura de registro para mapear la respuesta JSON de la API en campos individuales (`base_code`, `target_code`, `conversion_result`), facilitando el acceso a estos datos.

6. **presentacionRespuesta**:
   - Formatea y presenta el resultado de la conversión de divisas en una cadena de texto.
   - Muestra la cantidad inicial, el tipo de cambio, y el resultado final, redondeado a dos decimales, en un mensaje claro para el usuario.

## Uso

1. Ejecuta el programa y verás un menú con opciones de conversión de divisas.
2. Ingresa el número de la opción correspondiente a la conversión deseada (por ejemplo, de USD a ARS).
3. Luego, ingresa la cantidad que deseas convertir.
4. El programa realizará la conversión y mostrará el resultado en consola.

*Es necesario ingresar tu key personal en obtenerCambio.java para el correcto funcionamiento de el programa

## Ejemplo de Salida

```plaintext
***************************************************

Bienvenido al conversor de monedas

Escoja una opcion de el menu de conversion:

1) Dólar(USD) ==> Peso Argentino(ARS)
2) Peso Argentino(ARS) ==> Dolar(USD)
3) Dólar(USD) ==> Real Brasileño(BRL)
4) Real Brasileño(BRL) ==> Dólar(USD)
5) Dólar(USD) ==> Peso Colombiano(COP)
6) Peso Colombiano(COP) ==> Dólar(USD)
7) Salir

***************************************************

Ingresa una opcion:
1
Ingresa la cantidad:
100
La conversion de 100(USD) es igual a 98883(ARS)
```

## Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, realiza un fork del repositorio, realiza tus cambios, y envía un pull request.
