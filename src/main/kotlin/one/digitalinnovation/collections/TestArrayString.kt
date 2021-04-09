package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0]="Francisca"
    nomes[1]="Antonia"
    nomes[2]="Raquel"
//forma de interação para impressão de valores
    for(nome in nomes){
        println(nome)
    }
    //forma de interação com ordenação de valores
    println("-------------------")
    nomes.sort()
    nomes.forEach { println(it) }
    //forma de interação usando o arrayOf com ordenação
    println("-------------------")
    val nomes2= arrayOf("Maria", "Pedro","Zazá")
    nomes2.sort()
    nomes2.forEach { println(it) }
}