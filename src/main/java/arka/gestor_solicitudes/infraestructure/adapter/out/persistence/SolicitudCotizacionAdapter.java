package arka.gestor_solicitudes.infraestructure.adapter.out.persistence;

import arka.gestor_solicitudes.application.service.SolicitudCotizacionService;
import arka.gestor_solicitudes.domain.model.SolicitudCotizacion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class SolicitudCotizacionAdapter implements SolicitudCotizacionService {

    private final WebClient webClient;

    @Override
    public Mono<SolicitudCotizacion> obtenerCotizacion(Integer cotizacionId) {
        return webClient.get()
                .uri("/cotizaciones/{id}", cotizacionId)
                .retrieve()
                .bodyToMono(SolicitudCotizacion.class);
    }
}
