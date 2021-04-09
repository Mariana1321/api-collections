package one.digitalinnovation.collections

fun main() {
    val joao= Funcionario("João", 2000.0,"CLT")
    val pedro= Funcionario("Pedro", 1500.0,"PJ")
    val maria= Funcionario("Maria", 4000.0,"CLT")

    val funcionario1 = setOf(joao,pedro)
    val funcionario2= setOf(maria)
    //fazendo a união dos conjuntos de funcionários
    val resolution=funcionario1.union(funcionario2)
    resolution.forEach{ println(it)}

    println("------------------")
    val funcionario3 = setOf(joao,pedro,maria)
    val resultsubtract=funcionario3.subtract(funcionario2)//subtract-subtraindo o valor de uma coleção3 pelo valor da coleção 2
    resultsubtract.forEach{ println(it)}

    println("------------------")
    val resulInterSet= funcionario3.intersect(funcionario2)// tem a função de trazer apenas o valor em comum entre os conjuntos
  resulInterSet.forEach{ println(it)}


}