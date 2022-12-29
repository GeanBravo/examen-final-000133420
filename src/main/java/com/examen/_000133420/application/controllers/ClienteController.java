package com.examen._000133420.application.controllers;

import com.examen._000133420.domain.models.Cliente;
import com.examen._000133420.domain.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "clientes")
@AllArgsConstructor
public class ClienteController {
    private ClienteService clienteService;
    @PostMapping
    ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        Cliente creado = this.clienteService.create(cliente);
        return new ResponseEntity<>(creado, HttpStatus.CREATED);
    }

    @GetMapping(path = "by-dni/{dni}")
    ResponseEntity<Cliente> getByDni(@PathVariable("dni") String dni){
        Cliente obtenido = this.clienteService.getByDni(dni);
        return new ResponseEntity<>(obtenido, HttpStatus.CREATED);
    }
}
