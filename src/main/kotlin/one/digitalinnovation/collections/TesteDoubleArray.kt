package one.digitalinnovation.collections

fun main() {
    //inicialização com DoubleArray
    val salarios= DoubleArray(3)
    salarios[0]= 1000.0
    salarios[1]= 3000.0
    salarios[2]= 500.0
    //forma de interação com for com expressão lambída
    salarios.forEach { println(it) }
    println("--------------")
    //forma de interação com forEachIndexado localiza o índece na ingteração
    salarios.forEachIndexed{index, salario->
    salarios[index]= salario* 1.1
    }
    salarios.forEach { println(it) }
    println("--------------")
    //forma de interação com doubleArrayOf com ordenação de valores
    val salarios2 = doubleArrayOf(1500.0, 1250.0,5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}