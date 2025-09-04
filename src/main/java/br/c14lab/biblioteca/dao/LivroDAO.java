package br.c14lab.biblioteca.dao;

import br.c14lab.biblioteca.model.Livro;

import java.util.List;

public interface LivroDAO {
    void adicionarLivro(Livro livro);
    Livro buscarPorIsbn(String isbn);
    List<Livro> buscarTodosOsLivros();
    void atualizarLivro(Livro livro);
    void removerLivro(Livro livro);
    List<Livro> buscarPorTituloOuAutor(String titulo, String autor);
}
