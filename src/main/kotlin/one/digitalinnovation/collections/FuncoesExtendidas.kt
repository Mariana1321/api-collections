package one.digitalinnovation.collections

import  java.math.BigDecimal
//função extendida( Criação do array somatoria do tipo BigDecimal vai reduzir a somatoria de tudo que contém no valor)
fun Array<BigDecimal>.somatoria() = this.reduce{
    acc, valor -> acc + valor
}
//função extendida(Criação do array media para calcular a media da somatoria)
fun Array<BigDecimal>.media() =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()
