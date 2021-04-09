package one.digitalinnovation.collections

fun main() {
    val joao= Funcionario("João", 2000.0,"CLT")
    val pedro= Funcionario("Pedro", 1500.0,"PJ")
    val maria= Funcionario("Maria", 4000.0,"CLT")
//utilizando o ListOf
    val funcionarios= listOf(joao, pedro, maria)
    funcionarios.forEach{ println(it)}

        println("---------------")
        println(funcionarios.find { it.nome== "Maria" })

         println("---------------")
    //utilizando um recurso chamado encadeamento(sortedBy)
        funcionarios.groupBy { it.tipoContratacao }.// agrupando valores
        forEach{ println(it)}// tem a função de finalizar todas as operações atreladas a colecão


    }


data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String

){
    //sobreescrevendo o toString utilizando recursos do kotlin para imprimir mais organizado
    override fun toString(): String =
     """
         Nome: $nome
         Salario: $salario
     """.trimIndent()


}