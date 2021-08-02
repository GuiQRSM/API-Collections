package idea.collections

fun main() {
    val erick = Funcionario("Erick", 5000.0, "pj", "Matutino")
    val afonso = Funcionario("Afonso", 2000.0, "CLT", "Noturno")
    val nubia = Funcionario("Nubia", 8000.0, "PJ", "Matutino")
    val ricardo = Funcionario("Ricardo", 4200.0, "PJ", "Vespertino")

    val quadro1 = setOf(erick, nubia, afonso)
    val quadro2 = setOf(ricardo)

    val uniquadro = quadro1.union(quadro2)
    uniquadro.forEach { println(it) }

    println("SUB------------------------------------")
    val quadro3 = setOf(erick, nubia, afonso, ricardo)
    val quadrosub = quadro3.subtract(quadro2)
    quadrosub.forEach { println(it) }

    println("INT-------------------------------------")
    val quadroint = quadro1.intersect(quadro3)
    quadroint.forEach { println(it) }
}