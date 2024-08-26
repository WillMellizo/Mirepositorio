//fun main() {
  //  var op=Operaciones(2.0,3.0)
    //op.suma()
    //op.resta()
    //println(op.div())
    //op.raiz(12.0)
   // println(op.cuadrado(4.0))
//}
// Función principal para probar la aplicación
fun main() {
    val empresa = Empresa()

    val cabina1 = Cabina(1)
    cabina1.registrarLlamada("Local", 10)
    cabina1.registrarLlamada("Celular", 5)
    empresa.agregarCabina(cabina1)

    val cabina2 = Cabina(2)
    cabina2.registrarLlamada("Larga Distancia", 3)
    cabina2.registrarLlamada("Local", 15)
    empresa.agregarCabina(cabina2)

    // Mostrar información de cada cabina
    for (cabina in empresa.cabinas) {
        cabina.mostrarInformacion()
    }

    // Mostrar consolidado total
    empresa.mostrarConsolidadoTotal()

    // Reiniciar cabina 1
    cabina1.reiniciar()

    // Mostrar información de cabina 1 después de reiniciar
    cabina1.mostrarInformacion()
}