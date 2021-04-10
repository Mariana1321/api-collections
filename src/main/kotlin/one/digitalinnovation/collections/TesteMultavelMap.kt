package one.digitalinnovation.collections

fun main() {
    val joao= Funcionario("João", 2000.0,"CLT")
    val pedro= Funcionario("Pedro", 1500.0,"PJ")
    val maria= Funcionario("Maria", 4000.0,"CLT")

   // Fazendo o cadastro de objetos
    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("----------------")
    repositorio.finAll().forEach { println(it) } // trazendo uma coleção de elementos que estão gravadas no map

    println("----------------")
    repositorio.remove(maria.nome)// excluindo funcionário da lista
    repositorio.finAll().forEach { println(it) }// pegando todos os valores e imprimindo no relatório
}