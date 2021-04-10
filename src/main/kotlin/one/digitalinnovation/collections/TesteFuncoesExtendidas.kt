package one.digitalinnovation.collections

fun main() {
    //Testando funções extendidas
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )


    println("--------Somatória------------")
    println(salarios.somatoria())
    println("---------Média-----------")
    println(salarios.media())
}