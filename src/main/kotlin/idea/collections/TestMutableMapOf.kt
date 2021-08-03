package idea.collections

fun main() {
    val erick = Funcionario("Erick", 5000.0, "pj", "Matutino")
    val afonso = Funcionario("Afonso", 2000.0, "CLT", "Noturno")
    val nubia = Funcionario("Nubia", 8000.0, "PJ", "Matutino")

    val relatorio = BC<Funcionario>()

    relatorio.Implemnt(erick.nome, erick)
    relatorio.Implemnt(afonso.nome, afonso)
    relatorio.Implemnt(nubia.nome, nubia)

    println(relatorio.get(afonso.nome))

    println("---------OPERANTIG getAll---------")

    relatorio.getAll().forEach { println(it) }

}