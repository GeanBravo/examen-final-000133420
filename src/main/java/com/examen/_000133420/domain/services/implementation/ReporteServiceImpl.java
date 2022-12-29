package com.examen._000133420.domain.services.implementation;

import com.examen._000133420.domain.models.Reporte;
import com.examen._000133420.domain.repositories.ReporteRepository;
import com.examen._000133420.domain.services.ReporteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReporteServiceImpl implements ReporteService {
    private ReporteRepository reporteRepository;
    @Override
    public Reporte create(Reporte reporte) {
        return this.reporteRepository.save(reporte);
    }

    @Override
    public List<Reporte> getAll() {
        return this.reporteRepository.getAll();
    }

    @Override
    public Reporte update(Reporte reporte) {
        return this.reporteRepository.save(reporte);
    }
}
