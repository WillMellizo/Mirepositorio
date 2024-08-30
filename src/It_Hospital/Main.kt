package It_Hospital

fun main() {
    val empleados = mutableListOf<Empleado>()
    val medicos = mutableListOf<Medico>()
    val pacientes = mutableListOf<Paciente>()
    val citasMedicas = mutableListOf<CitaMedica>()

    while (true) {
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

        when (readln().toInt()) {
            1 -> Registrar.registrarMedico(medicos)
            2 -> Registrar.registrarPaciente(pacientes)
            3 -> Registrar.registrarCitaMedica(medicos, pacientes, citasMedicas)
            4 -> Consultas.listarMedicosPorEspecialidad(medicos)
            5 -> Consultas.listarPacientesPorMedico(citasMedicas)
            6 -> mostrarRegistros(medicos, pacientes, citasMedicas)
            7 -> {
                println("Saliendo del sistema...")
                break
            }
            else -> println("Opción no válida. Por favor, intente de nuevo.")
        }
    }
}

fun mostrarRegistros(medicos: List<Medico>, pacientes: List<Paciente>, citasMedicas: List<CitaMedica>) {
    println("\n--- Mostrar Registros ---")
    Consultas.listarMedicos(medicos)
    Consultas.listarPacientes(pacientes)
    Consultas.listarCitasMedicas(citasMedicas)
}
