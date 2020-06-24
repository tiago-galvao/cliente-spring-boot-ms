package br.com.tga.microservice.clientespringbootms.model.dto;

import br.com.tga.microservice.clientespringbootms.model.Cliente;
import lombok.Getter;

public class ClienteResponse {

    @Getter private Long id;
    @Getter private String name;

	public ClienteResponse() {}

    public ClienteResponse(Cliente cliente) {
        this.id = cliente.getId();
        this.name = cliente.getName();
    }
}