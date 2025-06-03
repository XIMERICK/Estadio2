package com.estadio.estadio;

import com.estadio.estadio.model.*;
import com.estadio.estadio.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private ServicioUsuario servicioUsuario;

    @Autowired
    private ServicioAsiento servicioAsiento;

    @Autowired
    private ServicioLugar servicioLugar;

    @Autowired
    private ServicioFuncion servicioFuncion;

    @Autowired
    private ServicioVenta servicioVenta;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Iniciando DatabaseInitializer ---");

        // 1. Inicializar y guardar Usuarios
        List<Usuario> usuarios = Arrays.asList(
                new Usuario(null, "yenifer", "burtica", "1002654234", 0.30),
                new Usuario(null, "lina", "aranzazu", "100986324", 0.30),
                new Usuario(null, "leo", "londono", "2344224", 0.30),
                new Usuario(null, "camila", "arenas", "23466533", 0.30),
                new Usuario(null, "camilo", "pulgarin", "23456785", 0.30),
                new Usuario(null, "paula", "cano", "76543212", 0.30),
                new Usuario(null, "ximena", "garcia", "1002654234", 0.30),
                new Usuario(null, "erick", "cano", "1056145606", 0.30),
                new Usuario(null, "martin", "medina", "1007654234", 0.30),
                new Usuario(null, "marcelo", "cano", "1006344262", 0.30),
                new Usuario(null, "julian", "colorado", "7698243", 0.30),
                new Usuario(null, "andrea", "garcia", "24322156", 0.30),
                new Usuario(null, "dylan", "aristizabal", "106543221", 0.30),
                new Usuario(null, "steban", "narino", "87654234", 0.30),
                new Usuario(null, "laura", "perez", "1006453245", 0.30),
                new Usuario(null, "dulce", "velez", "24336789", 0.30),
                new Usuario(null, "daniela", "mosquena", "908523", 0.30),
                new Usuario(null, "marina", "guzman", "4445678", 0.30),
                new Usuario(null, "sandra", "patino", "32456789", 0.30),
                new Usuario(null, "olga", "ossa", "24301567", 0.30),
                new Usuario(null, "omaira", "jaramillo", "90887532", 0.30),
                new Usuario(null, "sofia", "usma", "1002564324", 0.30),
                new Usuario(null, "gilma", "munoz", "1002675432", 0.30)
        );
        for (Usuario usuario : usuarios) {
            servicioUsuario.registrarUsuario(usuario);
        }
        System.out.println("Datos de usuario inicializados.");

        List<Lugar> lugares = Arrays.asList(
                new Lugar(null, "norte barras", 70000.0),
                new Lugar(null, "occidental lateral", 60000.0),
                new Lugar(null, "occidental lateral norte", 58000.0),
                new Lugar(null, "oriental general", 90000.0),
                new Lugar(null, "palco general", 120000.0),
                new Lugar(null, "occidental general", 43000.0),
                new Lugar(null, "palco vip", 180000.0),
                new Lugar(null, "sur general", 100000.0)
        );
        for (Lugar lugar : lugares) {
            servicioLugar.guardarLugar(lugar);
        }
        System.out.println("Datos de lugar inicializados.");

        // 3. Inicializar y guardar Funciones
        List<Funcion> funciones = Arrays.asList(
                new Funcion(null, "viernes", 0.00),
                new Funcion(null, "sabado", 0.30)
        );
        for (Funcion funcion : funciones) {
            servicioFuncion.guardarFuncion(funcion);
        }
        System.out.println("Datos de función inicializados.");

        List<Asiento> asientos = Arrays.asList(
                new Asiento("NB001", "norte barras", 70000.0),
                new Asiento("NB002", "norte barras", 70000.0),
                new Asiento("NB003", "norte barras", 70000.0),
                new Asiento("NB004", "norte barras", 70000.0),
                new Asiento("NB005", "norte barras", 70000.0),
                new Asiento("NB006", "norte barras", 70000.0),
                new Asiento("NB007", "norte barras", 70000.0),
                new Asiento("NB008", "norte barras", 70000.0),
                new Asiento("NB009", "norte barras", 70000.0),
                new Asiento("NB010", "norte barras", 70000.0),
                new Asiento("NB011", "norte barras", 70000.0),
                new Asiento("NB012", "norte barras", 70000.0),
                new Asiento("NB013", "norte barras", 70000.0),
                new Asiento("NB014", "norte barras", 70000.0),
                new Asiento("NB015", "norte barras", 70000.0),
                new Asiento("NB016", "norte barras", 70000.0),
                new Asiento("NB017", "norte barras", 70000.0),
                new Asiento("NB018", "norte barras", 70000.0),
                new Asiento("NB019", "norte barras", 70000.0),
                new Asiento("NB020", "norte barras", 70000.0),
                new Asiento("NB021", "norte barras", 70000.0),
                new Asiento("NB022", "norte barras", 70000.0),
                new Asiento("NB023", "norte barras", 70000.0),
                new Asiento("NB024", "norte barras", 70000.0),
                new Asiento("NB025", "norte barras", 70000.0),
                new Asiento("OL001", "occidental lateral", 60000.0),
                new Asiento("OL002", "occidental lateral", 60000.0),
                new Asiento("OL003", "occidental lateral", 60000.0),
                new Asiento("OL004", "occidental lateral", 60000.0),
                new Asiento("OL005", "occidental lateral", 60000.0),
                new Asiento("OL006", "occidental lateral", 60000.0),
                new Asiento("OL007", "occidental lateral", 60000.0),
                new Asiento("OL008", "occidental lateral", 60000.0),
                new Asiento("OL009", "occidental lateral", 60000.0),
                new Asiento("OL010", "occidental lateral", 60000.0),
                new Asiento("OL011", "occidental lateral", 60000.0),
                new Asiento("OL012", "occidental lateral", 60000.0),
                new Asiento("OL013", "occidental lateral", 60000.0),
                new Asiento("OL014", "occidental lateral", 60000.0),
                new Asiento("OL015", "occidental lateral", 60000.0),
                new Asiento("OL016", "occidental lateral", 60000.0),
                new Asiento("OL017", "occidental lateral", 60000.0),
                new Asiento("OL018", "occidental lateral", 60000.0),
                new Asiento("OL019", "occidental lateral", 60000.0),
                new Asiento("OL020", "occidental lateral", 60000.0),
                new Asiento("OL021", "occidental lateral", 60000.0),
                new Asiento("OL022", "occidental lateral", 60000.0),
                new Asiento("OL023", "occidental lateral", 60000.0),
                new Asiento("OL024", "occidental lateral", 60000.0),
                new Asiento("OL025", "occidental lateral", 60000.0),
                new Asiento("OLN001", "occidental lateral norte", 58000.0),
                new Asiento("OLN002", "occidental lateral norte", 58000.0),
                new Asiento("OLN003", "occidental lateral norte", 58000.0),
                new Asiento("OLN004", "occidental lateral norte", 58000.0),
                new Asiento("OLN005", "occidental lateral norte", 58000.0),
                new Asiento("OLN006", "occidental lateral norte", 58000.0),
                new Asiento("OLN007", "occidental lateral norte", 58000.0),
                new Asiento("OLN008", "occidental lateral norte", 58000.0),
                new Asiento("OLN009", "occidental lateral norte", 58000.0),
                new Asiento("OLN010", "occidental lateral norte", 58000.0),
                new Asiento("OLN011", "occidental lateral norte", 58000.0),
                new Asiento("OLN012", "occidental lateral norte", 58000.0),
                new Asiento("OLN013", "occidental lateral norte", 58000.0),
                new Asiento("OLN014", "occidental lateral norte", 58000.0),
                new Asiento("OLN015", "occidental lateral norte", 58000.0),
                new Asiento("OLN016", "occidental lateral norte", 58000.0),
                new Asiento("OLN017", "occidental lateral norte", 58000.0),
                new Asiento("OLN018", "occidental lateral norte", 58000.0),
                new Asiento("OLN019", "occidental lateral norte", 58000.0),
                new Asiento("OLN020", "occidental lateral norte", 58000.0),
                new Asiento("OLN021", "occidental lateral norte", 58000.0),
                new Asiento("OLN022", "occidental lateral norte", 58000.0),
                new Asiento("OLN023", "occidental lateral norte", 58000.0),
                new Asiento("OLN024", "occidental lateral norte", 58000.0),
                new Asiento("OLN025", "occidental lateral norte", 58000.0),
                new Asiento("OLN026", "occidental lateral norte", 58000.0),
                new Asiento("OLN027", "occidental lateral norte", 58000.0),
                new Asiento("OLN028", "occidental lateral norte", 58000.0),
                new Asiento("OLN029", "occidental lateral norte", 58000.0),
                new Asiento("OG001", "oriental general", 90000.0),
                new Asiento("OG002", "oriental general", 90000.0),
                new Asiento("OG003", "oriental general", 90000.0),
                new Asiento("OG004", "oriental general", 90000.0),
                new Asiento("OG005", "oriental general", 90000.0),
                new Asiento("OG006", "oriental general", 90000.0),
                new Asiento("OG007", "oriental general", 90000.0),
                new Asiento("OG008", "oriental general", 90000.0),
                new Asiento("OG009", "oriental general", 90000.0),
                new Asiento("OG010", "oriental general", 90000.0),
                new Asiento("OG011", "oriental general", 90000.0),
                new Asiento("OG012", "oriental general", 90000.0),
                new Asiento("OG013", "oriental general", 90000.0),
                new Asiento("OG014", "oriental general", 90000.0),
                new Asiento("OG015", "oriental general", 90000.0),
                new Asiento("OG016", "oriental general", 90000.0),
                new Asiento("OG017", "oriental general", 90000.0),
                new Asiento("OG018", "oriental general", 90000.0),
                new Asiento("OG019", "oriental general", 90000.0),
                new Asiento("OG020", "oriental general", 90000.0),
                new Asiento("OG021", "oriental general", 90000.0),
                new Asiento("OG022", "oriental general", 90000.0),
                new Asiento("OG023", "oriental general", 90000.0),
                new Asiento("OG024", "oriental general", 90000.0),
                new Asiento("OG025", "oriental general", 90000.0),
                new Asiento("PG001", "palco general", 120000.0),
                new Asiento("PG002", "palco general", 120000.0),
                new Asiento("PG003", "palco general", 120000.0),
                new Asiento("PG004", "palco general", 120000.0),
                new Asiento("PG005", "palco general", 120000.0),
                new Asiento("PG006", "palco general", 120000.0),
                new Asiento("PG007", "palco general", 120000.0),
                new Asiento("PG008", "palco general", 120000.0),
                new Asiento("PG009", "palco general", 120000.0),
                new Asiento("PG010", "palco general", 120000.0),
                new Asiento("PG011", "palco general", 120000.0),
                new Asiento("PG012", "palco general", 120000.0),
                new Asiento("PG013", "palco general", 120000.0),
                new Asiento("PG014", "palco general", 120000.0),
                new Asiento("PG015", "palco general", 120000.0),
                new Asiento("PG016", "palco general", 120000.0),
                new Asiento("PG017", "palco general", 120000.0),
                new Asiento("PG018", "palco general", 120000.0),
                new Asiento("PG019", "palco general", 120000.0),
                new Asiento("PG020", "palco general", 120000.0),
                new Asiento("PG021", "palco general", 120000.0),
                new Asiento("PG022", "palco general", 120000.0),
                new Asiento("PG023", "palco general", 120000.0),
                new Asiento("PG024", "palco general", 120000.0),
                new Asiento("PG025", "palco general", 120000.0),
                new Asiento("OCG001", "occidental general", 43000.0),
                new Asiento("OCG002", "occidental general", 43000.0),
                new Asiento("OCG003", "occidental general", 43000.0),
                new Asiento("OCG004", "occidental general", 43000.0),
                new Asiento("OCG005", "occidental general", 43000.0),
                new Asiento("OCG006", "occidental general", 43000.0),
                new Asiento("OCG007", "occidental general", 43000.0),
                new Asiento("OCG008", "occidental general", 43000.0),
                new Asiento("OCG009", "occidental general", 43000.0),
                new Asiento("OCG010", "occidental general", 43000.0),
                new Asiento("OCG011", "occidental general", 43000.0),
                new Asiento("OCG012", "occidental general", 43000.0),
                new Asiento("OCG013", "occidental general", 43000.0),
                new Asiento("OCG014", "occidental general", 43000.0),
                new Asiento("OCG015", "occidental general", 43000.0),
                new Asiento("OCG016", "occidental general", 43000.0),
                new Asiento("OCG017", "occidental general", 43000.0),
                new Asiento("OCG018", "occidental general", 43000.0),
                new Asiento("OCG019", "occidental general", 43000.0),
                new Asiento("OCG020", "occidental general", 43000.0),
                new Asiento("OCG021", "occidental general", 43000.0),
                new Asiento("OCG022", "occidental general", 43000.0),
                new Asiento("OCG023", "occidental general", 43000.0),
                new Asiento("OCG024", "occidental general", 43000.0),
                new Asiento("OCG025", "occidental general", 43000.0)
        );
        for (Asiento asiento : asientos) {
            servicioAsiento.registrarAsiento(asiento);
        }
        System.out.println("Datos de asiento inicializados.");

        Usuario usuarioParaVenta1 = servicioUsuario.obtenerUsuarioPorId(1L);
        Usuario usuarioParaVenta2 = servicioUsuario.obtenerUsuarioPorId(2L);

        Funcion funcionViernes = servicioFuncion.obtenerFuncionPorDia("viernes");
        Funcion funcionSabado = servicioFuncion.obtenerFuncionPorDia("sabado");

        Asiento asientoNB001 = servicioAsiento.obtenerAsientoPorId("NB001");
        Asiento asientoOL005 = servicioAsiento.obtenerAsientoPorId("OL005");

        System.out.println("DEBUG: Asiento NB001 encontrado: " + (asientoNB001 != null ? "SÍ" : "NO"));
        System.out.println("DEBUG: Función 'viernes' encontrada: " + (funcionViernes != null ? "SÍ" : "NO"));
        System.out.println("DEBUG: Usuario 1 encontrado: " + (usuarioParaVenta1 != null ? "SÍ" : "NO"));

        System.out.println("DEBUG: Asiento OL005 encontrado: " + (asientoOL005 != null ? "SÍ" : "NO"));
        System.out.println("DEBUG: Función 'sabado' encontrada: " + (funcionSabado != null ? "SÍ" : "NO"));
        System.out.println("DEBUG: Usuario 2 encontrado: " + (usuarioParaVenta2 != null ? "SÍ" : "NO"));

        if (asientoNB001 != null && funcionViernes != null && usuarioParaVenta1 != null) {
            servicioVenta.realizarVenta(asientoNB001.getIdAsiento(), funcionViernes.getId(), usuarioParaVenta1.getId());
        } else {
            System.err.println("Advertencia: No se pudo realizar la venta de NB001. Detalles de no encontrado: " +
                    "Asiento NB001: " + (asientoNB001 != null ? "Sí" : "No") +
                    ", Función 'viernes': " + (funcionViernes != null ? "Sí" : "No") +
                    ", Usuario 1: " + (usuarioParaVenta1 != null ? "Sí" : "No"));
        }

        if (asientoOL005 != null && funcionSabado != null && usuarioParaVenta2 != null) {
            servicioVenta.realizarVenta(asientoOL005.getIdAsiento(), funcionSabado.getId(), usuarioParaVenta2.getId());
        } else {
            System.err.println("Advertencia: No se pudo realizar la venta de OL005. Detalles de no encontrado: " +
                    "Asiento OL005: " + (asientoOL005 != null ? "Sí" : "No") +
                    ", Función 'sabado': " + (funcionSabado != null ? "Sí" : "No") +
                    ", Usuario 2: " + (usuarioParaVenta2 != null ? "Sí" : "No"));
        }

        System.out.println("Datos de venta inicializados.");
        System.out.println("--- DatabaseInitializer Finalizado ---");
    }


        }
