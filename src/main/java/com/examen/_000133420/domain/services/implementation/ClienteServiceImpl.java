package com.examen._000133420.domain.services.implementation;

import com.examen._000133420.domain.models.Cliente;
import com.examen._000133420.domain.repositories.ClienteRepository;
import com.examen._000133420.domain.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    private ClienteRepository clienteRepository;
    @Override
    public Cliente create(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAll() {
        return this.clienteRepository.getAll();
    }

    @Override
    public Cliente getByDni(String dni) {
        return this.clienteRepository.getByDni(dni);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }
}
