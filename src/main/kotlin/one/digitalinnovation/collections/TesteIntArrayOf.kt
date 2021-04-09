package one.digitalinnovation.collections

fun main() {
    //utilizando o recurso intArrayof na inicialização, é uma forma mais flexível para passar a capacidade do array
    val values = intArrayOf(2, 3, 4, 1, 10, 7)
    //forma de interação com forEach
    values.forEach {
        println(it)
    }

    //forma de interação com ordenação do menor para o maior
    println("----------------")
    values.sort()
    values.forEach {
        println(it)
    }
}