package Parcial_Primer_Corte

fun main() {
    val eleccion = Eleccion()
    var opcion: Int
// Menu principal para mostrar a Usuario las posibles opciones a escoger
    do {
        println("Elecciones Municipio Premier")
        println("1. Votar")
        println("2. Calcular costo de campaña")
        println("3. Vaciar urnas")
        println("4. Número total de votos")
        println("5. Porcentaje de votos por candidato")
        println("6. Costo promedio de campaña")
        println("7. Mostrar el ganador")
        println("8. Salir")
        print("Seleccione una opción: ")
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> eleccion.votar()
            2 -> eleccion.calcularCostoCampaña()
            3 -> eleccion.vaciarUrnas()
            4 -> eleccion.totalVotos()
            5 -> eleccion.porcentajeVotos()
            6 -> eleccion.costoPromedio()
            7 -> eleccion.mostrarGanador()
            8 -> println("Saliendo del programa...")
            else -> println("Opción no válida. Inténtelo de nuevo.")
        }
    } while (opcion != 8)
}