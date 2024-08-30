package It_Hospital

// Clase para registrar las citas médicas
class CitaMedica(
    val paciente: Paciente,
    val medico: Medico,
    val fecha: String,
    val hora: String,
    val servicio: String
)
