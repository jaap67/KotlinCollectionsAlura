package list

class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {
    fun organizarPorAutor(): MutableList<Livro> {
        livros.sortBy { it.autor }
        return livros
    }

    fun ornganizarPorAnoPublicacao(): MutableList<Livro> {
        livros.sortBy { it.anoPublicacao }
        return livros
    }
}