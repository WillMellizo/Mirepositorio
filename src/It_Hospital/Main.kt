package It_Hospital

fun main() {
    // Se crean listas mutables para almacenar los registros de médicos, pacientes y citas médicas
    val empleados = mutableListOf<Empleado>()
    val medicos = mutableListOf<Medico>()
    val pacientes = mutableListOf<Paciente>()
    val citasMedicas = mutableListOf<CitaMedica>()

    // Bucle infinito para el menú principal
    while (true) {
        // Se imprime el menú principal con opciones para el usuario
        println(
            """
            |--- Menú Principal ---
            |1. Registrar un Médico
            |2. Registrar un Paciente
            |3. Registrar una Cita Médica
            |4. Listar Médicos por Especialidad
            |5. Listar Pacientes por Médico
            |6. Mostrar Registros
            |7. Salir
            |Seleccione una opción:
            """.trimMargin()
        )

        // Se lee la opción seleccionada por el usuario y se procesa
        when (readln().toInt()) {
            1 -> Registrar.registrarMedico(medicos) // Llama a la función para registrar un médico
            2 -> Registrar.registrarPaciente(pacientes) // Llama a la función para registrar un paciente
            3 -> Registrar.registrarCitaMedica(medicos, pacientes, citasMedicas) // Llama a la función para registrar una cita médica
            4 -> Consultas.listarMedicosPorEspecialidad(medicos) // Llama a la función para listar médicos por especialidad
            5 -> Consultas.listarPacientesPorMedico(citasMedicas) // Llama a la función para listar pacientes por médico
            6 -> mostrarRegistros(medicos, pacientes, citasMedicas) // Llama a la función para mostrar todos los registros
            7 -> {
                // Imprime un mensaje y sale del bucle para terminar el programa
                println("Saliendo del sistema...")
                break
            }
            else -> println("Opción no válida. Por favor, intente de nuevo.") // Mensaje de error si la opción no es válida
        }
    }
}

// Función para mostrar todos los registros: médicos, pacientes y citas médicas
fun mostrarRegistros(medicos: List<Medico>, pacientes: List<Paciente>, citasMedicas: List<CitaMedica>) {
    println("\n--- Mostrar Registros ---")
    Consultas.listarMedicos(medicos) // Lista todos los médicos
    Consultas.listarPacientes(pacientes) // Lista todos los pacientes
    Consultas.listarCitasMedicas(citasMedicas) // Lista todas las citas médicas
}
