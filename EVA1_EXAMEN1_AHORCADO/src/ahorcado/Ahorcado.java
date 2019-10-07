package ahorcado;


import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        int oportunidades = 5;
        Scanner sc = new Scanner(System.in);
        char[] palabraCorchetes = new char[0];
        char[][] palabrasarray = new char[5][6];
        int palabra = 1;
        char[] palabraSeleccionada = new char[0];
        char[] palabraIntento = new char[0];
        int corchetesvacios = 0;
        int cont = 0;
        
        int count = 1;
        
        //Por motivos de prueba, comentamos el while.
        //while (oportunidades < 5) {
            palabra = (int)(Math.random() * 5);
            //palabra = 5;
            //1 Oso
            palabrasarray[0][0] = 'o';
            palabrasarray[0][1] = 's';
            palabrasarray[0][2] = 'o';

            //2 Gato
            palabrasarray[1][0] = 'g';
            palabrasarray[1][1] = 'a';
            palabrasarray[1][2] = 't';
            palabrasarray[1][3] = 'o';

            //3 Arma
            palabrasarray[2][0] = 'a';
            palabrasarray[2][1] = 'r';
            palabrasarray[2][2] = 'm';
            palabrasarray[2][3] = 'a';

            //4 Naruto
            palabrasarray[3][0] = 'n';
            palabrasarray[3][1] = 'a';
            palabrasarray[3][2] = 'r';
            palabrasarray[3][3] = 'u';
            palabrasarray[3][4] = 't';
            palabrasarray[3][5] = 'o';

            //5 mouse
            palabrasarray[4][0] = 'm';
            palabrasarray[4][1] = 'o';
            palabrasarray[4][2] = 'u';
            palabrasarray[4][3] = 's';
            palabrasarray[4][4] = 'e';

            
            switch (palabra) {
                case 1:
                    corchetesvacios = 3;
                    palabraCorchetes = new char[corchetesvacios];
                    palabraSeleccionada = new char[corchetesvacios];
                    for(int i = 0; i < palabraCorchetes.length; i++) {

                        palabraSeleccionada[i] = palabrasarray[0][i];
                    }

                    System.out.println(" ");
                    break;
                case 2:
                    corchetesvacios = 4;
                    palabraCorchetes = new char[corchetesvacios];
                    palabraSeleccionada = new char[corchetesvacios];
                    for(int i = 0; i < palabraCorchetes.length; i++) {

                        palabraSeleccionada[i] = palabrasarray[1][i];
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    corchetesvacios = 4;
                    palabraCorchetes = new char[corchetesvacios];
                    palabraSeleccionada = new char[corchetesvacios];
                    for(int i = 0; i < palabraCorchetes.length; i++) {

                        palabraSeleccionada[i] = palabrasarray[2][i];
                    }
                    System.out.println(" ");
                    break;
                case 4:
                    corchetesvacios = 6;
                    palabraCorchetes = new char[corchetesvacios];
                    palabraSeleccionada = new char[corchetesvacios];
                    for(int i = 0; i < palabraCorchetes.length; i++) {

                        palabraSeleccionada[i] = palabrasarray[3][i];
                    }
                    System.out.println(" ");
                    break;
                case 5:
                    corchetesvacios = 5;
                    palabraCorchetes = new char[corchetesvacios];
                    palabraSeleccionada = new char[corchetesvacios];
                    for(int i = 0; i < palabraCorchetes.length; i++) {
                        palabraSeleccionada[i] = palabrasarray[4][i];
                    }
                    System.out.println(" ");
                    break;
            }
            
            palabraIntento = new char[palabraSeleccionada.length];
            for (int i = 0; i < palabraSeleccionada.length; i++) {
                palabraIntento[i] = ' ';
            }
            while(oportunidades > 0){
                for(int i = 0; i < palabraCorchetes.length; i++) {
                        System.out.print("[");
                        System.out.print(palabraIntento[i]);
                        System.out.print("]");
                    }
                System.out.println(" ---> Turnos: " +oportunidades);
                System.out.println("¿Conoces la palabra?");
                String respuesta = sc.next();
                
                if(respuesta.equals("si")||respuesta.equals("SI")){
                    System.out.println("Ingresa la palabra completa");
                    String palabraCompleta = sc.next();
                    char[] palabraCompletaArray = palabraCompleta.toCharArray();
                    
                    System.out.println(Arrays.toString(palabraCompletaArray));
                    System.out.println();
                    for (int i = 0; i < palabraSeleccionada.length; i++) {
                    }
                    if(Arrays.toString(palabraCompletaArray).equals(Arrays.toString(palabraSeleccionada))){
                            System.out.println("¡Felicidades, ganaste el juego!");
                            System.exit(0);
                        }
                }else{
                    System.out.println("Ingresa una letra.");
                    char letra = sc.next().charAt(0);
                    
                    for (int i = 0; i < palabraSeleccionada.length; i++){
                        if(letra == palabraSeleccionada[i]){
                            palabraIntento[i] = letra;
                            oportunidades++;
                            if(Arrays.toString(palabraIntento).equals(Arrays.toString(palabraSeleccionada))){
                                System.out.println("¡Felicidades, ganaste el juego!");
                                System.exit(0);
                            }
                        }
                    }
                    oportunidades--;
                    if(oportunidades == 0){
                                System.out.println("Pierdes el juego");
                                System.exit(0);
                            }
                }
               
            }
    }
}
/*Isela Alejandra Ponce de León Carrasco
Ernesto Domínguez Meléndez
Vianey Hernandez
Luis Eduardo Valenzuela */