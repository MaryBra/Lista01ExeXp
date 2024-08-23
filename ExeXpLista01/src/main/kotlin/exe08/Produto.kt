package exe08

class Produto(
    val nome: String,
    var quantidade: Int,
    val nivelMinimo: Int,
    val nivelMaximo: Int
) {

    // Função para repor o estoque
    fun reporEstoque() {
        if (quantidade < nivelMinimo) {
            quantidade = nivelMaximo
            println("Estoque do produto '$nome' reposto para o nível máximo de $nivelMaximo.")
        }
    }
}