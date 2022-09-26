package com.example.avaliacao.fcx.labs.rest.api.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

/**
 * @author Anderson
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserRequest {
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
