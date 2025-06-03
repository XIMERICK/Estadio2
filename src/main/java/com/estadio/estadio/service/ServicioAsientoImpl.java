package com.estadio.estadio.service;

import com.estadio.estadio.model.Asiento;
import com.estadio.estadio.model.Funcion;
import com.estadio.estadio.repositorio.AsientoRepositorio; // Asegúrate de que este import es correcto
import com.estadio.estadio.repositorio.VentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // Importa esta clase

import java.util.List;
import java.util.Optional; // Importa Optional

@Service
public class ServicioAsientoImpl implements ServicioAsiento {

    @Autowired
    private AsientoRepositorio asientoRepositorio;

    @Autowired
    private VentaRepositorio ventaRepositorio;

    // ... (otros métodos, algunos de ellos están devolviendo List.of() o null, revisa si es intencional)

    @Override
    public List<Asiento> obtenerTodosLosAsientos() {
        return asientoRepositorio.findAll(); // Devuelve todos los asientos, no una lista vacía
    }

    // Este método necesita implementación real para buscar asientos disponibles
    @Override
    public List<Asiento> obtenerAsientosDisponibles(Funcion funcion) {
        // Implementa la lógica para obtener asientos disponibles para una función
        // Por ejemplo, filtrando los que no están en ventas relacionadas con esa función
        return List.of(); // Placeholder, implementa esto adecuadamente
    }

    @Override
    public Asiento obtenerAsientoPorId(String idAsiento) {
        // ¡CAMBIO CLAVE AQUÍ!
        // Busca el asiento por su ID String usando el repositorio
        Optional<Asiento> asientoOptional = asientoRepositorio.findById(idAsiento);
        return asientoOptional.orElse(null); // Devuelve el asiento si existe, o null si no
    }

    @Override
    @Transactional
    public Asiento guardarAsiento(Asiento asiento) {
        return asientoRepositorio.save(asiento);
    }

    @Override
    @Transactional
    public void eliminarAsiento(String idAsiento) {
        asientoRepositorio.deleteById(idAsiento);
    }

    @Override
    @Transactional
    public void marcarAsientoComoVendido(Asiento asiento) {
        // Asumiendo que EstadoAsiento.VENDIDO es un valor de tu enum
        asiento.setEstado(com.estadio.estadio.enums.EstadoAsiento.VENDIDO); // Asegúrate de la referencia correcta a tu enum
        asientoRepositorio.save(asiento);
    }

    @Override
    @Transactional
    public void registrarAsiento(Asiento asiento) {
        // Este método y guardarAsiento parecen duplicados. Podrías eliminar uno
        // o hacer que registrarAsiento simplemente llame a guardarAsiento.
        asientoRepositorio.save(asiento);
    }
}