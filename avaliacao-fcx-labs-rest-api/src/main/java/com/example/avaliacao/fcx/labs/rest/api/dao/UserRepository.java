package com.example.avaliacao.fcx.labs.rest.api.dao;

import com.example.avaliacao.fcx.labs.rest.api.model.UserModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface que vai acessar o banco de dados e extender o CrudRepository que disponibiliza métodos de CRUD.
 * @author Anderson
 */
public interface UserRepository extends CrudRepository<UserModel, Long> {
}
