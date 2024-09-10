import kotlin.math.roundToInt

// Clase para representar a un candidato
data class Candidato(val nombre: String, var votosInternet: Int = 0, var votosRadio: Int = 0, var votosTV: Int = 0) {
    val costoInternet = 700000
    val costoRadio = 200000
    val costoTV = 600000

    // Función que calcula el costo total de campaña del candidato
    fun calcularCostoTotal(): Int {
        return (votosInternet * costoInternet) + (votosRadio * costoRadio) + (votosTV * costoTV)
    }

    // Función que calcula el número total de votos del candidato
    fun totalVotos(): Int {
        return votosInternet + votosRadio + votosTV
    }
}

fun main() {
    val candidatos = mutableListOf(
        Candidato("Candidato A"),
        Candidato("Candidato B"),
        Candidato("Candidato C")
    )

    var totalVotos = 0

    while (true) {
        println("Menú Principal")
        println("1. Votar por candidato")
        println("2. Calcular costo de campaña de un candidato")
        println("3. Vaciar urnas de votación")
        println("4. Conocer número total de votos")
        println("5. Ver porcentaje de votos por candidato")
        println("6. Ver costo promedio de campaña")
        println("7. Mostrar ganador")
        println("8. Salir")

        when (readLine()!!) {
            "1" -> {
                println("Escoge tu candidato (1: A, 2: B, 3: C)")
                val candidatoIndex = readLine()!!.toInt() - 1

                if (candidatoIndex in 0..2) {
                    println("¿Qué medio te influyó? (1: Internet, 2: Radio, 3: TV)")
                    when (readLine()!!.toInt()) {
                        1 -> candidatos[candidatoIndex].votosInternet++
                        2 -> candidatos[candidatoIndex].votosRadio++
                        3 -> candidatos[candidatoIndex].votosTV++
                        else -> println("Opción no válida")
                    }
                    totalVotos++
                } else {
                    println("Candidato no válido")
                }
            }
            "2" -> {
                println("Elige el candidato para calcular el costo (1: A, 2: B, 3: C)")
                val candidatoIndex = readLine()!!.toInt() - 1

                if (candidatoIndex in 0..2) {
                    val costo = candidatos[candidatoIndex].calcularCostoTotal()
                    println("El costo total de campaña del ${candidatos[candidatoIndex].nombre} es: $$costo")
                } else {
                    println("Candidato no válido")
                }
            }
            "3" -> {
                candidatos.forEach {
                    it.votosInternet = 0
                    it.votosRadio = 0
                    it.votosTV = 0
                }
                totalVotos = 0
                println("Urnas vaciadas correctamente")
            }
            "4" -> {
                println("El número total de votos es: $totalVotos")
            }
            "5" -> {
                if (totalVotos == 0) {
                    println("No se han registrado votos.")
                } else {
                    candidatos.forEach {
                        val porcentaje = (it.totalVotos().toDouble() / totalVotos) * 100
                        println("Porcentaje de votos de ${it.nombre}: ${porcentaje.roundToInt()}%")
                    }
                }
            }
            "6" -> {
                if (totalVotos == 0) {
                    println("No hay votos, por lo tanto no se puede calcular el costo promedio.")
                } else {
                    val costoPromedio = candidatos.sumOf { it.calcularCostoTotal() } / totalVotos
                    println("El costo promedio de campaña por voto es: $$costoPromedio")
                }
            }
            "7" -> {
                val ganador = candidatos.maxByOrNull { it.totalVotos() }
                println("El ganador es: ${ganador?.nombre} con ${ganador?.totalVotos()} votos.")
            }
            "8" -> {
                println("Saliendo del sistema...")
                break
            }
            else -> println("Opción no válida")
        }
    }
}
