package com.examen._000133420.domain.services;



import com.examen._000133420.domain.models.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente create(Cliente cliente);
    List<Cliente> getAll();
    Cliente getByDni(String dni);
    Cliente update(Cliente cliente);
}
