package It_Hospital

object Registrar {
    fun registrarMedico(medicos: MutableList<Medico>) {
        println("\n--- Registro de Médico ---")
        print("DNI: ")
        val dniMedico = readln()
        print("Nombre: ")
        val nombreMedico = readln()
        print("Apellido: ")
        val apellidoMedico = readln()
        print("Fecha de nacimiento (dd/MM/yyyy): ")
        val fechaNacimientoMedico = readln()
        print("Dirección: ")
        val direccionMedico = readln()
        print("Ciudad de procedencia: ")
        val ciudadProcedenciaMedico = readln()
        print("Código de Empleado: ")
        val codigoEmpleado = readln()
        print("Horas extras: ")
        val horasExtras = readln().toInt()
        print("Fecha de ingreso (dd/MM/yyyy): ")
        val fechaIngreso = readln()
        val area = Consultas.seleccionarArea()
        val especialidad = Consultas.seleccionarEspecialidad()
        val servicio = Consultas.seleccionarServicio()
        print("Número de consultorio: ")
        val numeroConsultorio = readln().toInt()
        val cargo = Consultas.seleccionarCargo()
        print("Salario mensual: ")
        val salarioMensual = readln().toDouble()
        print("Porcentaje adicional por hora extra: ")
        val porcentajeAdicionalHoraExtra = readln().toDouble()

        val medico = Medico(
            dniMedico, nombreMedico, apellidoMedico, fechaNacimientoMedico, direccionMedico,
            ciudadProcedenciaMedico, codigoEmpleado, horasExtras, fechaIngreso, area, cargo,
            salarioMensual, porcentajeAdicionalHoraExtra, especialidad, servicio, numeroConsultorio
        )
        medicos.add(medico)
        println("Médico registrado exitosamente.\n")
    }

    fun registrarPaciente(pacientes: MutableList<Paciente>) {
        println("\n--- Registro de Paciente ---")
        print("DNI: ")
        val dniPaciente = readln()
        print("Nombre: ")
        val nombrePaciente = readln()
        print("Apellido: ")
        val apellidoPaciente = readln()
        print("Fecha de nacimiento (dd/MM/yyyy): ")
        val fechaNacimientoPaciente = readln()
        print("Dirección: ")
        val direccionPaciente = readln()
        print("Ciudad de procedencia: ")
        val ciudadProcedenciaPaciente = readln()
        print("Número de historia clínica: ")
        val numeroHistoriaClinica = readln()
        val sexo = Consultas.seleccionarSexo()
        val grupoSanguineo = Consultas.seleccionarGrupoSanguineo()
        print("Alergias (separadas por comas): ")
        val alergias = readln().split(",").map { it.trim() }

        val paciente = Paciente(
            dniPaciente, nombrePaciente, apellidoPaciente, fechaNacimientoPaciente,
            direccionPaciente, ciudadProcedenciaPaciente, numeroHistoriaClinica, sexo,
            grupoSanguineo, alergias
        )
        pacientes.add(paciente)
        println("Paciente registrado exitosamente.\n")
    }

    fun registrarCitaMedica(
        medicos: List<Medico>,
        pacientes: List<Paciente>,
        citasMedicas: MutableList<CitaMedica>
    ) {
        println("\n--- Registro de Cita Médica ---")

        if (medicos.isEmpty() || pacientes.isEmpty()) {
            println("Debe registrar al menos un médico y un paciente antes de registrar una cita médica.\n")
            return
        }

        print("DNI del paciente: ")
        val dniPaciente = readln()
        val paciente = pacientes.find { it.dni == dniPaciente }

        if (paciente == null) {
            println("Paciente no encontrado. Por favor, registre el paciente primero.\n")
            return
        }

        print("Código del médico: ")
        val codigoMedico = readln()
        val medico = medicos.find { it.codigoEmpleado == codigoMedico }

        if (medico == null) {
            println("Médico no encontrado. Por favor, registre el médico primero.\n")
            return
        }

        print("Fecha de la cita (dd/MM/yyyy): ")
        val fechaCita = readln()
        print("Hora de la cita (HH:mm): ")
        val horaCita = readln()
        val servicio = Consultas.seleccionarTipoServicio()

        val citaMedica = CitaMedica(
            paciente, medico, fechaCita, horaCita, servicio
        )
        citasMedicas.add(citaMedica)
        println("Cita médica registrada exitosamente.\n")
    }
}
