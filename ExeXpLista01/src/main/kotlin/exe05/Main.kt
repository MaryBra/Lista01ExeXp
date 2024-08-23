package exe05

fun main() {

    println("Quantas vezes você deseja lançar os dados?")
    val numeroDeLançamentos = readLine()?.toIntOrNull() ?: 0


    if (numeroDeLançamentos > 0)
    {
        val dados = Dado()
        dados.simularLançamentos(numeroDeLançamentos)
    }
    else
    {
        println("Número de lançamentos inválido. Por favor, insira um número positivo.")
    }
}