# Aplicación de Control de Gastos Telefónicos

Se requiere crear una aplicación para controlar los gastos telefonicos de una emopresa. la empresa cuenta con N cabinas telefónicas a través de las cuales se pueden realizar llamadas locales, de larga distancia y a celulares, restableciendo sus datos a cero.

## La empresa cuenta con planes telefónicos que establecen las siguientes tarifas:
 1. Minuto llamada Local: $50 pesos 
 2. Minuto LLamada Larga Distancia: $ 350 Pesos 
 3. Minuto llamada Celular: $150 Pesos. 
## Funcionalidades

1. **Registrar Llamada**: Permite registrar una llamada especificando el tipo de llamada (`Local`, `Larga Distancia`, `Celular`) y la duración en minutos.
2. **Mostrar Información Detallada de la Cabina**: Muestra el número total de llamadas realizadas, la duración total de las llamadas en minutos, y el costo total de las llamadas en pesos.
3. **Mostrar Consolidado Total**: Genera un reporte con el número total de llamadas, la duración total en minutos, el costo total en pesos, y el costo promedio por minuto de todas las cabinas.
4. **Reiniciar Cabina**: Restablece los valores de la cabina, eliminando todas las llamadas registradas y dejando los contadores en cero.

## Estructura del Código

- **Clase `Llamada`**: Almacena la información de cada llamada, incluyendo su tipo, duración y costo.
- **Clase `Cabina`**: Mantiene una lista de llamadas realizadas en la cabina y proporciona métodos para registrar llamadas, mostrar información y reiniciar la cabina.
- **Clase `Empresa`**: Administra un conjunto de cabinas y proporciona métodos para agregar cabinas y mostrar el consolidado total.
- **Función `main`**: Punto de entrada de la aplicación, donde se crean instancias de cabinas y empresa, se registran llamadas, se muestra la información y se prueba la funcionalidad de reinicio.

## Ejecución

Para ejecutar el programa, sigue los siguientes pasos:

1. Asegúrate de tener Kotlin instalado en tu sistema.
2. Compila el archivo fuente con el siguiente comando: