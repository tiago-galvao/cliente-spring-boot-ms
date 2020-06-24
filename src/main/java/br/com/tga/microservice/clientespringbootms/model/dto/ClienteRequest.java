package br.com.tga.microservice.clientespringbootms.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.tga.microservice.clientespringbootms.model.Cliente;
import lombok.Getter;
import lombok.Setter;

public class ClienteRequest {
  
    @NotNull @NotBlank
    @Getter @Setter private String name;
  
    public Cliente converter() {
      return new Cliente(name);
    }
}