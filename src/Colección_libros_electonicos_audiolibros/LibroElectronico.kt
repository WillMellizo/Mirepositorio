package Colección_libros_electonicos_audiolibros // se crea el paquete el cual contiene la clase LibroElectornico

class LibroElectronico(
    titulo: String,  // Título del libro electrónico
    autor: String,   // Autor del libro electrónico
    añoPublicacion: Int, // Año de publicación del libro electrónico
    val numeroPaginas: Int // Número de páginas del libro electrónico
) : MedioDigital(titulo, autor, añoPublicacion) {
    // Método para mostrar información específica del libro electrónico
    override fun mostrarInformacion() {
        println("Libro Electrónico -> Título: $titulo, Autor: $autor, Año de Publicación: $añoPublicacion, Número de Páginas: $numeroPaginas")
    }
}
