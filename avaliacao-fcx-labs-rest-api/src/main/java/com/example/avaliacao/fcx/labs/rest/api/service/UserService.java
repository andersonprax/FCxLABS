package com.example.avaliacao.fcx.labs.rest.api.service;

import com.example.avaliacao.fcx.labs.rest.api.controller.dto.UpdateUserRequest;
import com.example.avaliacao.fcx.labs.rest.api.dao.UserRepository;
import com.example.avaliacao.fcx.labs.rest.api.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author Anderson
 */
@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository){
        super();
        this.repository = repository;
    }

    /**
     * Método para criar/salvar o(s) usuário(s) no banco de dados
     * @return
     * @param userRequest
     */
    public UserModel save(UserModel userRequest) {
        var user = new UserModel();
        BeanUtils.copyProperties(userRequest, user);
        repository.save(user);
        return user;
    }

    /**
     * Método responsável por fazer a consulta pelo id do usuário no banco de dados
     * @param id
     * @return
     */
    public Optional<UserModel> getUser(Long id) {return repository.findById(id);}

    /**
     * Método responsável por fazer a consulta pelo cpf do usuário no banco de dados
     * @param cpf
     * @return
     */
    public UserModel findByCpf(String cpf){return repository.findByCpf(cpf);}

    /**
     * Método responsável por fazer a consulta pelo login do usuário no banco de dados
     * @param login
     * @return
     */
    public  UserModel findByLogin(String login){return repository.findByLogin(login);}

    /**
     * Método responsável por fazer a consulta pelo status do usuário no banco de dados
     * @param status
     * @return
     */
    public UserModel findByStatus(String status) {return repository.findByStatus(status);}

    /**
     * Método responsável por fazer a consulta pela data de nascimento do usuário no banco de dados
     * @param dataNascimento
     * @return
     */
    public UserModel findBydataNascimento(Date dataNascimento){return repository.findBydataNascimento(dataNascimento);}

    /**
     * Método responsável por fazer a consulta pela data de inclusão do usuário no banco de dados
     * @param dataInclusao
     * @return
     */
    public UserModel findBydataInclusao(Date dataInclusao){
        return repository.findBydataInclusao(dataInclusao);
    }

    /**
     * Método responsável por fazer a consulta pela data da alteração do usuário no banco de dados
     * @param dataAlteracao
     * @return
     */
    public UserModel findBydataAlteracao(Date dataAlteracao){
        return repository.findBydataAlteracao(dataAlteracao);
    }

    /**
     * Método responsável por listar todos os usuários do banco de dados
     * @return
     */
    public List findAll() {
        return (List) repository.findAll();
    }

    /**
     * Método responsável por atualizar os usuários pelo ID no banco de dados
     * @param updateUserRequest
     * @return
     */
    public UserModel update(UpdateUserRequest updateUserRequest) {
        var user = repository.findById(updateUserRequest.getId()).get();
        BeanUtils.copyProperties(updateUserRequest, user);
        repository.save(user);
        return user;
    }

    /**
     * Método responsável por deletar/apagar o cliente pelo ID no banco de dados
     * @param id
     */
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    /**
     * Método responsável por deletar/apagar todos os clientes do banco de dados
     */
    public void deleteAll() {
        repository.deleteAll();
    }

}
