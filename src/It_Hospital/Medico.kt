package It_Hospital

// Clase Medico que hereda de EmpleadoPorPlanilla
class Medico(
    dni: String,
    nombre: String,
    apellido: String,
    fechaNacimiento: String,
    direccion: String,
    ciudadProcedencia: String,
    codigoEmpleado: String,
    horasExtras: Int,
    fechaIngreso: String,
    area: String,
    cargo: String,
    salarioMensual: Double,
    porcentajeAdicionalHoraExtra: Double,
    val especialidad: String,
    val servicio: String,
    val numeroConsultorio: Int
) : EmpleadoPorPlanilla(dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo, salarioMensual, porcentajeAdicionalHoraExtra)
