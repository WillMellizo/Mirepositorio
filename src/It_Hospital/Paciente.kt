package It_Hospital

// Clase Paciente que hereda de Persona
class Paciente(
    Cedula: String,                // Número de cédula del paciente
    nombre: String,                // Nombre del paciente
    apellido: String,              // Apellido del paciente
    fechaNacimiento: String,       // Fecha de nacimiento del paciente
    direccion: String,             // Dirección del paciente
    ciudadProcedencia: String,     // Ciudad de procedencia del paciente
    val numeroHistoriaClinica: String, // Número de historia clínica del paciente
    val sexo: String,              // Sexo del paciente (masculino, femenino, etc.)
    val grupoSanguineo: String,    // Grupo sanguíneo del paciente
    val alergias: List<String>     // Lista de alergias del paciente
) : Persona(Cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia) {
    // Esta clase hereda todas las propiedades y métodos de la clase Persona
}
