package one.digitalinnovation.collections

data class Funcionario(
        val nome: String,
        val salario: Double,
        val tipoContratacao: String

    )
    {
        //sobreescrevendo o toString utilizando recursos do kotlin para imprimir mais organizado
        override fun toString(): String =
            """
         Nome: $nome
         Salario: $salario
     """.trimIndent()


    }
