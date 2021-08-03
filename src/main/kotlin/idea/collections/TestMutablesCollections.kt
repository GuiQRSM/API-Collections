package idea.collections

fun main() {
    val erick = Funcionario("Erick", 5000.0, "pj", "Matutino")
    val afonso = Funcionario("Afonso", 2000.0, "CLT", "Noturno")
    val nubia = Funcionario("Nubia", 8000.0, "PJ", "Matutino")

  val mainmuta = mutableListOf(erick, nubia)
    mainmuta.forEach { println(it) }

    println("-------------.ADD()---------------")

   mainmuta.add(afonso)
    mainmuta.forEach { println(it) }

    println("-------------.REMOVE()---------------")

    mainmuta.remove(erick)
    mainmuta.forEach { println(it) }

    println("-------------MUTABLESETOF---------------")

    val conjexe = mutableSetOf(erick)
    conjexe.forEach { println(it) }

    conjexe.add(nubia)
    conjexe.add(afonso)
    conjexe.forEach { println(it) }

    conjexe.remove(nubia)
    conjexe.forEach { println(it) }



}