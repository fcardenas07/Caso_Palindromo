public class PalindromoOld {

    public static void main(String[] args) {
    }

    public static String invertirTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public static boolean esPalindromo(String texto) {
        if (texto.isBlank()) return false;
        return texto.equals(invertirTexto(texto));
    }

}
