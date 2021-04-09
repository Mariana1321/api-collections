package one.digitalinnovation.collections

fun main() {
    //inicialização com doubleArrayOf
    val salarios= doubleArrayOf(1000.0,2250.0,4000.0)
    //forma de interação com for normal
    for (salario in salarios){
        println(salario)
    }
    println("-----------------")
   // operação com salarios maiores, menores e a média salarial
    println("Maior salarios:  ${salarios.max()}")
    println("Menor salarios:  ${salarios.min()}")
    println("Média salarial:  ${salarios.average()}")

    // Operação de filtragem de valores
    println("-----------------")
    val salariosMaiorQue2500 =salarios.filter {  it > 2500.0}
    salariosMaiorQue2500.forEach{println(it)}

    println("-----------------")
    //usando expressão Range(entre valores)
    println(salarios.count { it in 2000.0..5000.0 })

    println("-----------------")
    //usando expressão para encontrar valores especificos(semelhança com filter)
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })// testando valor não encontrado(null)
    println("-----------------")
    //usando expressão para encontrar valores especificos onde a expressão seja válida
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })// testando valor não encontrado(false)
}