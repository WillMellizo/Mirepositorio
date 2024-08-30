package It_Hospital

// Clase base Empleado que hereda de Persona
open class Empleado(
    Cedula: String,                // Número de cédula del empleado
    nombre: String,                // Nombre del empleado
    apellido: String,              // Apellido del empleado
    fechaNacimiento: String,       // Fecha de nacimiento del empleado
    direccion: String,             // Dirección del empleado
    ciudadProcedencia: String,     // Ciudad de procedencia del empleado
    val codigoEmpleado: String,    // Código único del empleado
    val horasExtras: Int,          // Número de horas extras trabajadas
    val fechaIngreso: String,      // Fecha de ingreso al trabajo
    val area: String,              // Área o departamento en el que trabaja el empleado
    val cargo: String              // Cargo o puesto del empleado
) : Persona(Cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia) {
    // Esta clase hereda todas las propiedades y métodos de la clase Persona
}
