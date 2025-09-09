package br.c14lab.biblioteca.implementacao;

import br.c14lab.biblioteca.implementacao.interfaces.UsuarioRegras;
import br.c14lab.biblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioIMPL implements UsuarioRegras {

    //Atributos  ------------------------------------------------------------------------------------
    List<Usuario> usuarios = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------


    //CRITÉRIOS PARA TESTES
    /* JUnit 5.9.2 - veja o jeito de lançar exceções em testes da versão!!
     * Creio não termos necessidade de nenhum mock, já que nossas classes são POJO
     *
     * -- André
     * */

    //Métodos ------------------------------------------------------------------------------------
    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }



    @Override
    public Usuario buscarPorId(String id) {
        for(Usuario u : usuarios )
        {
            if(u.getId().equals(id))
            {
                return u;
            }
        }
        System.out.println("[Usuário não encontrado!]");
        System.out.println("-------------------------");

        return null;
        //TODO USUARIO NãO ENCONTRADO EXCEPTION
    }

    /*UTTILIZAR @Before OU Ñ, CEIS QUE SABEM*/

    @Override
    public void mostrarTodosUsuarios() {
        for(Usuario u : usuarios )
        {
            System.out.println("[Usuário " + u.getId() + ": " + u.getNome() + "]");
            System.out.println("-------------------------");
        }
    }


    /*  _testAtualizarUsuario_
    *
    * Ver se todas as seções dos métodos estão em ordem,
    * provavelmente terá de usar mais de uma assertion
    * -- André
    * */
    @Override
    public void atualizarUsuario(Usuario usuario) {
        int atualizar;

        System.out.println("[Qual informação deseja atualizar do usuario " + usuario.getNome() + " :]");
        System.out.println("[1 - Nome       ]");
        System.out.println("[2 - Email      ]");
        System.out.println("[3 - Telefone   ]");
        System.out.println("[4 - Endereco   ]");
        System.out.println("-------------------------");

        atualizar = sc.nextInt();

        if (atualizar == 1)
        {
            String nome;
            System.out.println("[Digite o novo nome: ]");
            nome = sc.nextLine();

            usuario.setNome(nome);
            System.out.println("[Nome atualizado com sucesso!]");
            System.out.println("-------------------------");
        }
        else if (atualizar == 2)
        {
            String email;
            System.out.println("[Digite o novo email: ]");
            email = sc.nextLine();
            usuario.setEmail(email);
            System.out.println("[Email atualizado com sucesso!]");
            System.out.println("-------------------------");
        }
        else if (atualizar == 3)
        {
            String telefone;
            System.out.println("[Digite o novo telefone: ]");
            telefone = sc.nextLine();
            usuario.setTelefone(telefone);
            System.out.println("[Telefone atualizado com sucesso!]");
            System.out.println("-------------------------");
        }
        else if (atualizar == 4)
        {
            String endereco;
            System.out.println("[Digite o novo endereco: ]");
            endereco = sc.nextLine();
            usuario.setEndereco(endereco);
            System.out.println("[Endereco atualizado com sucesso!]");
            System.out.println("-------------------------");
        }

        sc.close(); //Fecha o scanner
    }


    /*  testeUsuarioNaoEncontradoException;
    *
    * testar o lançamento da exceção, assim como a remoção normal
    * -- André
    * */
    @Override
    public void removerUsuario(String id) {
        Usuario usuarioParaRemover = null;

        for(Usuario u : usuarios )
        {
            if(u.getId().equals(id))
            {
                usuarioParaRemover = u;
                break;
            }
        }

        if (usuarioParaRemover != null)
        {
            usuarios.remove(usuarioParaRemover);
            System.out.println("[Usuário com ID " + id + " removido com sucesso.]");
            System.out.println("-------------------------");
        }
        else
        {
            System.out.println("[Usuário não encontrado!]");
            System.out.println("-------------------------");
            //TODO USUARIO NãO ENCONTRADO EXCEPTION
        }
    }


    /*  testeUsuarioNaoEncontradoException
    *
    * tembém testar o lançamento de exceção, e a busca do usuário*/
    @Override
    public Usuario buscarPorNome(String nome) {
        for(Usuario u : usuarios )
        {
            if(u.getNome().equals(nome))
            {
                return u;
            }
        }
        System.out.println("[Usuário não encontrado!]");
        System.out.println("-------------------------");

        return null;
        //TODO USUARIO NãO ENCONTRADO EXCEPTION
    }
    //-------------------------------------------------------------------------------------------------



}
