public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    // Solución (menos eficiente):
    private static boolean isPalindrome (int number) {
        if (number < 0) {  // Valido que el parámetro number sea positivo.
            return false;
        }
        String stringNumber = String.valueOf(number);  // Creo la variable stringNumber, transformando number en un string.
        String reversedNumber = "";  // Creo la variable reversedNumber, siendo un nuevo string vacío.

        for(int i=stringNumber.length()-1; i>=0; i--) {  // Recorro el string con la variable stringNumber de atrás hacia adelante.
            reversedNumber+=stringNumber.charAt(i);  // Voy agregando cada valor de índice en el string vacío, creando el número al revés.
        }
        return reversedNumber.equals(stringNumber);  // Comparo ambos strings con .equals().
    }
    // Solución (más eficiente):
    private static boolean isPalindromeSimplified (int number) {
        if (number < 0) {  // Valido que el parámetro number sea positivo.
            return false;
        }
        int reversedNumber = 0;  // Creo la variable reversedNumber, para almacenar el número al revés.
        int originalNumber = number;  // Creo la variable originalNumber, con el valor de number (reservando el valor íntegro).

        // Uso un bucle while, en el que en cada iteración:
        while (number > 0) {
            int lastDigit = number % 10;  // - Creo (o reasigno) la variable lastDigit cuyo valor es el mod 10 del número.
            reversedNumber = reversedNumber * 10 + lastDigit;  // - Multiplico reversedNumber * 10, y luego le agrego lastDigit actualizado en cada iteración (creando el número al revés).
            number /= 10;  // - Divido number / 10, para remover el último dígito.
        }
        return originalNumber == reversedNumber;  // Finalmente, comparo el número original con el número revertido.
    }
}