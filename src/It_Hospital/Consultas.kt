package It_Hospital

object Consultas {
    private val especialidades = listOf("Cardiología", "Dermatología", "Neurología", "Pediatría")
    private val servicios = listOf("Consulta General", "Urgencias", "Control de Enfermedades Crónicas")
    private val cargos = listOf("Médico General", "Especialista", "Cirujano")
    private val areas = listOf("Cardiología", "Dermatología", "Neurología", "Pediatría", "Ginecología", "Cirugía General", "Medicina Interna")
    private val tiposServicios = listOf("Consulta General", "Urgencias", "Chequeo Anual", "Rehabilitación", "Cirugía Programada", "Exámenes Diagnósticos")
    private val cargosMedicos = listOf("Médico General", "Especialista en Cardiología", "Especialista en Dermatología", "Cirujano", "Internista", "Ginecólogo")
    private val sexos = listOf("Masculino", "Femenino", "Otro", "Prefiere no decir")
    private val gruposSanguineos = listOf("A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-")
    private val estadosCiviles = listOf("Soltero", "Casado", "Divorciado", "Viudo", "En Unión Libre")

    fun mostrarOpciones(lista: List<String>, mensaje: String): String {
        println(mensaje)
        lista.forEachIndexed { index, item ->
            println("${index + 1}. $item")
        }
        print("Seleccione una opción: ")
        val seleccion = readln().toIntOrNull()
        return if (seleccion != null && seleccion in 1..lista.size) {
            lista[seleccion - 1]
        } else {
            println("Opción no válida. Selección por defecto: ${lista.first()}")
            lista.first()
        }
    }

    fun seleccionarEspecialidad(): String {
        return mostrarOpciones(especialidades, "\n--- Seleccione una Especialidad ---")
    }

    fun seleccionarServicio(): String {
        return mostrarOpciones(servicios, "\n--- Seleccione un Servicio ---")
    }

    fun seleccionarCargo(): String {
        return mostrarOpciones(cargosMedicos, "\n--- Seleccione un Cargo ---")
    }

    fun seleccionarArea(): String {
        return mostrarOpciones(areas, "\n--- Seleccione un Área ---")
    }

    fun seleccionarTipoServicio(): String {
        return mostrarOpciones(tiposServicios, "\n--- Seleccione un Tipo de Servicio ---")
    }

    fun seleccionarSexo(): String {
        return mostrarOpciones(sexos, "\n--- Seleccione el Sexo ---")
    }

    fun seleccionarGrupoSanguineo(): String {
        return mostrarOpciones(gruposSanguineos, "\n--- Seleccione un Grupo Sanguíneo ---")
    }

    fun seleccionarEstadoCivil(): String {
        return mostrarOpciones(estadosCiviles, "\n--- Seleccione el Estado Civil ---")
    }

    // Función para listar médicos por especialidad
    fun listarMedicosPorEspecialidad(medicos: List<Medico>) {
        println("\n--- Listar Médicos por Especialidad ---")
        print("Ingrese la especialidad a buscar: ")
        val especialidadBuscada = readln()

        val medicosEspecialidad = medicos.filter { it.especialidad == especialidadBuscada }

        if (medicosEspecialidad.isEmpty()) {
            println("No se encontraron médicos con la especialidad $especialidadBuscada.\n")
        } else {
            println("Médicos con especialidad en $especialidadBuscada:")
            medicosEspecialidad.forEach {
                println("${it.nombre} ${it.apellido} - Consultorio: ${it.numeroConsultorio}")
            }
            println()
        }
    }

    // Función para listar pacientes por médico
    fun listarPacientesPorMedico(citasMedicas: List<CitaMedica>) {
        println("\n--- Listar Pacientes por Médico ---")
        print("Ingrese el código del médico: ")
        val codigoMedicoBuscado = readln()

        val pacientesAtendidos = citasMedicas.filter { it.medico.codigoEmpleado == codigoMedicoBuscado }

        if (pacientesAtendidos.isEmpty()) {
            println("No se encontraron pacientes atendidos por el médico con código $codigoMedicoBuscado.\n")
        } else {
            println("Pacientes atendidos por el médico con código $codigoMedicoBuscado:")
            pacientesAtendidos.forEach {
                println("${it.paciente.nombre} ${it.paciente.apellido}")
            }
            println()
        }
    }

    // Funciones para listar todos los registros
    fun listarMedicos(medicos: List<Medico>) {
        println("\n--- Listar Médicos ---")
        if (medicos.isEmpty()) {
            println("No hay médicos registrados.\n")
        } else {
            medicos.forEach {
                println("${it.nombre} ${it.apellido} - Especialidad: ${it.especialidad}")
            }
            println()
        }
    }

    fun listarPacientes(pacientes: List<Paciente>) {
        println("\n--- Listar Pacientes ---")
        if (pacientes.isEmpty()) {
            println("No hay pacientes registrados.\n")
        } else {
            pacientes.forEach {
                println("${it.nombre} ${it.apellido} - Historia Clínica: ${it.numeroHistoriaClinica}")
            }
            println()
        }
    }

    fun listarCitasMedicas(citasMedicas: List<CitaMedica>) {
        println("\n--- Listar Citas Médicas ---")
        if (citasMedicas.isEmpty()) {
            println("No hay citas médicas registradas.\n")
        } else {
            citasMedicas.forEach {
                println("Paciente: ${it.paciente.nombre} ${it.paciente.apellido}, Médico: ${it.medico.nombre} ${it.medico.apellido}, Fecha: ${it.fecha}, Hora: ${it.hora}, Servicio: ${it.servicio}")
            }
            println()
        }
    }
}
