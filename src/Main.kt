fun main() {
    val gestorGastos = ControlGastosTelefonicos(1) // Crea una instancia de ControlGastosTelefonicos con 1 cabina inicial.
    var seleccionMenu: Int // Variable para almacenar la opción seleccionada del menú.

    do {
        // Imprime el encabezado del menú de control de gastos telefónicos.
        println("Control de Gastos Telefónicos")
        println("1. Mostrar Consolidado Total") // Opción para mostrar el consolidado total de todas las cabinas.
        println("2. Registrar Llamada") // Opción para registrar una llamada en una cabina.
        println("3. Mostrar Información de Cabina") // Opción para mostrar la información de una cabina específica.
        println("4. Agregar Cabina") // Opción para agregar una nueva cabina.
        println("5. Reiniciar Cabina") // Opción para reiniciar los datos de una cabina específica.
        println("6. Salir") // Opción para salir del programa.
        print("Seleccione una opción: ") // Solicita al usuario que seleccione una opción del menú.

        // Lee la opción seleccionada del usuario y la convierte a un número entero. Si no se puede convertir, usa 0.
        seleccionMenu = readLine()?.toIntOrNull() ?: 0

        // Maneja la opción seleccionada usando una declaración `when`.
        when (seleccionMenu) {
            1 -> {
                // Llama al método para mostrar el consolidado total de todas las cabinas.
                gestorGastos.mostrarConsolidadoTotal()
            }
            2 -> {
                // Solicita al usuario el ID de la cabina donde se registrará la llamada.
                println("Ingrese el ID de la cabina:")
                val idCabina = readLine()?.toIntOrNull() ?: continue // Lee y convierte el ID de la cabina.
                // Solicita al usuario el tipo de llamada (Celular, local, Larga distancia).
                println("Ingrese el tipo de llamada (Celular, local, Larga distancia):")
                val tipoLlamada = readLine()?.lowercase() ?: continue // Lee y convierte el tipo de llamada a minúsculas.
                // Solicita al usuario la duración de la llamada en minutos.
                println("Ingrese la duración de la llamada en minutos:")
                val duracionLlamada = readLine()?.toIntOrNull() ?: continue // Lee y convierte la duración de la llamada.

                try {
                    // Llama al método para registrar la llamada en la cabina especificada.
                    gestorGastos.registrarLlamada(idCabina, tipoLlamada, duracionLlamada)
                    println("Llamada registrada exitosamente.") // Mensaje de éxito.
                } catch (e: IllegalArgumentException) {
                    // Maneja excepciones si el ID de la cabina no es válido o el tipo de llamada no es válido.
                    println("Error: ${e.message}")
                }
            }
            3 -> {
                // Solicita al usuario el ID de la cabina cuya información desea mostrar.
                println("Ingrese el ID de la cabina:")
                val idCabina = readLine()?.toIntOrNull() ?: continue // Lee y convierte el ID de la cabina.

                try {
                    // Llama al método para mostrar la información de la cabina especificada.
                    gestorGastos.mostrarInfoCabina(idCabina)
                } catch (e: IllegalArgumentException) {
                    // Maneja excepciones si el ID de la cabina no es válido.
                    println("Error: ${e.message}")
                }
            }
            4 -> {
                // Llama al método para agregar una nueva cabina.
                gestorGastos.agregarCabina()
            }
            5 -> {
                // Solicita al usuario el ID de la cabina que desea reiniciar.
                println("Ingrese el ID de la cabina:")
                val idCabina = readLine()?.toIntOrNull() ?: continue // Lee y convierte el ID de la cabina.

                try {
                    // Llama al método para reiniciar la cabina especificada.
                    gestorGastos.reiniciarCabina(idCabina)
                } catch (e: IllegalArgumentException) {
                    // Maneja excepciones si el ID de la cabina no es válido.
                    println("Error: ${e.message}")
                }
            }
            6 -> println("PROGRAMA FINALIZADO...") // Mensaje de salida del programa.
            else -> println("Opción no válida. Por favor, intente de nuevo.") // Mensaje si la opción seleccionada no es válida.
        }
    } while (seleccionMenu != 6) // Repite el bucle hasta que el usuario seleccione la opción 6 para salir.
}