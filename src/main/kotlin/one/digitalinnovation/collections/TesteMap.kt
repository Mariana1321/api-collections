package one.digitalinnovation.collections

fun main() {
    //utilizando o map
    val pair: Pair<String, Double> = Pair("João", 1000.0)//recurso Pair
    val map1= mapOf(pair)
    map1.forEach{ (k, v) -> println("chave: $k - valor: $v")}

    val map2= mapOf("Pedro" to 2500.0, "Maria" to 3000.0)// recurso infix
    map2.forEach{ (k, v) -> println("chave: $k - valor: $v")}
}