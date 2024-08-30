# Sistema de Gestión Hospitalaria

Este es un sistema de gestión hospitalaria desarrollado en Kotlin. El sistema permite registrar y gestionar información relacionada con médicos, pacientes y citas médicas. Además, ofrece funcionalidades para consultar y listar esta información de manera eficiente.

## Funcionalidades

- **Registro de Médicos:** Permite registrar médicos con información detallada, como su especialidad, servicio, área de trabajo y más.
- **Registro de Pacientes:** Permite registrar pacientes, incluyendo información sobre su historia clínica, grupo sanguíneo, alergias, etc.
- **Registro de Citas Médicas:** Facilita el registro de citas médicas, asignando médicos y pacientes para cada cita.
- **Consultas:** Ofrece opciones para listar y filtrar médicos, pacientes y citas médicas según diferentes criterios.

## Estructura del Proyecto

El proyecto está dividido en varios archivos Kotlin que contienen las clases y objetos necesarios para su funcionamiento:

### Clases Principales

- **Empleado:** Clase base que contiene atributos comunes a todos los empleados del hospital.
- **EmpleadoPorPlanilla:** Clase que extiende de `Empleado` y añade atributos específicos para empleados por planilla.
- **Medico:** Clase que extiende de `EmpleadoPorPlanilla` y agrega atributos específicos para los médicos.
- **Paciente:** Clase que modela la información de los pacientes.
- **CitaMedica:** Clase para registrar la información de las citas médicas.

### Objetos

- **Registrar:** Contiene funciones para registrar médicos, pacientes y citas médicas.
- **Consultas:** Proporciona funciones para consultar y listar la información registrada, como médicos por especialidad, pacientes por médico, etc.

## Uso del Sistema

### Registro de Médicos

Para registrar un médico, se solicita información detallada como cédula, nombre, apellido, especialidad, área de trabajo, y más. Toda esta información se almacena en una lista de médicos.

### Registro de Pacientes

El registro de pacientes incluye datos como DNI, nombre, apellido, historia clínica, grupo sanguíneo, entre otros. La información se guarda en una lista de pacientes.

### Registro de Citas Médicas

Las citas médicas se registran asociando un paciente y un médico, junto con la fecha, hora y el tipo de servicio.

### Consultas y Listados

El sistema permite realizar consultas, tales como:
- Listar médicos por especialidad.
- Listar pacientes atendidos por un médico específico.
- Listar todos los médicos, pacientes, o citas médicas registradas.

## Ejecución del Proyecto

Para ejecutar el proyecto, sigue estos pasos:

1. Clona el repositorio en tu máquina local.
2. Asegúrate de tener Kotlin configurado en tu entorno de desarrollo.
3. Compila y ejecuta los archivos Kotlin desde tu IDE o línea de comandos.

## Requisitos del Sistema

- **Kotlin:** Asegúrate de tener Kotlin instalado en tu máquina.
- **Java JDK:** Se requiere Java JDK para ejecutar aplicaciones Kotlin.



