package com.example.avaliacao.fcx.labs.rest.api.controller.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author Anderson
 */
@Data
public class CreateUserResponse {
    private Long id;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private String telefone;
    private String cpf;
    private Date dataNascimento;
    private String nomeDaMae;
    private String status;
    private Date dataInclusao;
    private Date dataAlteracao;
}
