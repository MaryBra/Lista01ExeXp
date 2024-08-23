package exe02

class Contador {
    companion object{

        fun contPalavras(texto:String): Int
        {
            var contadorPalavras = 0
            var palavra = false

            for(caractere in texto)
            {
                if(caractere.isWhitespace())
                {
                    if(palavra)
                    {
                        palavra = false
                    }
                }
                else
                {
                    if(!palavra)
                    {
                        contadorPalavras++
                        palavra = true
                    }
                }
            }
            return contadorPalavras
        }
    }
}