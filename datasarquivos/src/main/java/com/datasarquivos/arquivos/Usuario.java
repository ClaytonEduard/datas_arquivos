package com.datasarquivos.arquivos;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Usuario implements Serializable {
    private String nome;
    private String login;
    private String senha;
    private String cpf;
}
