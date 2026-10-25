package mx.edu.utez.crudoswaldo.service;

import mx.edu.utez.crudoswaldo.dto.RequestCalculadoraDTO;
import mx.edu.utez.crudoswaldo.exception.customexceptions.BadRequestException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyServiceTest {
    private final MyService service = new MyService();

    @Test
    void calculaLasCuatroOperaciones() {
        assertEquals(9, service.calculadora(new RequestCalculadoraDTO(4, 5, "SUMA")));
        assertEquals(-1, service.calculadora(new RequestCalculadoraDTO(4, 5, "RESTA")));
        assertEquals(20, service.calculadora(new RequestCalculadoraDTO(4, 5, "MULTIPLICACION")));
        assertEquals(2, service.calculadora(new RequestCalculadoraDTO(10, 5, "DIVISION")));
    }

    @Test
    void rechazaDivisionEntreCero() {
        assertThrows(BadRequestException.class,
                () -> service.calculadora(new RequestCalculadoraDTO(10, 0, "DIVISION")));
    }

    @Test
    void rechazaOperacionesDesconocidas() {
        assertThrows(BadRequestException.class,
                () -> service.calculadora(new RequestCalculadoraDTO(1, 2, "POTENCIA")));
    }
}
