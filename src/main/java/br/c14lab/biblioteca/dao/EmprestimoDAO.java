package br.c14lab.biblioteca.dao;

import br.c14lab.biblioteca.model.Emprestimo;

import java.util.List;

public interface EmprestimoDAO {
    void adicionarEmprestimo(Emprestimo emprestimo);
    Emprestimo buscarUsuarioPorID(String id);
    List<Emprestimo> buscarTodosOsEmprestimos(Emprestimo emprestimo);
    void atualizarEmprestimo(Emprestimo emprestimo);
    void removerEmprestimo(String id);
    List<Emprestimo> buscarPorUsuario(String usuarioId);
    List<Emprestimo> buscarEmprestimosAtivos();
}
