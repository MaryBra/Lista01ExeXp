package exe05

class Dado {

    fun lançarDado(): Int {
        return (1..6).random()
    }

    fun simularLançamentos(numeroDeLançamentos: Int) {
        for (i in 1..numeroDeLançamentos) {
            val dado1 = lançarDado()
            val dado2 = lançarDado()
            val soma = dado1 + dado2
            println("Lançamento $i: Dado 1 = $dado1, Dado 2 = $dado2, Soma = $soma")
        }
    }
}