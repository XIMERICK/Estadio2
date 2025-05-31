package com.estadio.estadio.service;

import com.estadio.estadio.model.Venta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServicioCentralizadoImpl implements ServicioCentralizado {

    private static final Logger logger = LoggerFactory.getLogger(ServicioCentralizadoImpl.class);

    @Override
    public void validarDisponibilidadAsiento(String idAsiento, Long idFuncion) {
        logger.info("Validando disponibilidad del asiento {} para la función {} con el sistema centralizado.", idAsiento, idFuncion);
        logger.info("El asiento {} para la función {} está disponible (simulado).", idAsiento, idFuncion);
    }

    @Override
    public void enviarInformacionVenta(Venta venta) {
        // Simulación del envío de la información de la venta al sistema centralizado
        logger.info("Enviando información de la venta {} al sistema centralizado.", venta.getId());
        logger.info("Detalles de la venta: Asiento={}, Función={}, Usuario={}, Precio Final={}",
                venta.getAsiento().getIdAsiento(),
                venta.getFuncion().getId(),
                (venta.getUsuario() != null ? venta.getUsuario().getId() : "Anónimo"),
                venta.getPrecioFinal());
        logger.info("Información de la venta {} enviada al sistema centralizado (simulado).", venta.getId());
    }
}
