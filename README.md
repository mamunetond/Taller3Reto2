# Taller 3 - Reto 2: API NASA
Prueba automatizada en Java utilizando Insomnia REST y aplicando los principios FIRST

# Flujo completo Reto 2

# Página: https://api.nasa.gov/

# Paso 1:

![image](https://github.com/user-attachments/assets/93620588-d9f9-45aa-b2e2-857ac7e53f11)

Ir a la sección de Generate API Key, luego llenamos los campos que nos piden: nombres, apellidos, correo y nos preguntan ¿para que vamos a usar la API? En este caso decimos que es para un trabajo de la universidad

# Paso 2:

![image](https://github.com/user-attachments/assets/6216f9a5-3125-4674-8012-c70ddfc69264)

Nos llegara un correo con nuestra API Key, la copiamos y pegamos

# Paso 3:

![image](https://github.com/user-attachments/assets/b665e452-8ed1-4ae7-888f-50d0dda04bc5)

Vamos a la sección de Browse API´s y escogemos tres de nuestra preferencia

# Paso 4:

![image](https://github.com/user-attachments/assets/254fdcc7-dc4f-44e0-afbb-eebabf520620)

Interactuamos con la primera API que escoigmos, esta es la APOD, que se traduce al español como la foto astronómica del día. Esta API tiene un método GET.

# Paso 5:

![image](https://github.com/user-attachments/assets/52027bc1-12a3-4a35-83ba-2a2122e2831e)

Interactuamos con nuestra segunda API, esta sirve para ver fotos tomadas por el robot de la NASA llamado Rover en el planeta marte

# Paso 6:

![image](https://github.com/user-attachments/assets/fd3ac168-88f3-4f92-9853-1f0b15f22f44)

Interactuamos con nuestra última API esta nos devuelve toda la información relevante a los asteroides cerca del planeta tierra

# Assertions

## Assertion 1: APOD API

Se valida que la API responda un 200 es decir Sucess

## Assertion 2: Mars Rover Photos API

Se valida que la API responda un 200 es decir Sucess

## Assertion 3: Asteroids - NeoWs API

Se valida que la API responda un 200 es decir Sucess


# Principios FIRST

## Rápidas (Fast): 

Las pruebas deben ser lo más rápidas posible. Como estás haciendo solicitudes a una API externa, la velocidad depende de la latencia de la red. Aquí no hay mucho que modificar, pero si observas que las pruebas tardan mucho, considera usar valores de caché o respuestas simuladas para reducir el tiempo de ejecución.

## Independientes (Independent): 

Cada prueba debe ejecutarse de manera independiente, sin depender de otros tests. Este código ya cumple con este principio porque cada prueba actúa sobre una API diferente y no tiene interdependencias.

## Repetibles (Repeatable): 

Las pruebas deben ser confiables y no fallar o arrojar falsos positivos o negativos.


## Autovalidables (Self-validating): 

Cada prueba debe dar un resultado claro de éxito o falla, lo cual ya se logra con las aserciones en Rest Assured.

## Oportunas (Timely): 

Las pruebas deben poder ejecutarse en cualquier momento del desarrollo sin complejas dependencias externas. Es crucial manejar correctamente las dependencias, como la configuración de la API Key.











































