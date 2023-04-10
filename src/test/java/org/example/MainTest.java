package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void esPalindromo() {
        String prueba = "";
        Main.esPalindromo(prueba);
        assertTrue(true);
    }
    @Test
    void esPalindromo1() {
        String numero = "200";
        Main.esPalindromo(numero);
        assertTrue(false);
    }
    @Test
    void esPalindromo2() {
        String numero = "ahabccbaaa";
        Main.esPalindromo(numero);
        assertTrue(true);
    }

    @Test
    void esPalindromo3() {
        String numero = "La tele letal";
        Main.esPalindromo(numero);
        assertTrue(false);
    }
    @Test
    void esPalindromo4() {
        String numero = "aaabccbaaa";
        Main.esPalindromo(numero);
        assertTrue(false);
    }

}