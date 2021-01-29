package list

fun main() {
    val prateleira: Prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.ornganizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()

}