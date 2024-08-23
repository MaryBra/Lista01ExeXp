package exe04

class Lista(var nomes: Array<String>) {

    fun ordenar(): Array<String> {
        val listaOrdenada = nomes.copyOf()
        listaOrdenada.sort()
        return listaOrdenada
    }

    fun programa() {
        println("Digite 10 nomes:")

        val nomesList = mutableListOf<String>()


        for (cont in 1..10)
        {
            println("Informe o nome $cont:")
            val nome = readLine() ?: ""
            nomesList.add(nome)
        }

        nomes = nomesList.toTypedArray()
        val resultado = ordenar()

        println("Lista ordenada:")
        resultado.forEach { println(it) }
    }
}
