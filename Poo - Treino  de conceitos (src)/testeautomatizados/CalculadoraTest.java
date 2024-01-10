package testeautomatizados;

import calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
   


        /* Testes s�o divididos em tr�s partes
         * C�nario * O Esperado * O resultado */
        @Test
        public void deveriaSomarDoisNumerosPositivos() {
            Calculadora calculadora = new Calculadora();
            int sum = calculadora.sum(3, 7);

            Assertions.assertEquals(10, sum); //Susbtitui o System.out
        }
    

/* Usando o jUnit � bem mais pr�tico, pois se tem uma resposta mais
visual, e os cen�rios de testes ficam mais segregados
 */
}
