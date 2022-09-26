package com.example.avaliacao.fcx.labs.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe com método para consultar o status e saber se a aplicação esta online
 * @author Anderson
 */
@RestController
public class StatusController {

    @GetMapping(path = "/api/status")
    public String check() {
        return "online";
    }
}
