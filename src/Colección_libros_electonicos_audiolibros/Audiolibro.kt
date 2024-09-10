package Colección_libros_electonicos_audiolibros //se crea el paquete el cual contiene la clase Audiolibro

class Audiolibro(
    titulo: String,  // Título del audiolibro
    autor: String,   // Autor del audiolibro
    añoPublicacion: Int, // Año de publicación del audiolibro
    val narrador: String // Narrador del audiolibro
) : MedioDigital(titulo, autor, añoPublicacion) {
    // Método para mostrar información específica del audiolibro
    override fun mostrarInformacion() {
        println("Audiolibro -> Título: $titulo, Autor: $autor, Año de Publicación: $añoPublicacion, Narrador: $narrador")
    }
}