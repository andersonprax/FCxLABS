package com.example.avaliacao.fcx.labs.rest.api.controller;

import com.example.avaliacao.fcx.labs.rest.api.controller.dto.UpdateUserRequest;
import com.example.avaliacao.fcx.labs.rest.api.model.UserModel;
import com.example.avaliacao.fcx.labs.rest.api.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author Anderson
 */
@RestController
public class UserController {

    private final UserService service;
    private final ObjectMapper mapper = new ObjectMapper();

    public UserController(UserService service){
        super();
        this.service = service;
    }

    /**
     * Método para criar/salvar o(s) usuário(s) no banco de dados
     * @param user
     * @return
     */
    @PostMapping(path = "/api/usuarios/criar")
    public UserModel create(@RequestBody UserModel user) {
        return service.save(user);
    }

    /**
     * Método para consultar o usuário pelo id no banco de dados
     * @param id
     * @return
     */
    @GetMapping(path = "/api/usuarios/{id}")
    public ResponseEntity<UserModel> findById(@PathVariable(name = "id") Long id){
        return service.getUser(id)
                /**
                 * Chamando o método map e retornando "ok" com o registro(record)
                 * no corpo da requisição, caso contrário, retornará "not found"
                 */
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Método responsável por fazer a consulta pelo cpf do usuário no banco de dados
     * @param cpf
     * @return
     */
    @GetMapping(path = "/api/usuarios/cpf={cpf}")
    public ResponseEntity<UserModel> findByCpf(@PathVariable(name = "cpf") String cpf){
        return new ResponseEntity<>(service.findByCpf(cpf), HttpStatus.OK);
    }

    /**
     * Método responsável por fazer a consulta pelo login do usuário no banco de dados
     * @param login
     * @return
     */
    @GetMapping(path = "/api/usuarios/login={login}")
    public ResponseEntity<UserModel> findByLogin(@PathVariable(name = "login") String login) {
        return new ResponseEntity<>(service.findByLogin(login), HttpStatus.OK);
    }

    /**
     * Método responsável por fazer a consulta pelo status do usuário no banco de dados
     * @param status
     * @return
     */
    @GetMapping(path =  "/api/usuarios/status={status}")
    public ResponseEntity<UserModel> findByStatus(@PathVariable(name = "status") String status) {
        return new ResponseEntity<>(service.findByStatus(status), HttpStatus.OK);
    }

    /**
     * Método responsável por fazer a consulta pela data de nascimento do usuário no banco de dados
     * @param dataNascimento
     * @return
     */
    @GetMapping(path =  "/api/usuarios/dataNascimento={dataNascimento}")
    public ResponseEntity<UserModel> findBydataNascimento(@PathVariable(name =
            "dataNascimento") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataNascimento){
        return new ResponseEntity<>(service.findBydataNascimento(dataNascimento), HttpStatus.OK);
    }

    /**
     * Método responsável por fazer a consulta pela data de inclusão do usuário no banco de dados
     * @param dataInclusao
     * @return
     */
    @GetMapping(path =  "/api/usuarios/dataInclusao={dataInclusao}")
    public ResponseEntity<UserModel> findBydataInclusao(@PathVariable(name =
            "dataInclusao") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date dataInclusao){
        return new ResponseEntity<>(service.findBydataInclusao(dataInclusao), HttpStatus.OK);
    }

    /**
     * Método responsável por fazer a consulta pela data da alteração do usuário no banco de dados
     * @param dataAlteracao
     * @return
     */
    public ResponseEntity<UserModel> findBydataAlteracao(@PathVariable(name =
            "dataAlteracao") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date dataAlteracao){
        return new ResponseEntity<>(service.findBydataAlteracao(dataAlteracao), HttpStatus.OK);
    }

    /**
     * Método responsável por listar/consultar todos os usuários no banco de dados.
     * @return
     */
    @GetMapping(path = "/api/usuarios/listar")
    public ResponseEntity<List<UserModel>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    /**
     * Método responsável por atualizar os usuários pelo ID no banco de dados
     * @param id
     * @param updateUserRequest
     * @return
     */
    @PutMapping(path = "/api/usuarios/{id}")
    public ResponseEntity update(@PathVariable(name = "id") Long id, @RequestBody UpdateUserRequest updateUserRequest) {
        updateUserRequest.setId(id);
        UserModel user = service.update(updateUserRequest);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    /**
     * Método responsável por deletar/apagar o cliente pelo ID no banco de dados
     * @param id
     * @return
     */
    @DeleteMapping(path = "/api/usuarios/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable(name = "id") Long id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Método responsável por deletar/apagar todos os clientes do banco de dados
     * @return
     */
    @DeleteMapping("/api/usuarios/deleteAll")
    public ResponseEntity<Void> deleteAll() {
        service.deleteAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
