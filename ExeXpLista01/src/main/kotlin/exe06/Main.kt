package exe06

fun main() {
    val diasNoMes = 30
    val temperaturas = DoubleArray(diasNoMes)

    // Leitura das temperaturas do usuário
    println("Digite as temperaturas diárias para os $diasNoMes dias do mês:")

    for (dia in 1..diasNoMes) {
        print("Dia $dia: ")
        val temperatura = readLine()?.toDoubleOrNull()
        if (temperatura != null) {
            temperaturas[dia - 1] = temperatura
        } else {
            println("Entrada inválida. O valor será definido como 0.0")
            temperaturas[dia - 1] = 0.0
        }
    }

    // Cria uma instância da classe Temperatura e exibe as informações
    val temps = Temperatura(temperaturas)
    temps.exibirInformacoes()
}