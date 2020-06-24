package br.com.tga.microservice.clientespringbootms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.tga.microservice.clientespringbootms.model.dto.ClienteRequest;
import br.com.tga.microservice.clientespringbootms.model.dto.ClienteResponse;
import br.com.tga.microservice.clientespringbootms.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ClienteResponse create(@RequestBody @Valid ClienteRequest clienteRequest) {
        return clienteService.create(clienteRequest);
    }

    @GetMapping("/{id}")
    public ClienteResponse getById(@PathVariable Long id) {
        return clienteService.findById(id).getBody();
    }
}