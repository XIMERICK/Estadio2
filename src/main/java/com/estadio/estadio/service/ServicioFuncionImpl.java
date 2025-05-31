package com.estadio.estadio.service;

@Service
public class ServicioFuncionImpl implements ServicioFuncion {

    @Autowired
    private FuncionRepositorio funcionRepositorio;

    @Override
    public Funcion obtenerFuncionPorId(Long idFuncion) {
        return funcionRepositorio.findById(idFuncion).orElse(null);
    }

    @Override
    public List<Funcion> obtenerTodasLasFunciones() {
        return funcionRepositorio.findAll();
    }

    @Override
    public Funcion guardarFuncion(Funcion funcion) {
        return funcionRepositorio.save(funcion);
    }

    @Override
    public void eliminarFuncion(Long idFuncion) {
        funcionRepositorio.deleteById(idFuncion);
    }
}