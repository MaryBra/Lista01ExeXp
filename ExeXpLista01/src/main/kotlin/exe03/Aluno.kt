package exe03

class Aluno(var nome: String, var notas: Array<Double>) {

    fun calcularMedia(nota1: Double, nota2: Double, nota3: Double): String {
        val media = (nota1 + nota2 + nota3) / 3
        return if (media >= 7) {
            "Aprovado , Média do aluno $nome: $media"
        } else {
            "Reprovado , Média do aluno $nome: $media"
        }
    }

    fun programa() {
        for (cont in 1..5) {
            println("Informe o nome do aluno $cont:")
            val nome = readLine() ?: ""

            println("Informe a primeira nota do aluno $cont:")
            val nota1 = readLine()?.toDoubleOrNull() ?: 0.0

            println("Informe a segunda nota do aluno $cont:")
            val nota2 = readLine()?.toDoubleOrNull() ?: 0.0

            println("Informe a terceira nota do aluno $cont:")
            val nota3 = readLine()?.toDoubleOrNull() ?: 0.0

            val resultado = calcularMedia(nota1, nota2, nota3)
            println("Aluno: $nome, Resultado: $resultado")
        }
    }
}
