package Colección_libros_electonicos_audiolibros //se crea el paquete el cual contiene el metodo Main.

fun main() {
    // Listas para almacenar libros electrónicos y audiolibros
    val librosElectronicos = mutableListOf<LibroElectronico>()
    val audiolibros = mutableListOf<Audiolibro>()

    while (true) {  // Menú interactivo en un bucle  hasta que el usuario decida salir
        println("\nMenú de Opciones:")
        println("1. Agregar Medio")
        println("2. Mostrar Colección")
        println("3. Mostrar Información del Medio")
        println("4. Eliminar Medio")
        println("5. Salir")
        print("Seleccione una opción: ")

        when (readln().toInt()) {  // Leer la opción seleccionada por el usuario
            1 -> {
                println("¿Qué tipo de medio desea agregar? (1: Libro Electrónico, 2: Audiolibro, 3: Mostrar Lista de Libros Electrónicos, 4: Mostrar Lista de Audiolibros)")
                val tipo = readln().toInt()  // Leer el tipo de medio a agregar

                if (tipo == 1) {  // Si el usuario selecciona agregar un libro electrónico
                    print("Ingrese el título: ")
                    val titulo = readln()  // Leer el título del libro electrónico
                    print("Ingrese el autor: ")
                    val autor = readln()  // Leer el autor del libro electrónico
                    print("Ingrese el año de publicación: ")
                    val añoPublicacion = readln().toInt()  // Leer el año de publicación del libro electrónico
                    print("Ingrese el número de páginas: ")
                    val numeroPaginas = readln().toInt()  // Leer el número de páginas del libro electrónico
                    librosElectronicos.add(LibroElectronico(titulo, autor, añoPublicacion, numeroPaginas))  // Crear un objeto LibroElectronico y agregarlo a la lista
                } else if (tipo == 2) {  // Si el usuario selecciona agregar un audiolibro
                    print("Ingrese el título: ")
                    val titulo = readln()  // Leer el título del audiolibro
                    print("Ingrese el autor: ")
                    val autor = readln()  // Leer el autor del audiolibro
                    print("Ingrese el año de publicación: ")
                    val añoPublicacion = readln().toInt()  // Leer el año de publicación del audiolibro
                    print("Ingrese el nombre del narrador: ")
                    val narrador = readln()  // Leer el nombre del narrador del audiolibro
                    audiolibros.add(Audiolibro(titulo, autor, añoPublicacion, narrador))  // Crear un objeto Audiolibro y agregarlo a la lista
                } else if (tipo == 3) {  // Si el usuario selecciona mostrar la lista de libros electrónicos
                    println("\nLista de Libros Electrónicos:")
                    if (librosElectronicos.isNotEmpty()) {  // Verificar si la lista de libros electrónicos no está vacía
                        librosElectronicos.forEachIndexed { index, libro ->  // Iterar sobre la lista con índice
                            println("${index + 1}. ${libro.titulo}")  // Mostrar el índice y el título del libro electrónico
                        }
                    } else {
                        println("No hay libros electrónicos en la colección.")  // Mensaje si la lista está vacía
                    }
                } else if (tipo == 4) {  // Si el usuario selecciona mostrar la lista de audiolibros
                    println("\nLista de Audiolibros:")
                    if (audiolibros.isNotEmpty()) {  // Verificar si la lista de audiolibros no está vacía
                        audiolibros.forEachIndexed { index, audiolibro ->  // Iterar sobre la lista con índice
                            println("${index + 1}. ${audiolibro.titulo}")  // Mostrar el índice y el título del audiolibro
                        }
                    } else {
                        println("No hay audiolibros en la colección.")  // Mensaje si la lista está vacía
                    }
                } else {
                    println("Opción no válida.")  // Mensaje si la opción no es válida
                }
            }
            2 -> {  // Opción para mostrar toda la colección
                println("\nColección de Medios:")
                println("\nLibros Electrónicos:")
                librosElectronicos.forEach { it.mostrarInformacion() }  // Mostrar información de todos los libros electrónicos
                println("\nAudiolibros:")
                audiolibros.forEach { it.mostrarInformacion() }  // Mostrar información de todos los audiolibros
            }
            3 -> {  // Opción para mostrar la información de un medio específico
                println("¿Qué tipo de medio desea ver? (1: Libro Electrónico, 2: Audiolibro)")
                val tipo = readln().toInt()  // Leer el tipo de medio a mostrar
                if (tipo == 1) {  // Si el usuario selecciona un libro electrónico
                    println("Ingrese el número del libro a mostrar (1 a ${librosElectronicos.size}): ")
                    val indice = readln().toInt() - 1  // Leer el índice del libro a mostrar
                    if (indice in librosElectronicos.indices) {  // Verificar si el índice es válido
                        librosElectronicos[indice].mostrarInformacion()  // Mostrar información del libro seleccionado
                    } else {
                        println("Índice no válido.")  // Mensaje si el índice no es válido
                    }
                } else if (tipo == 2) {  // Si el usuario selecciona un audiolibro
                    println("Ingrese el número del audiolibro a mostrar (1 a ${audiolibros.size}): ")
                    val indice = readln().toInt() - 1  // Leer el índice del audiolibro a mostrar
                    if (indice in audiolibros.indices) {  // Verificar si el índice es válido
                        audiolibros[indice].mostrarInformacion()  // Mostrar información del audiolibro seleccionado
                    } else {
                        println("Índice no válido.")  // Mensaje si el índice no es válido
                    }
                } else {
                    println("Opción no válida.")  // Mensaje si la opción no es válida
                }
            }
            4 -> {  // Opción para eliminar un medio específico
                println("¿Qué tipo de medio desea eliminar? (1: Libro Electrónico, 2: Audiolibro)")
                val tipo = readln().toInt()  // Leer el tipo de medio a eliminar
                if (tipo == 1) {  // Si el usuario selecciona un libro electrónico
                    println("Ingrese el número del libro a eliminar (1 a ${librosElectronicos.size}): ")
                    val indice = readln().toInt() - 1  // Leer el índice del libro a eliminar
                    if (indice in librosElectronicos.indices) {  // Verificar si el índice es válido
                        librosElectronicos.removeAt(indice)  // Eliminar el libro de la lista
                        println("Libro electrónico eliminado correctamente.")  // Mensaje de confirmación
                    } else {
                        println("Índice no válido.")  // Mensaje si el índice no es válido
                    }
                } else if (tipo == 2) {  // Si el usuario selecciona un audiolibro
                    println("Ingrese el número del audiolibro a eliminar (1 a ${audiolibros.size}): ")
                    val indice = readln().toInt() - 1  // Leer el índice del audiolibro a eliminar
                    if (indice in audiolibros.indices) {  // Verificar si el índice es válido
                        audiolibros.removeAt(indice)  // Eliminar el audiolibro de la lista
                        println("Audiolibro eliminado correctamente.")  // Mensaje de confirmación
                    } else {
                        println("Índice no válido.")  // Mensaje si el índice no es válido
                    }
                } else {
                    println("Opción no válida.")  // Mensaje si la opción no es válida
                }
            }
            5 -> {  // Opción para salir del programa
                println("Saliendo del programa.")
                return  // Termina la ejecución de la función main, y por lo tanto, el programa
            }
            else -> {
                println("Opción no válida.")  // Mensaje si la opción no es válida
            }
        }
    }
}