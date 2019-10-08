/**
 * Genera un arreglo de números pares sin que ninguno se repita y lo imprime.
 */

package filtrar_valores_en_el_arreglo;

public class FILTRAR_VALORES_EN_EL_ARREGLO {

    public static void main(String[] args) {

        // Se genera arreglo de tamaño 15
        int array[] = new int[15];

        // Variables auxiliares
        int x = 0;
        boolean duplicateFound = false;

        // Llena el arreglo con números pares sin que se repitan valores dentro del arreglo
        for (int i = 0; i < array.length; i++) {

            // Para cada posición del arreglo se genera un número aleatorio entre 1 y 100 y se almacena en "x"
            // Se verifica que el número generado no exista ya en el arreglo
            do {
                duplicateFound = false;
                x = (int) ((Math.random() * 100) + 1);
                // Se comprueba que el número generado no exista ya dentro del arreglo
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == x) { // Si el número en la posición actual del arreglo es igual al de la variable aleatoria generada, "duplicateFound" se hace _true_
                        duplicateFound = true;
                        break;
                    } else if (array[j] == x + 1) { // Evita que en caso de sumarse un número para volverlo par, sea un número repetido
                        duplicateFound = true;
                        break;
                    }
                }
            } while (duplicateFound); // El ciclo se repetirá hasta que "x" tenga un número que aún no exista en el arreglo

            // Se filtran números pares
            if (x % 2 == 0) { // Revisa si el número aleatorio generado es par
                array[i] = x; // Si el número es par, lo almacena en la posición actual del arreglo
            } else {
                array[i] = x + 1;  // Si el número es impar, le suma 1 para hacerlo par y lo almacena en la posición actual del arreglo
            }
        }

        // Imprime el arreglo
        printArray(array);

    }

    // Método que imprime el arreglo
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }
}
