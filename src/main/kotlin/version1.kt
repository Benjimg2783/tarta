fun imprimirVelas(edad: Int) {
    repeat(edad) { print("\'") }
    println()
    repeat(edad) { print('|') }
    println()
}

fun imprimirCapaSup(edad: Int) {
    repeat(edad) { print('=') }
    println()
}

fun imprimirCaracteresMensaje(edad: Int) {
    var a = edad
    repeat(5) {
        print('"')
        a -= 1
        print('-')
        a -= 1
        print('.')
        a -= 1
        print('_')
        a -= 1
        print('.')
        a -= 1
        print('-')
        a -= 1
        println()
    }
}

fun imprimirMensaje(edad: Int, mensaje: String) {
    repeat(15 - (mensaje.length / 2)) { print(' ') }
    println(mensaje.uppercase())
}

fun imprimirCapasInf(edad: Int, capas: Int) = repeat(capas) { repeat(edad) { print('@') };println() }
fun main() {
    var edad = 30
    var capas = 5
    var mensaje = ""
    println("Dime que mensajes deseas imprimir")
    mensaje = readLine()!!
    imprimirVelas(edad)
    imprimirCapaSup(edad)
    imprimirCapasInf(edad, capas)
    imprimirCaracteresMensaje(edad)
    imprimirMensaje(edad, mensaje)
    imprimirCaracteresMensaje(edad)
}