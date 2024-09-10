# Sistema de Administración de Medios Digitales

Estudiante: Wilmer Leonardo Mellizo Reyes

La creación del código Colección_Libros_Electronicos_audiolibros, este se realiza aplicando un uso del 50 % de la IA. Ya que algunos campos como mostrar colección se tuvo que incorporar algunos campos adicionales. 



Este proyecto es un sistema en Kotlin para administrar una colección de medios digitales, que incluye libros electrónicos y audiolibros. Permite agregar, mostrar, y eliminar medios digitales de una colección a través de un menú interactivo en la consola.

## Estructura del Código

### Clases

1. **MedioDigital**: Clase base que representa un medio digital. Contiene las propiedades comunes como `titulo`, `autor`, y `añoPublicacion`, así como un método `mostrarInformacion()` que imprime la información básica del medio digital.

2. **LibroElectronico**: Hereda de `MedioDigital` y representa un libro electrónico. Añade la propiedad `numeroPaginas` y sobrescribe el método `mostrarInformacion()` para incluir la información específica de los libros electrónicos.

3. **Audiolibro**: Hereda de `MedioDigital` y representa un audiolibro. Añade la propiedad `narrador` y sobrescribe el método `mostrarInformacion()` para incluir la información específica de los audiolibros.

### Funciones

- **main()**: Función principal que ejecuta el menú interactivo. Permite al usuario:
    - Agregar medios digitales (libros electrónicos o audiolibros).
    - Mostrar toda la colección de medios digitales.
    - Mostrar información detallada de un medio específico.
    - Eliminar un medio específico de la colección.
    - Salir del programa.

## Cómo Ejecutar el Programa

1. **Clonar el Repositorio**:
 