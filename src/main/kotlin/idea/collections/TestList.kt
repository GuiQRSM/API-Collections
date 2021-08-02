package idea.collections

fun main() {
    val erick = Funcionario("Erick", 5000.0, "PJ")
    val afonso = Funcionario("Afonso", 2000.0, "CLT")
    val nubia = Funcionario("Nubia", 8000.0, "PJ")

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



}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipocontatado: String
){
    override fun toString(): String =
        """
         Nome: $nome
         Salario: $salario
         
        """.trimIndent()
    }
