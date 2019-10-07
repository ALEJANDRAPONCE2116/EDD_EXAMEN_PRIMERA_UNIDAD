package Principal3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scapturar = new Scanner(System.in);
        int[] aiArreglo1 = new int[10]; //arreglo1
        int[] aiArreglo2 = new int[10]; //arreglo2
        boolean iguales = false;

        //input
        for (int i = 0; i < aiArreglo1.length; i++) {
            System.out.println("Ingrese valor del primer arreglo");
            aiArreglo1[i] = scapturar.nextInt();
        }
        for (int j = 0; j < aiArreglo2.length; j++) {
            System.out.println("Ingrese valor del segundo arreglo");
            aiArreglo2[j] = scapturar.nextInt();
        }

        //IMPRIMIR = o !=
        System.out.print("Arreglo 1: [");
        for (int k = 0; k < aiArreglo1.length; k++) {
            System.out.print(aiArreglo1[k] + ", ");
        }
        System.out.print("]" + "\n");

        System.out.print("Arreglo 2: [");
        for (int l = 0; l < aiArreglo2.length; l++) {
            System.out.print(aiArreglo2[l] + ", ");
        }
        System.out.print("]" + "\n");

        
        for (int i = 0; i < 10; i++) {
            iguales = comparar(aiArreglo1[i], aiArreglo2);
            if (iguales == false) {
                break;
            }else if (iguales == true){
                break;
            }
        }
        if(iguales){
            System.out.println("Son similares");
        }else if (!iguales){
            System.out.println("No son similares");
        }
        
    }
    
    //metodo para COMPARAR SIMILITUD
    public static boolean comparar(int valor, int[] arreglo) {
        boolean bool = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (valor == arreglo[i]) {
                bool = true;
            }
        }
        return bool;
    }
}
/*
Isela Alejandra Ponce de León Carrasco
Ernesto Domínguez Meléndez
Vianey Hernandez
Luis Eduardo Valenzuela */