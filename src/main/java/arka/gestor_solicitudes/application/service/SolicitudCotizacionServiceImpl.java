package arka.gestor_solicitudes.application.service;

import arka.gestor_solicitudes.domain.model.SolicitudCotizacion;
import arka.gestor_solicitudes.infraestructure.adapter.out.persistence.SolicitudCotizacionAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class SolicitudCotizacionServiceImpl implements SolicitudCotizacionService {

    private final SolicitudCotizacionAdapter adapter;
    @Override
    public Mono<SolicitudCotizacion> obtenerCotizacion(Integer cotizacionId) {
        return adapter.obtenerCotizacion(cotizacionId);
    }
}
