package com.example.avaliacao.fcx.labs.rest.api.controller;

import com.example.avaliacao.fcx.labs.rest.api.model.UserModel;
import com.example.avaliacao.fcx.labs.rest.api.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Anderson
 */
@RestController
public class UserController {

    private final UserService service;

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
    public ResponseEntity findById(@PathVariable(name = "id") Long id){
        return service.getUser(id)
                /**
                 * Chamando o método map e retornando "ok" com o registro(record)
                 * no corpo da requisição, caso contrário, retornará "not found"
                 */
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
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
     * @param userRequest
     * @return
     */
    @PutMapping(path = "/api/usuarios/{id}")
    public ResponseEntity update(@PathVariable(name = "id") Long id, @RequestBody UserModel userRequest) {
        userRequest.setId(id);
        try {
            UserModel user = service.update(userRequest);
            if (user == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(user, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
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
