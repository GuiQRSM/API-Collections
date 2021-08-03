package idea.collections

class BC <T> {
    private val dados = mutableMapOf<String, T>()

    fun Implemnt(id: String, Value: T) {
        dados[id] = Value
    }

    fun get(id: String) = dados[id]

    fun getAll() = dados.values
}









