package idea.collections

fun main() {
    val hun: Pair<String, Double> = Pair("Alisson", 500.0)
    val hunfact = mapOf(hun)
    hunfact.forEach { (g, t) -> println("Key: $g - Value: $t") }

    println("-------SECOND CASE--------")

   val exemap = mapOf("Patrick" to 1300.0, "Luana" to 2300.0, "Everson" to 2000.0)
    exemap.forEach { (func, sal) -> println("Funcionári: $func - Salário: $sal") }
}



























/*fun main() {
    val pair: Pair<String, Double> = Pair("Jones", 1000.0)
    val mapinha = mapOf(pair)

    mapinha.forEach { (g, t) -> println("Key: $g - Value: $t" ) }

    println("-------FORMA 2----------")

    val exemap = mapOf("Rodrigo" to 950.0,  "Andrei" to 1020.0, "Ana Liza" to 3000.0)
        exemap.forEach { (g, t) -> println("Key: $g - Value: $t" ) }
}*/