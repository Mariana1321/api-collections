package one.digitalinnovation.collections

class Repositorio<T> {
    //utilizando o multableMapOf, assim construindo um banco de dados simples
    private  val map = mutableMapOf<String, T>()

     fun create(id: String, value: T){
         map[id] = value//utilizando o recurso put
     }

    fun remove(id: String)= map.remove(id)//fazendo a remoção de uma funcionario (exclusão)


    fun findById(id: String)=
        map[id]// Utilizando o get retornando o valor da variável

    fun finAll()= map.values// ele devolve a multable collections resgatando o values

}