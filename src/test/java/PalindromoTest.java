import org.junit.jupiter.api.Test;

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

    @Test
    void palabrasPalindromo() {
        assertAll("Son Palindromos",
                () -> assertTrue(Palindromo.esPalindromo("aca")),
                () -> assertTrue(Palindromo.esPalindromo("h")),
                () -> assertTrue(Palindromo.esPalindromo("aaabccbaaa"))
        );
    }

    @Test
    void numeroPalindromoTest(){
        assertAll("Son palindromos",
                () -> assertTrue(Palindromo.esPalindromo("101")),
                () -> assertTrue(Palindromo.esPalindromo("110.010010011"))
                );
    }



    @Test
    void frasesPalidromos() {
        assertAll("Frases Palindromos",
                () -> assertTrue(Palindromo.esPalindromo("La tele letal")),
                () -> assertTrue(Palindromo.esPalindromo("Atar a la rata"))
        );
    }

    @Test
    void palabrasNoPalindromo() {
        assertAll("No son Palindromos",
                () -> assertFalse(Palindromo.esPalindromo("acas")),
                () -> assertFalse(Palindromo.esPalindromo("ahabccbaaa")),
                () -> assertFalse(Palindromo.esPalindromo("😁😊😂"))
        );
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
