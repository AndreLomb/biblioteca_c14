package br.c14lab.biblioteca.dao;

import br.c14lab.biblioteca.model.Usuario;

import java.util.List;

public interface UsuarioDAO {
    void adicionarUsuario(Usuario usuario);
    Usuario buscarPorId(String id);
    List<Usuario> buscarTodos();
    void atualizarUsuario(Usuario usuario);
    void removerUsuario(String id);
    List<Usuario> buscarPorNome(String nome);
}
