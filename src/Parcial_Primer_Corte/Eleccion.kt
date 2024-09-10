package Parcial_Primer_Corte
// Lista de candidatos
class Eleccion {
    private val candidatos = listOf(
        Candidato("Candidato 1"),
        Candidato("Candidato 2"),
        Candidato("Candidato 3")
    )
// Contador para los votos en blanco
    private var votosEnBlanco = 0
// Metodo para registrar un voto.
    fun votar() {
        print("Seleccione el candidato (1. Candidato Uno, 2. Candidato Dos, 3. Candidato Tres, 4. Voto en blanco): ")
        // se lee la opcion del candidato.
    val candidato = (readLine()?.toIntOrNull() ?: 0) - 1
        if (candidato in 0..2) {
            println("Seleccione el medio de influencia: 1. Internet, 2. Radio, 3. Televisión")
            val medio = readLine()?.toIntOrNull() ?: 0
            candidatos[candidato].votar(medio)
        } else if (candidato == 3) {
            votosEnBlanco++
            println("Voto en blanco registrado.")
        } else {
            println("Opción no válida.")
        }
    }

    fun calcularCostoCampaña() {
        for (i in candidatos.indices) {
            val candidato = candidatos[i]
            val costo = candidato.costoTotalCampaña()
            println("Costo de campaña para ${candidato.nombre}: $$costo")
        }
    }

    fun vaciarUrnas() {
        for (i in candidatos.indices) {
            candidatos[i].votosInternet = 0
            candidatos[i].votosRadio = 0
            candidatos[i].votosTV = 0
        }
        votosEnBlanco = 0
        println("Urnas vaciadas.")
    }

    fun totalVotos() {
        var total = 0
        for (i in candidatos.indices) {
            total += candidatos[i].totalVotos()
        }
        total += votosEnBlanco
        println("Número total de votos: $total")
    }

    fun porcentajeVotos() {
        val total = candidatos.sumBy { it.totalVotos() } + votosEnBlanco
        if (total > 0) {
            for (i in candidatos.indices) {
                val candidato = candidatos[i]
                val porcentaje = (candidato.totalVotos().toDouble() / total) * 100
                println("Porcentaje de votos para ${candidato.nombre}: ${"%.2f".format(porcentaje)}%")
            }
            val porcentajeBlanco = (votosEnBlanco.toDouble() / total) * 100
            println("Porcentaje de votos en blanco: ${"%.2f".format(porcentajeBlanco)}%")
        } else {
            println("No hay votos registrados.")
        }
    }

    fun costoPromedio() {
        val totalVotos = candidatos.sumBy { it.totalVotos() } + votosEnBlanco
        if (totalVotos > 0) {
            var totalCosto = 0
            for (i in candidatos.indices) {
                totalCosto += candidatos[i].costoTotalCampaña()
            }
            val promedio = totalCosto / totalVotos
            println("El costo promedio de campaña por voto es: $$promedio")
        } else {
            println("No hay votos para calcular el costo promedio.")
        }
    }

    fun mostrarGanador() {
        val votosTotalesPorCandidato = candidatos.map { it.totalVotos() }
        val maxVotos = votosTotalesPorCandidato.maxOrNull()
        val ganadores = candidatos.filter { it.totalVotos() == maxVotos }

        if (maxVotos != null && maxVotos > 0) {
            if (ganadores.size == 1) {
                println("El ganador es ${ganadores[0].nombre} con $maxVotos votos.")
            } else {
                println("Hay un empate entre los siguientes candidatos:")
                for (ganador in ganadores) {
                    println("${ganador.nombre} con $maxVotos votos.")
                }
            }
        } else if (votosEnBlanco > 0) {
            println("No hay ganador, ya que todos los votos fueron en blanco.")
        } else {
            println("No hay votos registrados.")
        }
    }
}