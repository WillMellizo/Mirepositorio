import kotlin.math.atan2

class Operaciones(var n1:Double, var n2:Double){

    fun suma  () {
        var suma = n1 + n2
        println("la suma es ${suma}")
    }
    fun resta (){
        var resta = n1 -n2
        println("la resta es ${resta}")
    }
    fun div ():Double{
        return n1/n2
    }
    fun raiz (x:Double){
        var raiz = Math.sqrt(x)
        println(raiz)
    }
    fun cuadrado (c:Double):Double{
        return Math.pow(c,2.0)
    }
}