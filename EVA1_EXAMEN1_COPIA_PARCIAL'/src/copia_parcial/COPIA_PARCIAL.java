package copia_parcial;

import java.util.Scanner;

public class COPIA_PARCIAL {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Se genera arreglo de tamaño 15
        Aux[] array = new Aux[15];

        // Se instancia arreglo para copiar en el rango que pida el usuario
        Aux[] arrayCopy;

        // Se llena el arreglo original con valores aleatorios entre 1 y 20
        for (byte i = 0; i < array.length; i++) {
            array[i] = new Aux();
            array[i].x = (byte) ((byte) (Math.random() * 20) + 1);
        }

        // Se imprime el arreglo
        printArray(array);

        // Se pregunta al usuario en qué rango desea copiar
        System.out.println("¿En qué rango deseas copiar el arreglo?");
        System.out.print("Inicio: ");
        byte start = input.nextByte();
        input.nextLine();
        System.out.print("Final: ");
        byte end = input.nextByte();
        input.nextLine();

        // Se calcula el tamaño requerido para el arreglo, tomando el rango soliticado por el usuario
        // y tomando en cuenta solo valores pares del arreglo original
        byte arrayCopySize = 0;
        for (byte i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                arrayCopySize++;
            }
        }

        // Se crea la copia del arreglo del tamaño requerido 
        arrayCopy = new Aux[arrayCopySize];
        for (int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] = new Aux();
        }

        // Se evalúan valores en el rango solicitado por el usuario. Los pares se filtran y son 
        // añadidos a la copia del arreglo
        int aux = 0;
        for (byte i = start; i < end; i++) {
            if (array[i].x % 2 == 0) {
                arrayCopy[aux].x = array[i].x;
                aux++;
            }
        }
        
        
        // Se limpian valores basura de la copia del arreglo
        /*int y = 0;
        QUITAR_ELEMENTO(arrayCopy, y);*/
        
        // Se imprime la copia del arreglo
        printArray(arrayCopy);
    }

    // Método para imprimir arreglo
    public static void printArray(Aux[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i].x + "]");
        }
        System.out.println("");
    }

    // Método para eliminar basura de la copia del arreglo
    public static int QUITAR_ELEMENTO(Aux iArreglo[], int y) { // SE CREA UNA FUNCION PARA ELIMINAR EL NUMERO

        int num = 0; //variable para guardar el numero

        for (int i = 0; i < iArreglo.length; i++) {
            if (iArreglo[i].x != y) {
                iArreglo[num++] = iArreglo[i];
            }
        }
        return num;
    }
    
    // Clase para almacenar temporalmente los datos que van a copiarse (Como en EVA1_9_ARREGLO_OBJETOS)
    static class Aux {
        
        byte x = 0;
    }
    
}
