package com.examen._000133420.infrastructure.repositories;

import com.examen._000133420.domain.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteJpaRepository extends JpaRepository<Cliente, Long> {
    Cliente getByDni(String dni);
}
