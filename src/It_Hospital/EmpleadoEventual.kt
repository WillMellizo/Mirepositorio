package It_Hospital

// Clase EmpleadoEventual que hereda de Empleado
open class EmpleadoEventual(
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
    val honorariosPorHora: Double,
    val horasTotales: Int,
    val fechaTerminoContrato: String
) : Empleado(dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo)
