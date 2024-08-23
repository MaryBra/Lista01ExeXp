package exe06

class Temperatura(private val temperaturas: DoubleArray) {

    // Função para calcular a temperatura média
    fun calcularMedia(): Double {
        return temperaturas.average()
    }

    // Função para encontrar a temperatura máxima e o dia em que ocorreu
    fun encontrarMaxima(): Pair<Double, Int> {
        val maxTemperatura = temperaturas.maxOrNull() ?: Double.NaN
        val diaMaxima = temperaturas.indexOfFirst { it == maxTemperatura } + 1
        return Pair(maxTemperatura, diaMaxima)
    }

    // Função para encontrar a temperatura mínima e o dia em que ocorreu
    fun encontrarMinima(): Pair<Double, Int> {
        val minTemperatura = temperaturas.minOrNull() ?: Double.NaN
        val diaMinima = temperaturas.indexOfFirst { it == minTemperatura } + 1
        return Pair(minTemperatura, diaMinima)
    }

    // Função para exibir as informações
    fun exibirInformacoes() {
        val media = calcularMedia()
        val (maxima, diaMaxima) = encontrarMaxima()
        val (minima, diaMinima) = encontrarMinima()

        println("Temperatura média do mês: %.2f".format(media))
        println("Temperatura máxima: %.2f no dia $diaMaxima".format(maxima))
        println("Temperatura mínima: %.2f no dia $diaMinima".format(minima))
    }
}