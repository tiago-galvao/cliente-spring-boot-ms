package br.com.tga.microservice.clientespringbootms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cliente Não Encontrado")
public class ClienteNotFoundException extends RuntimeException{}