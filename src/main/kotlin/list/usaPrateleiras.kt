package list

fun main() {
    val prateleira: Prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    val porAutor: MutableList<Livro> = prateleira.organizarPorAutor()
    val porAnoPublicacao: MutableList<Livro> = prateleira.ornganizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()

}