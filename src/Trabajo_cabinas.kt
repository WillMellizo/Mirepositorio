class ControlGastosTelefonicos(cantidadCabinas: Int) {
    // Lista mutable que contiene las cabinas. Se inicializa con la cantidad especificada.
    private val listaCabinas: MutableList<Cabina> = MutableList(cantidadCabinas) { Cabina(it + 1) }

    companion object {
        // Tarifas para diferentes tipos de llamadas.
        const val TARIFA_LOCAL = 50
        const val TARIFA_LARGA_DISTANCIA = 350
        const val TARIFA_CELULAR = 150
    }

    init {
        // Verifica que la cantidad de cabinas sea mayor que cero.
        require(cantidadCabinas > 0) { "El número de cabinas debe ser mayor que cero." }
    }

    private data class Cabina(val id: Int) {
        // Variables para contar y almacenar minutos de llamadas.
        var conteoLlamadasLocales: Int = 0
        var minutosLocales: Int = 0
        var conteoLlamadasLargaDistancia: Int = 0
        var minutosLargaDistancia: Int = 0
        var conteoLlamadasCelulares: Int = 0
        var minutosCelulares: Int = 0

        fun registrarLlamada(tipo: String, minutos: Int) {
            // Verifica que la duración de la llamada sea mayor que cero.
            require(minutos > 0) { "La duración de la llamada debe ser mayor que cero." }

            // Actualiza el conteo y los minutos basados en el tipo de llamada.
            when (tipo.lowercase()) {
                "local" -> {
                    conteoLlamadasLocales++
                    minutosLocales += minutos
                }
                "larga distancia" -> {
                    conteoLlamadasLargaDistancia++
                    minutosLargaDistancia += minutos
                }
                "celular" -> {
                    conteoLlamadasCelulares++
                    minutosCelulares += minutos
                }
                else -> throw IllegalArgumentException("Tipo de llamada no válido.")
            }
        }

        fun mostrarInfo() {
            // Calcula el total de llamadas, minutos y costo.
            val totalLlamadas = conteoLlamadasLocales + conteoLlamadasLargaDistancia + conteoLlamadasCelulares
            val totalMinutos = minutosLocales + minutosLargaDistancia + minutosCelulares
            val costoTotal = calcularCostoTotal()

            // Imprime la información de la cabina.
            println("Cabina $id:")
            println("Total de llamadas: $totalLlamadas")
            println("Total de minutos: $totalMinutos")
            println("Costo total: $costoTotal pesos")
        }

        fun reiniciar() {
            // Reinicia todos los contadores y minutos a cero.
            conteoLlamadasLocales = 0
            minutosLocales = 0
            conteoLlamadasLargaDistancia = 0
            minutosLargaDistancia = 0
            conteoLlamadasCelulares = 0
            minutosCelulares = 0
        }

        fun calcularCostoTotal(): Int {
            // Calcula el costo total basado en las tarifas y los minutos.
            return (minutosLocales * TARIFA_LOCAL) +
                    (minutosLargaDistancia * TARIFA_LARGA_DISTANCIA) +
                    (minutosCelulares * TARIFA_CELULAR)
        }

        fun obtenerResumen(): Triple<Int, Int, Int> {
            // Obtiene el resumen de llamadas, minutos y costo total.
            val totalLlamadas = conteoLlamadasLocales + conteoLlamadasLargaDistancia + conteoLlamadasCelulares
            val totalMinutos = minutosLocales + minutosLargaDistancia + minutosCelulares
            val costoTotal = calcularCostoTotal()

            return Triple(totalLlamadas, totalMinutos, costoTotal) // Devuelve como un Triple.
        }
    }

    fun registrarLlamada(idCabina: Int, tipoLlamada: String, minutos: Int) {
        // Obtiene la cabina con el ID proporcionado y registra la llamada.
        val cabina = listaCabinas.getOrNull(idCabina - 1)
            ?: throw IllegalArgumentException("ID de cabina no válido.")
        cabina.registrarLlamada(tipoLlamada, minutos)
    }

    fun mostrarInfoCabina(idCabina: Int) {
        // Obtiene la cabina con el ID proporcionado y muestra su información.
        val cabina = listaCabinas.getOrNull(idCabina - 1)
            ?: throw IllegalArgumentException("ID de cabina no válido.")
        cabina.mostrarInfo()
    }

    fun reiniciarCabina(idCabina: Int) {
        // Obtiene la cabina con el ID proporcionado y la reinicia.
        val cabina = listaCabinas.getOrNull(idCabina - 1)
            ?: throw IllegalArgumentException("ID de cabina no válido.")
        cabina.reiniciar()
        println("Cabina $idCabina reiniciada exitosamente.")
    }

    fun mostrarConsolidadoTotal() {
        var totalLlamadas = 0
        var totalMinutos = 0
        var totalCosto = 0

        // Itera sobre cada cabina para sumar el total de llamadas, minutos y costo.
        for (cabina in listaCabinas) {
            val (llamadas, minutos, costo) = cabina.obtenerResumen()
            totalLlamadas += llamadas
            totalMinutos += minutos
            totalCosto += costo
        }

        // Calcula el costo promedio por minuto.
        val costoPromedioPorMinuto = if (totalMinutos > 0) totalCosto / totalMinutos else 0

        // Imprime el consolidado total.
        println("Consolidado Total:")
        println("Total de llamadas: $totalLlamadas")
        println("Total de minutos: $totalMinutos")
        println("Costo total: $totalCosto pesos")
        println("Costo promedio por minuto: $costoPromedioPorMinuto pesos/minuto")
    }

    fun agregarCabina() {
        // Agrega una nueva cabina con el siguiente ID disponible.
        val nuevaCabinaId = listaCabinas.size + 1
        listaCabinas.add(Cabina(nuevaCabinaId))
        println("Se ha agregado una nueva cabina con ID: $nuevaCabinaId")
    }
}