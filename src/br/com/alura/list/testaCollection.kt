package br.com.alura.list

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes

    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)


    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = assistiramCursoKotlin + assistiramCursoAndroid
    println(assistiramAmbos.distinct())
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        //Se quisermos expor algum comportamento como static, podemos usar companion object. Estes estão object declarations dentro de uma classe. Esses objetos são inicializados quando a classe contida é resolvida, de maneira semelhante aos métodos static e variáveis do mundo java
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes) {
        println(nome)
    }
}