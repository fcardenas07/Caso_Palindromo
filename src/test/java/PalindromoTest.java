import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    @Test
    void doscientosDebeRetornarFalse() {
        assertFalse(Palindromo.esPalindromo("200"));
    }

    @Test
    void cadenaVaciaDebeRetornarFalse() {
        assertFalse(Palindromo.esPalindromo(""));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "h", "g"})
    void letrasNoSonPalindromosTest(String letra) {
        assertFalse(Palindromo.esPalindromo(letra));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aca", "aaabccbaaa", "reconocer", "rodador"})
    void palabrasPalindromoTest(String palabra) {
        assertTrue(Palindromo.esPalindromo(palabra));
    }

    @ParameterizedTest
    @ValueSource(strings = {"101", "110.010010011"})
    void numerosPalindromoTest(String numero) {
        assertTrue(Palindromo.esPalindromo(numero));
    }


    @ParameterizedTest
    @ValueSource(strings = {"La tele letal", "Atar a la rata", "¿Acaso hubo búhos acá?"})
    void frasesPalindromoTest(String frase) {
        assertTrue(Palindromo.esPalindromo(frase));
    }

    @ParameterizedTest
    @ValueSource(strings = {"acas", "palabra", "ahabccbaaa"})
    void palabrasNoPalindromosTest(String palabra) {
        assertFalse(Palindromo.esPalindromo(palabra));
    }

    @ParameterizedTest
    @ValueSource(strings = {"😁😊😂", "!°\"#$*][¨:_;^{^'?¡¿~"})
    void soloCaracteresEspecialesDebeRetornarFalse(String cadena) {
        assertFalse(Palindromo.esPalindromo(cadena));
    }

    @Test
    void quitarEspacioTest() {
        assertEquals("HolaMundo", Palindromo.quitarEspacios("Hola Mundo"));
    }

    @Test
    void quitarVariosEspaciosTest() {
        assertEquals("HolaMundo", Palindromo.quitarEspacios(" Ho l a   M u ndo  "));
    }

    @Test
    void quitarTildesTest() {
        assertEquals("aeiou", Palindromo.quitarTildeVocales("áéióu"));
    }

    @Test
    void quitarPuntuaciones() {
        assertEquals("Ab", Palindromo.quitarTodoMenosLetrasYNumeros("A. ,b;: '?*}{) !¡¡¿"));
    }

    @Test
    @DisplayName("Palindromo \"Amor Azul\" Dario Lancini")
    void palindromoMasGrandeDelMundoTest() {
        assertTrue(Palindromo.esPalindromo("""
                Amor azul
                                
                Ramera, de todo te di.
                                
                Mariposa colosal, sí,
                                
                yo de todo te di.
                                
                Poda la rosa, Venus.
                                
                El átomo como tal
                                
                es un evasor alado.
                                
                Pide, todo te doy: isla,
                                
                sol, ocaso, pirámide.
                                
                Todo te daré: mar, luz, aroma.
                """));
    }
}
