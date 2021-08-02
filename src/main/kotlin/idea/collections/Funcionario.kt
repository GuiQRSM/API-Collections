package idea.collections

class Funcionario(
    val nome: String,
    val salario: Double,
    val tipocontatado: String,
    val periodo: String
) {
    override fun toString(): String =
        """
         Nome: $nome
         Salario: $salario
         
        """.trimIndent()
}