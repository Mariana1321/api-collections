package one.digitalinnovation.collections

fun main() {
    //inicialização com doubleArrayOf
    val salarios= doubleArrayOf(1000.0,2250.0,4000.0)
    //forma de interação com for normal
    for (salario in salarios){
        println(salario)
    }
    println("-----------------")

    println("Maior salarios:  ${salarios.max()}")
    println("Menor salarios:  ${salarios.min()}")
    println("Média salarial:  ${salarios.average()}")

    // Operação de filtragem de valores
    println("-----------------")
    val salariosMaiorQue2500 =salarios.filter {  it > 2500.0}
    salariosMaiorQue2500.forEach{println(it)}
}