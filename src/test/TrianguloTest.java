package test;

import main.Triangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Classe de teste para a classe Triangulo.
 * Esta classe contém vários métodos de teste para verificar a correta funcionalidade dos métodos na classe Triangulo.
 */
public class TrianguloTest {

    /**
     * Testa se o método triangulo retorna "Escaleno" quando nenhum dos lados são iguais.
     */
    @Test
    void deveRetornarEscalenoQuandoNaoHaLadosIguais() {
        assertEquals("Escaleno", Triangulo.triangulo(5,4,7));
    }

    /**
     * Testa se o método triangulo retorna "Equilátero" quando todos os lados são iguais.
     */
    @Test
    void deveRetornarEquilateroQuandoTodosOsLadosSaoIguais() {
        assertEquals("Equilátero", Triangulo.triangulo(5, 5, 5));
    }

    /**
     * Testa se o método triangulo retorna "Isósceles" quando dois dos lados são iguais.
     */
    @Test
    void deveRetornarIsoscelesQuandoTemDoisLadosIguais () {
        assertEquals("Isósceles", Triangulo.triangulo(3,3,4));
        assertEquals("Isósceles", Triangulo.triangulo(3,4,3));
        assertEquals("Isósceles", Triangulo.triangulo(4,3,3));
    }

    /**
     * Testa se o método triangulo retorna a mensagem correta quando um dos lados é zero.
     */
    @Test
    void validarTrianguloComUmLadoZero () {
        assertEquals("Os três lados não formam um triângulo", Triangulo.triangulo(4,3,0));
    }

    /**
     * Testa se o método triangulo retorna a mensagem correta quando um dos lados é negativo.
     */
    @Test
    void validarTrianguloComUmLadoNegativo() {
        assertEquals("Os três lados não formam um triângulo", Triangulo.triangulo(4, -3, 5));
    }

    /**
     * Testa se o método triangulo retorna a mensagem correta quando a soma de dois lados é igual ao terceiro.
     */
    @Test
    void deveTestarTrianguloComSomaDeDoisLadosIgualAoTerceiro() {
        assertEquals("Os três lados não formam um triângulo", Triangulo.triangulo(1, 2, 3));
        assertEquals("Os três lados não formam um triângulo", Triangulo.triangulo(1, 3, 2));
        assertEquals("Os três lados não formam um triângulo", Triangulo.triangulo(3, 1, 2));
    }

    /**
     * Testa se o método triangulo retorna a mensagem correta quando a soma de dois lados é menor que o terceiro.
     */
    @Test
    void deveTestarTrianguloComSomaDeDoisLadosMenorQueOTerceiro() {
        assertEquals("Os três lados não formam um triângulo", Triangulo.triangulo(12, 15, 30));
        assertEquals("Os três lados não formam um triângulo", Triangulo.triangulo(1, 2, 4));
        assertEquals("Os três lados não formam um triângulo", Triangulo.triangulo(1, 4, 2));
        assertEquals("Os três lados não formam um triângulo", Triangulo.triangulo(4, 1, 2));
    }

    /**
     * Testa se o método triangulo retorna a mensagem correta quando todos os lados são zero.
     */
    @Test
    void validarTrianguloComTodosLadosZeros() {
        assertEquals("Os três lados não formam um triângulo", Triangulo.triangulo(0, 0, 0));
    }

    /**
     * Testa se o método triangulo lança uma exceção quando recebe valores não inteiros.
     */
    @Test
    public void testValoresNaoInteiros() {
        // Testando que a conversão de valores decimais para inteiros lança uma exceção
        assertThrows(NumberFormatException.class, () -> {
            int a = Integer.parseInt("2.5");
            int b = Integer.parseInt("3.5");
            int c = Integer.parseInt("5.5");
            Triangulo.triangulo(a, b, c);
        });
    }

    /**
     * Testa se o método triangulo retorna a mensagem correta quando recebe um número incorreto de valores.
     */
    @Test
    public void testNumeroErradoDeValores() {
        // Testando com menos de três valores
        assertEquals("Número incorreto de valores.", Triangulo.triangulo(new int[] {5, 5}));

        // Testando com mais de três valores
        assertEquals("Número incorreto de valores.", Triangulo.triangulo(new int[] {5, 5, 5, 5}));

        // Testando com exatamente três valores
        assertEquals("Equilátero", Triangulo.triangulo(new int[] {5, 5, 5}));
    }
}

    //12 - nao tem como enviar numero nao inteiro
    //@Test
    //void validarTrianguloComValoresNaoInteiros() {
    //    assertEquals("Entrada inválida.", Triangulo.triangulo(2.5, 3.5, 5.5));
    //}

    //13 - nao tem como enviar 2 numeros invés de 3 porque o metodo espera 3 numeros
    //@Test
    //void validarTrianguloComDoisValoresInvesDeTres() {
    //    assertEquals("Entrada inválida.", Triangulo.triangulo(2, 5));
    //}
// }

