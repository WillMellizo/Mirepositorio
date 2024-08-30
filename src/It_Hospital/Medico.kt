package It_Hospital

// Clase Medico que hereda de EmpleadoPorPlanilla
class Medico(
    Cedula: String,                // Número de cédula del médico
    nombre: String,                // Nombre del médico
    apellido: String,              // Apellido del médico
    fechaNacimiento: String,       // Fecha de nacimiento del médico
    direccion: String,             // Dirección del médico
    ciudadProcedencia: String,     // Ciudad de procedencia del médico
    codigoEmpleado: String,        // Código único del médico
    horasExtras: Int,              // Número de horas extras trabajadas
    fechaIngreso: String,          // Fecha de ingreso al trabajo
    area: String,                  // Área o departamento en el que trabaja el médico
    cargo: String,                // Cargo o puesto del médico
    salarioMensual: Double,        // Salario mensual del médico
    porcentajeAdicionalHoraExtra: Double, // Porcentaje adicional por horas extras trabajadas
    val especialidad: String,      // Especialidad médica del médico
    val servicio: String,          // Servicio médico en el que trabaja el médico
    val numeroConsultorio: Int     // Número del consultorio del médico
) : EmpleadoPorPlanilla(Cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo, salarioMensual, porcentajeAdicionalHoraExtra) {
    // Esta clase hereda todas las propiedades y métodos de la clase EmpleadoPorPlanilla
}
