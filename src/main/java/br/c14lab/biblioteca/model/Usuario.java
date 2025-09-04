package br.c14lab.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
}
