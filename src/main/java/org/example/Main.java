package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String palindromo = "salas";
        String cadena = "aleatorio";
        System.out.println(esPalindromo(palindromo));
        System.out.println(esPalindromo(cadena));

    }

    public static boolean validarVacio (String vacio) {
        if (vacio.length() == 0) {
            System.out.println("vacio");
            return false;
        } else return true;
    }
    public static boolean validarCorto (String vacio) {
        if (vacio.length() == 1 || vacio.length() == 2) {
            System.out.println("muy corto");
            return false;
        }else {
            return true;
    }
    }

    public static boolean esPalindromo(String cadena) {
        String cadenaLower = cadena.toLowerCase(Locale.ROOT);
        String pruebaLower = reverseString(cadena).toLowerCase(Locale.ROOT);
        if (validarVacio(cadenaLower)) {
            System.out.println("vacio");
        return false;
        } else if (validarCorto(cadenaLower)) {
            System.out.println("muy corto");
            return false;
        }else {
            if (cadenaLower.equals(pruebaLower)) {
                System.out.println("Es palindromo");
                System.out.println(cadenaLower);
                return true;
            } else {
                System.out.println("No es palindromo");
                System.out.println(cadenaLower + " - " + pruebaLower);
                return false;
            }
        }
    }

    public static String reverseString(String cadena) {
        String cadenaInvertida = "";
        char caracter;
        for (int i = cadena.length() - 1; i >= 0; i--) {
            caracter = cadena.charAt(i);
            cadenaInvertida = cadenaInvertida + caracter;
        }
        return cadenaInvertida;
    }

}