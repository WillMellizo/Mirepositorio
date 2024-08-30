package It_Hospital

// Clase EmpleadoEventual que hereda de Empleado
open class EmpleadoEventual(
    Cedula: String,                // Número de cédula del empleado
    nombre: String,                // Nombre del empleado
    apellido: String,              // Apellido del empleado
    fechaNacimiento: String,       // Fecha de nacimiento del empleado
    direccion: String,             // Dirección del empleado
    ciudadProcedencia: String,     // Ciudad de procedencia del empleado
    codigoEmpleado: String,        // Código único del empleado
    horasExtras: Int,              // Número de horas extras trabajadas
    fechaIngreso: String,          // Fecha de ingreso al trabajo
    area: String,                  // Área o departamento en el que trabaja el empleado
    cargo: String,                // Cargo o puesto del empleado
    val honorariosPorHora: Double, // Honorarios que el empleado recibe por hora trabajada
    val horasTotales: Int,         // Total de horas trabajadas durante el contrato
    val fechaTerminoContrato: String // Fecha en que termina el contrato del empleado
) : Empleado(Cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo) {
    // Esta clase hereda todas las propiedades y métodos de la clase Empleado
}
