package exe07

class Voo(val numeroDoVoo: String, assentos: Int) {
    private val assentosDisponiveis: BooleanArray = BooleanArray(assentos) { true }

    // Função para reservar um assento
    fun reservarAssento(assento: Int): Boolean {
        return if (assento in assentosDisponiveis.indices && assentosDisponiveis[assento]) {
            assentosDisponiveis[assento] = false
            true
        } else {
            false
        }
    }

    // Função para verificar a disponibilidade de um assento
    fun verificarDisponibilidade(assento: Int): Boolean {
        return assento in assentosDisponiveis.indices && assentosDisponiveis[assento]
    }
}