package exe08

fun main() {
    // Lista para armazenar os produtos
    val produtos = mutableListOf<Produto>()

    // Cadastrar 5 produtos
    for (i in 1..5) {
        println("Digite o nome do produto $i:")
        val nome = readLine() ?: "Produto$i" // Nome padrão se a entrada for nula
        println("Digite a quantidade atual do produto $nome:")
        val quantidade = readLine()?.toIntOrNull() ?: 0
        println("Digite o nível mínimo do produto $nome:")
        val nivelMinimo = readLine()?.toIntOrNull() ?: 0
        println("Digite o nível máximo do produto $nome:")
        val nivelMaximo = readLine()?.toIntOrNull() ?: 0

        val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
        produtos.add(produto)
    }

    // Verificar a quantidade de cada produto e repor se necessário
    for (produto in produtos) {
        println("\nProduto: ${produto.nome}")
        println("Quantidade atual: ${produto.quantidade}")
        println("Nível mínimo: ${produto.nivelMinimo}")
        println("Nível máximo: ${produto.nivelMaximo}")

        if (produto.quantidade < produto.nivelMinimo) {
            produto.reporEstoque()
        }
    }
}