package idea.collections

fun main() {
    val valores = arrayOf("3000.0".toBigDecimal(), "7000.0".toBigDecimal(), "16000.0".toBigDecimal())

    println("-------EXECUÇAO PRIMEIRA FUNÇAO----------")

    println(valores.somatoria())

    println("-------EXECUÇAO SEGUNDA FUNÇAO----------")

    println(valores.media())

}