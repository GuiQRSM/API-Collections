package idea.collections

fun main() {
    val erick = Funcionario("Erick", 5000.0, "pj", "Matutino")
    val afonso = Funcionario("Afonso", 2000.0, "CLT", "Noturno")
    val nubia = Funcionario("Nubia", 8000.0, "PJ", "Matutino")

    val Funcionario = listOf(erick, afonso, nubia)
    Funcionario.forEach { println(it) }

    println("----------------------------------")
    println(Funcionario.find { it.nome == "Afonso" })

    println("----------------------------------")
    Funcionario.sortedBy { it.salario }
               .forEach { println(it) }

    println("----------------------------------")
    Funcionario.groupBy { it.tipocontatado }
               .forEach { println(it) }

    println("----------------------------------")
    Funcionario.groupBy { it.periodo }
               .forEach { println(it) }



}

