package exe07


fun main() {
    // Cria uma instância de Voo com 10 assentos para exemplo
    val voo = Voo("AB123", 10)

    while (true) {
        println("Digite o número do assento que deseja verificar ou reservar (0 para sair):")
        val entrada = readLine()?.toIntOrNull() ?: continue

        if (entrada == 0) break

        when {
            voo.verificarDisponibilidade(entrada) -> {
                println("Assento $entrada disponível.")
                println("Deseja reservar o assento $entrada? (S/N)")
                val resposta = readLine()?.trim()?.toUpperCase()
                if (resposta == "S" && voo.reservarAssento(entrada)) {
                    println("Assento $entrada reservado com sucesso.")
                } else {
                    println("Não foi possível reservar o assento $entrada.")
                }
            }
            else -> {
                println("Assento $entrada não disponível ou inválido.")
            }
        }
    }

    println("Programa encerrado.")
}