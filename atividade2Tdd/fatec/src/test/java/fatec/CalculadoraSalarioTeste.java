package fatec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraSalarioTeste {

    @Test
    public void testCalculaSalarioDesenvolvedorComSalarioMaiorQue3000() {
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(2400, calculadora.calcularSalario("DESENVOLVEDOR", 3000));
    }

    @Test
    public void testCalculaSalarioDesenvolvedorComSalarioMenorQue3000() {
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(2700, calculadora.calcularSalario("DESENVOLVEDOR", 3000));
    }

    @Test
    public void testCalculaSalarioDBAComSalarioMaiorQue2000() {
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(1500, calculadora.calcularSalario("DBA", 2000));
    }

    @Test
    public void testCalculaSalarioDBAComSalarioMenorQue2000() {
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(1700, calculadora.calcularSalario("DBA", 2000));
    }

    @Test
    public void testCalculaSalarioTestadorComSalarioMaiorQue2000() {
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(1500, calculadora.calcularSalario("TESTADOR", 2000));
    }

    @Test
    public void testCalculaSalarioTestadorComSalarioMenorQue2000() {
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(1700, calculadora.calcularSalario("TESTADOR", 2000));
    }

    @Test
    public void testCalculaSalarioGerenteComSalarioMaiorQue5000() {
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(3500, calculadora.calcularSalario("GERENTE", 5000));
    }

    @Test
    public void testCalculaSalarioGerenteComSalarioMenorQue5000() {
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(4000, calculadora.calcularSalario("GERENTE", 5000));
    }
}
