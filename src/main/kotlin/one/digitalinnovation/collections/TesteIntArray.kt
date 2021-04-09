package one.digitalinnovation.collections

fun main() {
    //inicialização do array
    val values = IntArray(5)
    values[0]=1
    values[1]=7
    values[2]=6
    values[3]=3
    values[4]=2
//primeira forma de array
    for (valor in values){
        println(valor)
    }
    println("---------------------------")
//segunda forma de array for lambída
    values.forEach {
        println(it)
    }
    println("---------------------------")
//terceira forma de array
    values.forEach { valor->
        println(valor)
    }
    println("---------------------------")
//quarta forma de array
    for(index in values.indices){
        println(values[index])
    }

    println("---------------------------")
//quinta forma de array ( usando a interação SORT assim fazendo a ordena do menor para o maior)
    values.sort()
    for(valor in values){
        println(valor)
    }

}