fun imprimirVelas2(edad:Int){
    repeat(edad){print("\'")}
    println()
    repeat(edad){ print('|')}
    println()
}
fun imprimirCapaSup2(edad: Int){
    repeat(edad){ print('=')}
    println()
}
fun imprimirCaracteresMensaje2(edad: Int){
    var a =edad
    if (edad>29) {
        while (a>6) {
            print('"')
            a-=1
            print('-')
            a-=1
            print('.')
            a-=1
            print('_')
            a-=1
            print('.')
            a-=1
            print('-')
            a-=1
        }
        println()
    }else{
        repeat(5){
            print('"')
            a-=1
            print('-')
            a-=1
            print('.')
            a-=1
            print('_')
            a-=1
            print('.')
            a-=1
            print('-')
            a-=1

        }
        println()
    }
}
fun imprimirMensaje2(edad: Int, mensaje:String){
    if (edad>29){
        repeat((edad/2)-(mensaje.length/2)){ print(' ')}
        println(mensaje.uppercase())
    }else{
        repeat(15-(mensaje.length/2)){ print(' ')}
        println(mensaje.uppercase())
    }
}
fun imprimirCapasInf2(edad:Int,capas:Int)= repeat(capas){ repeat(edad){ print('@')};println() }
fun main() {
    var edad=0
    var capas=0
    var mensaje=""
    println("Dime tu edad")
    try { edad=readLine()!!.toInt() }catch (_:Exception){"La edad solo es un numero"}
    println("Dime de cuantas capas quieres tu tarta")
    try {capas= readLine()!!.toInt()}catch (_:Exception){"Las capas solo pueden ser un numero"}
    println("Dime que mensajes deseas imprimir")
    mensaje= readLine()!!
    imprimirCaracteresMensaje2(edad)
    imprimirMensaje2(edad, mensaje)
    imprimirCaracteresMensaje2(edad)
    imprimirVelas2(edad)
    imprimirCapaSup2(edad)
    imprimirCapasInf2(edad,capas)
    imprimirCaracteresMensaje2(edad)
    imprimirMensaje2(edad, mensaje)
    imprimirCaracteresMensaje2(edad)
}