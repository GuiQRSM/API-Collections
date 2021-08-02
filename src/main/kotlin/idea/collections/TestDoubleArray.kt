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

   salarios.forEachIndexed { index, sal ->
       salarios[index] = sal * 1.1
   }
    salarios.forEach { println(it) }
    println("-----------------------------")

   val salarios2 = doubleArrayOf(2800.0, 5000.0, 13000.0)
    salarios2.sort()
    salarios2.forEach {
        println(it)
    }
    println("-------------------------------------------")
    salarios2.forEachIndexed { index, sal2 ->
        salarios2[index] = sal2 * 1.1
    }
    salarios2.forEach { println(it)}
}