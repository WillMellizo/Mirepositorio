package Colección_libros_electonicos_audiolibros //se crea el paquete el cual contiene la calse MedioDigital

open class MedioDigital(
    val titulo: String,  // Título del medio digital
    val autor: String,   // Autor del medio digital
    val añoPublicacion: Int // Año de publicación del medio digital
) {
    // Método para mostrar información básica del medio digital
    open fun mostrarInformacion() {
        println("Título: $titulo, Autor: $autor, Año de Publicación: $añoPublicacion")
    }
}
