package one.digitalinnovation.collections

class Repositorio<T> {
    //utilizando o multableMapOf, assim construindo um banco de dados simples
    private  val map = mutableMapOf<String, T>()

     fun create(id: String, value: T){
         map[id] = value//utilizando o recurso put
     }

    fun findById(id: String){
        map[id]// Utilizando o get retornando o valor da variável
    }
}