package br.com.alura.funcional

fun testaFuncoesEscopo() {
    //    Endereco(logradouro = "rua vergueiro", numero = 3185)
//        .let { endereco ->
//            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//        }.let(::println)

//    Endereco(logradouro = "rua vergueiro", numero = 3185)
//        .apply {
//            "$logradouro, $numero".toUpperCase()
//        }.let(::println)

//    Endereco(logradouro = "rua vergueiro", numero = 3185)
//        .run {
//            "$logradouro, $numero".toUpperCase()
//        }.let {enderecoEmMaiusculo: String ->
//            println(enderecoEmMaiusculo)
//        }

//    listOf(Endereco(complemento = "casa"),
//        Endereco(),
//        Endereco(complemento = "apartamento"))
//        .filter { endereco -> endereco.complemento.isNotEmpty() }
//        .let(::println)
//
//    soma(1, 5, resultado = (::println))


    run {
        println("execução do run sem extensão")
    }

    val endereco = Endereco()
//        .also { println("Criando endereço") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))

    soma(1, 5, resultado = (::println))
}


fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}