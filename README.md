# Desafío Operando con arreglos

Este repositorio contiene una serie de programas en Java que procesan y analizan datos de diferentes fuentes. Cada programa tiene una funcionalidad específica descrita a continuación.

## Programas Incluidos

- `Visitas.java`: Calcula el promedio de visitas a una página web.
- `SmartWatch.java`: Limpia y calcula el promedio de pasos registrados por un SmartWatch.
- `MultiplosDeTres.java`: Encuentra y analiza los múltiplos de tres en una serie de números.

## Requisitos

Para ejecutar estos programas, necesitarás:

- Java Development Kit (JDK) versión 11 o superior.

## Instrucciones de Uso

### Visitas

Para calcular el promedio de visitas:

1. Compila el programa:
   ```bash
   javac Visitas.java
   
2. Ejecuta el programa pasando las visitas diarias como argumentos:
   ```bash
   java Visitas 3001 1402 1304 1505
   
Esto imprimirá el promedio de las visitas diarias.

3. Ejemplo de Salida:
   ```bash
   El promedio de visitas es: 1803.0

Observación: La cantidad de elementos (visitas) que recibirá el programa es variable.

### SmartWatch

Para analizar los datos de pasos del SmartWatch:

1. Compila el programa:
   ```bash
   javac SmartWatch.java
   
2. Ejecuta el programa pasando los pasos registrados como argumentos:
   ```bash
   java SmartWatch 300 405 403 506 100020040 45006 -1044
   
Esto mostrará el promedio de los pasos válidos después de limpiar los datos.

3. Ejemplo de Salida:
   ```bash
   El promedio de pasos válidos es: 9324.0

Observación: La cantidad de elementos (pasos) que recibirá el programa es variable.

### MultiplosDeTres
Para encontrar y analizar los múltiplos de tres:

1. Compila el programa:
   ```bash
   javac MultiplosDeTres.java

2. Ejecuta el programa pasando una serie de números como argumentos:
   ```bash
   java MultiplosDeTres 10 20 30 33 21 8 2 61
   
Esto imprimirá la suma y el promedio de los múltiplos de tres encontrados en los datos.

3. Ejemplo de Salida:
   ```bash
   Suma de múltiplos de 3: 84
   Promedio de múltiplos de 3: 28.0

Observación: La cantidad de elementos (números) que recibirá el programa es variable.