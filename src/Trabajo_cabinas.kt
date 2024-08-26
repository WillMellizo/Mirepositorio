// Clase Llamada para almacenar la información de cada llamada
class Llamada(val tipo: String, val duracion: Int) {
    val costo: Int
        get() = when (tipo) {
            "Local" -> duracion * 50
            "Larga Distancia" -> duracion * 350
            "Celular" -> duracion * 150
            else -> 0
        }
}

// Clase Cabina para almacenar las llamadas realizadas en cada cabina
class Cabina(val id: Int) {
    var llamadas: MutableList<Llamada> = mutableListOf()

    // Método para registrar una llamada
    fun registrarLlamada(tipo: String, duracion: Int) {
        llamadas.add(Llamada(tipo, duracion))
    }

    // Método para mostrar la información detallada de la cabina
    fun mostrarInformacion() {
        var totalLlamadas = 0
        var totalDuracion = 0
        var totalCosto = 0

        for (llamada in llamadas) {
            totalLlamadas++
            totalDuracion += llamada.duracion
            totalCosto += llamada.costo
        }

        println("Cabina #$id")
        println("Número de llamadas realizadas: $totalLlamadas")
        println("Duración total de las llamadas (minutos): $totalDuracion")
        println("Costo total de las llamadas (pesos): $totalCosto")
    }

    // Método para reiniciar la cabina
    fun reiniciar() {
        llamadas.clear()  // Vacía la lista de llamadas
        println("Cabina #$id ha sido reiniciada.")
    }
}

// Clase Empresa para manejar múltiples cabinas
class Empresa {
    var cabinas: MutableList<Cabina> = mutableListOf()

    // Método para agregar una cabina
    fun agregarCabina(cabina: Cabina) {
        cabinas.add(cabina)
    }

    // Método para mostrar el consolidado total de la información de todas las cabinas
    fun mostrarConsolidadoTotal() {
        var totalLlamadas = 0
        var totalDuracion = 0
        var totalCosto = 0

        for (cabina in cabinas) {
            totalLlamadas += cabina.llamadas.size
            for (llamada in cabina.llamadas) {
                totalDuracion += llamada.duracion
                totalCosto += llamada.costo
            }
        }

        val costoPromedioPorMinuto = if (totalDuracion > 0) totalCosto / totalDuracion else 0

        println("Consolidado Total:")
        println("Número total de llamadas realizadas: $totalLlamadas")
        println("Duración total de llamadas (minutos): $totalDuracion")
        println("Costo total de las llamadas (pesos): $totalCosto")
        println("Costo promedio por minuto (pesos): $costoPromedioPorMinuto")
    }
}
