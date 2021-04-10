package one.digitalinnovation.collections

fun main() {
    val joao= Funcionario("João", 2000.0,"CLT")
    val pedro= Funcionario("Pedro", 1500.0,"PJ")
    val maria= Funcionario("Maria", 4000.0,"CLT")

  //utilizando um recurso para fazer uma lista multável com mutableListOf(permite fazer alterações)
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }


    println("-------List--------")
    // adicionando novo funcionário na lista multável
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-------List--------")
    // Removendo funcionário da lista multável
    funcionarios.remove(pedro)
    funcionarios.forEach { println(it) }
    println("-------Set--------")
    // utilizando o recurso multablesetOf
    val funcionariosSet= mutableSetOf(joao)
   // funcionariosSet.forEach { println(it) }
    //fazendo adição de novos funcionários
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }
    println("---------------")
    // Removendo funcionário da lista multável
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }

}