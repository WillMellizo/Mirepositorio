package It_Hospital

// Clase para registrar las citas médicas
class CitaMedica(
    val paciente: Paciente,       // Objeto Paciente asociado a la cita médica
    val medico: Medico,           // Objeto Medico que atenderá la cita
    val fecha: String,            // Fecha de la cita médica, representada como una cadena
    val hora: String,             // Hora de la cita médica, representada como una cadena
    val servicio: String          // Servicio médico para la cita, representado como una cadena
)
