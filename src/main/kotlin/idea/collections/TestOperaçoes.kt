package idea.collections

fun main() {
    val salarios = doubleArrayOf(2000.0, 5000.0, 8000.0)

    for (res in salarios) {
        println(res)
    }

    println("------------------------------------------")

    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Media dos salários: ${salarios.average()}")

   val exemplefilter = salarios.filter { it > 2000.0 }
    println("------------------------------------------")
    exemplefilter.forEach { println(it) }

    println("------------------------------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("------------------------------------------")
    println(salarios.find { it == 8000.0 })

    println("------------------------------------------")
    println(salarios.any { it == 10000.0 })
}