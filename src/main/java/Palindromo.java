import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        String texto = ingresarTexto();
        System.out.println(esPalindromo(texto));

    }

    public static boolean esPalindromo(String texto) {
        texto = formatearTexto(texto);

        if (texto.isBlank()) return false;
        return texto.equals(invertirTexto(texto));
    }

    private static String formatearTexto(String texto) {
        texto = texto.toLowerCase();
        texto = quitarEspacios(texto);
        texto = quitarTildes(texto);
        texto = quitarPuntuaciones(texto);
        return texto;
    }

    public static String quitarPuntuaciones(String texto) {
        return texto.replaceAll("[^\\w\\d]", "");
    }

    public static String quitarTildes(String texto) {
        char[] vocalesConTilde = {'á', 'é', 'í', 'ó', 'ú'};
        char[] vocalesSinTilde = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < vocalesConTilde.length; i++) {
            texto = texto.replace(vocalesConTilde[i], vocalesSinTilde[i]);
        }
        return texto;
    }

    public static String quitarEspacios(String texto) {
        return texto.replaceAll("\s", "");
    }

    public static String invertirTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public static String ingresarTexto() {
        return new Scanner(System.in).next();
    }
}
