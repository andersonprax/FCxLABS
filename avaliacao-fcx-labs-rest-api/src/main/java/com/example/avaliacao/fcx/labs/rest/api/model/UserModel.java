package com.example.avaliacao.fcx.labs.rest.api.model;

import javax.persistence.*;

import java.util.Date;

/**
 * Model com a classe de usuário que será representada no banco de dados
 * @author Anderson
 */
@Entity(name = "usuarios")
public class UserModel {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "Login", nullable = false, length = 20, unique=true)
    private String login;

    @Column(name = "Senha", nullable = false, length = 20)
    private String senha;

    @Column(name="E_mail", nullable=false, length=100, unique=true)
    private String email;

    @Column(name="Telefone", nullable=false, length=20, unique=true)
    private String telefone;

    @Column(name="CPF", nullable=false, length=15, unique=true)
    private String cpf;

    @Temporal(TemporalType.DATE)
    @Column(name="Data_de_Nascimento", columnDefinition="DATE")
    private Date dataNascimento;

    @Column(name="Nome_da_Mae", nullable=false, length=100)
    private String nomeDaMae;

    @Column(name="Status", nullable=false, length=15)
    private String status;

    @Temporal(TemporalType.DATE)
    @Column(name="Data_da_Inclusao", columnDefinition="DATE")
    private Date dataInclusao;

    @Temporal(TemporalType.DATE)
    @Column(name="Data_da_Alteracao", columnDefinition="DATE")
    private Date dataAlteracao;

    public UserModel() {
        super();
    }

    public UserModel(Long id, String nome, String login, String senha, String email, String telefone, String cpf,
                     Date dataNascimento, String nomeDaMae, String status, Date dataInclusao, Date dataAlteracao) {
        super();
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nomeDaMae = nomeDaMae;
        this.status = status;
        this.dataInclusao = dataInclusao;
        this.dataAlteracao = dataAlteracao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
}
