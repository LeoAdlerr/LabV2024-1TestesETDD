package fatec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrainguloTeste {
	 @Test
	    public void testTrianguloEscalenoValido() {
	        Triangulo triangulo = new Triangulo();
	        assertEquals("Triângulo escaleno", triangulo.classificarTriangulo(3, 4, 5));
	    }

	    @Test
	    public void testTrianguloIsoscelesValido() {
	        Triangulo triangulo = new Triangulo();
	        assertEquals("Triângulo isósceles", triangulo.classificarTriangulo(3, 3, 4));
	    }

	    @Test
	    public void testTrianguloEquilateroValido() {
	        Triangulo triangulo = new Triangulo();
	        assertEquals("Triângulo equilátero", triangulo.classificarTriangulo(3, 3, 3));
	    }

	    @Test
	    public void testIsoscelesValidoPermutacoes() {
	        Triangulo triangulo = new Triangulo();
	        assertEquals("Triângulo isósceles", triangulo.classificarTriangulo(3, 4, 3));
	        assertEquals("Triângulo isósceles", triangulo.classificarTriangulo(4, 3, 3));
	        assertEquals("Triângulo isósceles", triangulo.classificarTriangulo(3, 3, 4));
	    }

	    @Test
	    public void testValorZero() {
	        Triangulo triangulo = new Triangulo();
	        assertEquals("Não é um triângulo válido", triangulo.classificarTriangulo(0, 3, 4));
	    }

	    @Test
	    public void testValorNegativo() {
	        Triangulo triangulo = new Triangulo();
	        assertEquals("Não é um triângulo válido", triangulo.classificarTriangulo(-3, 4, 5));
	    }

	    @Test
	    public void testSomaDoisLadosIgualTerceiro() {
	        Triangulo triangulo = new Triangulo();
	        assertEquals("Não é um triângulo válido", triangulo.classificarTriangulo(2, 2, 4));
	    }

	    @Test
	    public void testSomaDoisLadosMenorQueTerceiro() {
	        Triangulo triangulo = new Triangulo();
	        assertEquals("Não é um triângulo válido", triangulo.classificarTriangulo(1, 2, 4));
	    }

	    @Test
	    public void testTresValoresZero() {
	        Triangulo triangulo = new Triangulo();
	        assertEquals("Não é um triângulo válido", triangulo.classificarTriangulo(0, 0, 0));
	    }

}
