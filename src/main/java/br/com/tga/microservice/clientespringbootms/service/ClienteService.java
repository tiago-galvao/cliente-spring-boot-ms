package br.com.tga.microservice.clientespringbootms.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.tga.microservice.clientespringbootms.exception.ClienteNotFoundException;
import br.com.tga.microservice.clientespringbootms.model.Cliente;
import br.com.tga.microservice.clientespringbootms.model.dto.ClienteRequest;
import br.com.tga.microservice.clientespringbootms.model.dto.ClienteResponse;
import br.com.tga.microservice.clientespringbootms.repository.ClienteRepository;


@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    public ClienteResponse create(ClienteRequest clienteRequest){
        Cliente cliente = clienteRequest.converter();
        return new ClienteResponse(clienteRepository.save(cliente));
    }

    public ResponseEntity<ClienteResponse> findById(Long id){
        Optional<Cliente> optional = clienteRepository.findById(id);
        if(!optional.isPresent()){
          throw new ClienteNotFoundException();
        }
        return ResponseEntity.ok(new ClienteResponse(optional.get()));
    }
}