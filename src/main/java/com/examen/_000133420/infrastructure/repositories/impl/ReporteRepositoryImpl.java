package com.examen._000133420.infrastructure.repositories.impl;

import com.examen._000133420.domain.models.Reporte;
import com.examen._000133420.domain.repositories.ReporteRepository;
import com.examen._000133420.infrastructure.repositories.ReporteJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ReporteRepositoryImpl implements ReporteRepository {
    private ReporteJpaRepository reporteJpaRepository;
    @Override
    public Reporte save(Reporte reporte) {
        return this.reporteJpaRepository.save(reporte);
    }

    @Override
    public List<Reporte> getAll() {
        return this.reporteJpaRepository.findAll();
    }

    @Override
    public Reporte getOne(Long id) {
        return this.reporteJpaRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        this.reporteJpaRepository.deleteById(id);
    }
}
