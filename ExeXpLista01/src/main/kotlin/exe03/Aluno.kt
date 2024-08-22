package exe03

class Aluno (var nome:String, var notas:Array<Double>){

    fun calcularMedia(nota1:Double, nota2:Double, nota3:Double)
    {
        var media = (nota1 + nota2 + nota3)/3;
        var resultado = ""

        if(media >= 7)
        {
            resultado = "Aprovado"
        }
        else
        {
            resultado = "Reprovado"
        }
        return resultado
    }

    fun programa(){
         var cont = 0

        while (cont < 5)
        {
            var input = readLine()

            println("Informa o nome do aluno {$cont +1}:")
            var nome = readLine()

            println("Informa a primeira nota do aluno {$cont +1}:")
            var nota1: Double? = input?.toDoubleOrNull()

            println("Informe a segunda nota do aluno {$cont + 1}")
            var nota2: Double? = input?.toDoubleOrNull()

            println("Informe a terceira nota do aluno {$cont + 1}")
            var nota3: Double? = input?.toDoubleOrNull()

            var resultado = calcularMedia(nota1, nota2, nota3)
        }

    }
}