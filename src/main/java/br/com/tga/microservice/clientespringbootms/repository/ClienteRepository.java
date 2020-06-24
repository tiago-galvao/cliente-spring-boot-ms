package br.com.tga.microservice.clientespringbootms.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.tga.microservice.clientespringbootms.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}