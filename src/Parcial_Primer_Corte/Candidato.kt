package Parcial_Primer_Corte
// Variables que almacenan la cantidad de votos por cada voto
class Candidato(val nombre: String) {
    var votosInternet = 0
    var votosRadio = 0
    var votosTV = 0
// Valores que se dan para que sean contantes para los costos por casa voto dependiendo la seleccion de la piublicidad
    private val costoInternet = 700000
    private val costoRadio = 200000
    private val costoTV = 600000
 // Metodo para registrar un voto Segun  el medio Publicitario
    fun votar(medio: Int) {
        when (medio) {
            1 -> votosInternet++
            2 -> votosRadio++
            3 -> votosTV++
            else -> println("Medio no válido.")
        }
    }
 // Metodd para calcular el costo total de la compañia
    fun costoTotalCampaña(): Int {
        return (votosInternet * costoInternet) + (votosRadio * costoRadio) + (votosTV * costoTV)
    }
 // Metodo para obtener el total de votos por candidato
    fun totalVotos(): Int {
        return votosInternet + votosRadio + votosTV
    }
}