package idea.collections

fun main() {
    val salarios = DoubleArray(size = 3)
    salarios[0] = 800.00
    salarios[1] = 1500.0
    salarios[2] = 2500.0
    println("Lista de valores salariais")
    salarios.forEach {
        println("Valor:" + it)
    }
    println("-----------------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }
}