package idea.collections

fun main() {
    val names = Array(size = 3) {""""""}
    names[0] = "Mario"
    names[1] = "Angelica"
    names[2] = "Fernanda"

    names.sort()
    for(oi in names){
        println(oi)
    }

    println("---------------------------------")

    val names2 = arrayOf("Afonso", "Leila", "Fernanda")
    for(oi in names2){
        println(oi)
    }
}