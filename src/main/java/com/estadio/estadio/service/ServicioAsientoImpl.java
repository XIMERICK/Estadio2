package com.estadio.estadio.service; // O tu paquete de implementaciones

import com.estadio.estadio.model.Asiento;
import com.estadio.estadio.model.Funcion;
import com.estadio.estadio.repositorio.AsientoRepositorio;
import com.estadio.estadio.repositorio.VentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // Importa esta clase

import java.util.List;

@Service
public class ServicioAsientoImpl implements ServicioAsiento {

    @Autowired
    private AsientoRepositorio asientoRepositorio;

    @Autowired
    private VentaRepositorio ventaRepositorio;

    // ... (otros métodos)

    @Override
    public List<Asiento> obtenerTodosLosAsientos() {
        return List.of();
    }

    @Override
    public List<Asiento> obtenerAsientosDisponibles(Funcion funcion) {
        return List.of();
    }

    @Override
    public Asiento obtenerAsientoPorId(String idAsiento) {
        return null;
    }

    @Override
    @Transactional // ¡Añade esta anotación!
    public Asiento guardarAsiento(Asiento asiento) {
        return asientoRepositorio.save(asiento);
    }

    @Override
    @Transactional // ¡Añade esta anotación!
    public void eliminarAsiento(String idAsiento) {
        asientoRepositorio.deleteById(idAsiento);
    }

    @Override
    @Transactional // ¡Añade esta anotación!
    public void marcarAsientoComoVendido(Asiento asiento) {
        asiento.setEstado(asiento.getEstado().VENDIDO);
        asientoRepositorio.save(asiento);
    }

    @Transactional
    @Override
    public void registrarAsiento(Asiento asiento) {
        // Unifica la lógica, es probable que solo necesites guardar
        asientoRepositorio.save(asiento);
    }
}