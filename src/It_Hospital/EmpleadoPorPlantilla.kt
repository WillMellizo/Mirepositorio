package It_Hospital

// Clase EmpleadoPorPlanilla que hereda de Empleado
open class EmpleadoPorPlanilla(
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
    val salarioMensual: Double,    // Salario mensual del empleado
    val porcentajeAdicionalHoraExtra: Double // Porcentaje adicional por horas extras trabajadas
) : Empleado(Cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo) {
    // Esta clase hereda todas las propiedades y métodos de la clase Empleado
}
