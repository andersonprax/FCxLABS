package com.example.avaliacao.fcx.labs.rest.api.dao;

import com.example.avaliacao.fcx.labs.rest.api.model.UserModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Interface que vai acessar o banco de dados e extender o CrudRepository que disponibiliza métodos de CRUD.
 * @author Anderson
 */
public interface UserRepository extends CrudRepository<UserModel, Long> {

    UserModel findByCpf(String cpf);

    UserModel findByLogin(String login);

    UserModel findByStatus(String status);

    UserModel findBydataNascimento(Date dataNascimento);

    UserModel findBydataInclusao(Date dataInclusao);

    UserModel findBydataAlteracao(Date dataAlteracao);
}
