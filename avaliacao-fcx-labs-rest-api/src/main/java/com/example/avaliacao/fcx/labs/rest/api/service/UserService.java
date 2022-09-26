package com.example.avaliacao.fcx.labs.rest.api.service;

import com.example.avaliacao.fcx.labs.rest.api.dao.UserRepository;
import com.example.avaliacao.fcx.labs.rest.api.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

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
    public Optional<UserModel> getUser(Long id) {
        return repository.findById(id);
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
    public UserModel update(UserModel updateUserRequest) {
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
