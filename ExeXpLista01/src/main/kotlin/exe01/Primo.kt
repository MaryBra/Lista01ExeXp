package exe01

class Primo {
    companion object {
        fun numPrimo()
        {
            println("Digite um número inteiro para verificar se é primo:")
            val input = readLine()?.toIntOrNull()

            if (input != null) {
                val numero = input
                if (numero <= 1) {
                    println("$numero não é um número primo.")
                } else if (numero <= 3) {
                    println("$numero é um número primo.")
                } else if (numero % 2 == 0 || numero % 3 == 0) {
                    println("$numero não é um número primo.")
                } else {
                    var isPrimo = true
                    val limite = Math.sqrt(numero.toDouble()).toInt()
                    for (i in 5..limite step 6) {
                        if (numero % i == 0 || numero % (i + 2) == 0) {
                            isPrimo = false
                            break
                        }
                    }
                    if (isPrimo) {
                        println("$numero é um número primo.")
                    } else {
                        println("$numero não é um número primo.")
                    }
                }
            } else {
                println("Entrada inválida. Por favor, digite um número inteiro.")
            }
        }
    }
}