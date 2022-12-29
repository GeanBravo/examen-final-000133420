package com.examen._000133420.domain.repositories;



import com.examen._000133420.domain.models.Cliente;

import java.util.List;

public interface ClienteRepository {
    Cliente save(Cliente cliente);
    List<Cliente> getAll();
    Cliente getOne(Long id);
    Cliente getByDni(String dni);
    void delete(Long id);
}
