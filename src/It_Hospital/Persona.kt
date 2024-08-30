package It_Hospital

// Clase base Persona
open class Persona(
    val Cedula: String,            // Número de cédula o identificación de la persona
    val nombre: String,            // Nombre de la persona
    val apellido: String,          // Apellido de la persona
    val fechaNacimiento: String,   // Fecha de nacimiento de la persona en formato de cadena
    val direccion: String,         // Dirección de la persona
    val ciudadProcedencia: String  // Ciudad de procedencia de la persona
)
