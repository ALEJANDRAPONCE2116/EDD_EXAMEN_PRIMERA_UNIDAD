package insertar_valores_en_arreglo;

import java.util.Scanner;

public class INSERTAR_VALORES_EN_ARREGLO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        int[] array = new int[15];

        int aux = 0;

        
        System.out.println("Ingrese los valores que desea guardar:");
        for (int i = 14; i < 15; i--) {
            if (i >= 0) {
            int x = input.nextInt();
            input.nextLine();
            array[i] = x;
            sortArray(array, aux);
            printArray(array); // 
            System.out.println("");
            }
        }
    }


    public static void printArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print("[" + array[j] + "]");
        }
    }

 
    public static void sortArray(int[] array, int aux) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        
    }

}

/*
Isela Alejandra Ponce de León Carrasco
Ernesto Domínguez Meléndez
Vianey Hernandez
Luis Eduardo Valenzuela */