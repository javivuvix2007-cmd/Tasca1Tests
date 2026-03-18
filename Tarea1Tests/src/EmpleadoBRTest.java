import es.iesmz.EmpleadoBR;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoBRTest {
        @BeforeAll
        public static void setUpBeforeClass() throws Exception {
        }

        @BeforeEach
        public void setUp() {
            EmpleadoBR e = new EmpleadoBR();
            System.out.println("Configurando antes de cada método de prueba...");
        }
    @Test
    public void testCalculaSalarioBruto1() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                EmpleadoBR.TipoEmpleado.venedor, 2000.0f, 8.0f);
        float resultadoEsperado = 1360.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto2() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                EmpleadoBR.TipoEmpleado.venedor, 1500f, 3.0f);
        float resultadoEsperado = 1260f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto3() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                EmpleadoBR.TipoEmpleado.venedor, 1499.99f, 0f);
        float resultadoEsperado = 1100f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto4() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                EmpleadoBR.TipoEmpleado.encarregat, 1250f, 8f);
        float resultadoEsperado = 1760f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto5() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                EmpleadoBR.TipoEmpleado.encarregat, 1000f, 0f);
        float resultadoEsperado = 1600f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto6() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                EmpleadoBR.TipoEmpleado.encarregat, 999.99f, 3f);
        float resultadoEsperado = 1560f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto7() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                EmpleadoBR.TipoEmpleado.encarregat, 500f, 0f);
        float resultadoEsperado = 1500f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto8() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                EmpleadoBR.TipoEmpleado.encarregat, 0f, 8f);
        float resultadoEsperado = 1660f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto9() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                EmpleadoBR.TipoEmpleado.venedor, -1f, 8f);
        float resultadoEsperado = -1f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto10() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                EmpleadoBR.TipoEmpleado.venedor, 1500f, -1f);
        float resultadoEsperado = -1f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto11() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                null, 1500f, 8f);
        float resultadoEsperado = -1f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto1() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(2000f);
        float resultadoEsperado = 1640f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto2() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1500f);
        float resultadoEsperado = 1230f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto3() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1499.99f);
        float resultadoEsperado = 1259.9916f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto4() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1250f);
        float resultadoEsperado = 1050f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto5() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1000);
        float resultadoEsperado = 840f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto6() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(999.99f);
        float resultadoEsperado = 999.99f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto7() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(500f);
        float resultadoEsperado = 500f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto8() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(0f);
        float resultadoEsperado = 0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto9() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(-1f);
        float resultadoEsperado = -1f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
}

