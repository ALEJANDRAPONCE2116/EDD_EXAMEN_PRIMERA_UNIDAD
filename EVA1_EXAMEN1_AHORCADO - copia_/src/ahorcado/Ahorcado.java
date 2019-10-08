package ahorcado;
//import java.util.Arrays;
import java.util.Scanner;
public class Ahorcado {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        boolean igual = true; //compara
        int oportunidades = 4;
        char[] palabraCompletaArray = new char[0];
        char[] palabraCorchetes = new char[0];  
        char[][] palabrasarray = new char[5][6]; 
        int palabra = 1; //math random y case
        char[] palabraSeleccionada = new char[0]; //
        char[] palabraIntento = new char[0]; //palabra que mete el usuario
        int corchetesvacios = 0; //tamaño de la palabra
        int contadorcomparacion=0; //acumula comparaciones
        
            palabra = (int)(Math.random() * 4);
            
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
                case 0:
                    corchetesvacios = 3;
                    palabraCorchetes = new char[corchetesvacios]; 
                    palabraSeleccionada = new char[corchetesvacios];
                    for(int i = 0; i < palabraCorchetes.length; i++) {
                        palabraSeleccionada[i] = palabrasarray[0][i]; 
                    }

                    System.out.println(" ");
                    break;
                case 1:
                    corchetesvacios = 4;
                    palabraCorchetes = new char[corchetesvacios];
                    palabraSeleccionada = new char[corchetesvacios];
                    for(int i = 0; i < palabraCorchetes.length; i++) {

                        palabraSeleccionada[i] = palabrasarray[1][i];
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    corchetesvacios = 4;
                    palabraCorchetes = new char[corchetesvacios];
                    palabraSeleccionada = new char[corchetesvacios];
                    for(int i = 0; i < palabraCorchetes.length; i++) {

                        palabraSeleccionada[i] = palabrasarray[2][i];
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    corchetesvacios = 6;
                    palabraCorchetes = new char[corchetesvacios];
                    palabraSeleccionada = new char[corchetesvacios];
                    for(int i = 0; i < palabraCorchetes.length; i++) {

                        palabraSeleccionada[i] = palabrasarray[3][i];
                    }
                    System.out.println(" ");
                    break;
                case 4:
                    corchetesvacios = 5;
                    palabraCorchetes = new char[corchetesvacios];
                    palabraSeleccionada = new char[corchetesvacios];
                    for(int i = 0; i < palabraCorchetes.length; i++) {
                        palabraSeleccionada[i] = palabrasarray[4][i];
                    }
                    System.out.println(" ");
                    break;
            }
            
            //llenar espacios
            palabraIntento = new char[palabraSeleccionada.length];//inicializamos palabra intento 
            for (int i = 0; i < palabraSeleccionada.length; i++) {
                palabraIntento[i] = ' ';
            }
            
            //INICIA EL JUEGO 
            while(oportunidades > 0){ 
                for(int i = 0; i < palabraCorchetes.length; i++) { //
                        System.out.print("[");
                        System.out.print(palabraIntento[i]);//imprime el caracter de la posicion
                        System.out.print("]");
                    }
                System.out.println(" ---> Turnos: " +oportunidades);
                System.out.println("¿Conoces la palabra?");
                String respuesta = capturar.next();
                
                //PALABRA COMPLETA
                if(respuesta.equals("si")||respuesta.equals("SI")){
                    System.out.println("Ingresa la palabra completa");
                    String palabraCompleta = capturar.next();
                    palabraCompletaArray = palabraCompleta.toCharArray(); //toCarArray() = metoodo que convierte har a array
                    System.out.println();
                    
                    //CUANDO EL USUARIO METE UNA PALABRA COMPLETA
                    for (int i = 0; i < palabraSeleccionada.length; i++) { 
                        //cada vez que la comparacion de verdadero el contador se incrementar
                        if(palabraSeleccionada[i]!=palabraCompletaArray[i]){
                            igual = false;
                            break;
                        }
                    }
                    
                    //determinar si son iguales
                    if(igual == true){
                        System.out.println("GANASTE");
                        System.exit(0);
                    }else{ 
                        System.out.println("HAS PERDIDO");
                        System.exit(0);
                    }
                    
//SI INGRESA UN SOLO CARACTER
                }else{//en vez de preguntar palabra, se ingresa un caracter
                    System.out.println("Ingresa una letra.");
                    
                    char letra = capturar.next().charAt(0); // charAt(0) ---> metodo nativo de java que devuelve un caracter en la posicion n del String
                       for (int i = 0; i < palabraSeleccionada.length; i++){
                        if(letra == palabraSeleccionada[i]){
                            palabraIntento[i] = letra;  //i de palabra intento pasara a ser la letra
                            contadorcomparacion++;  //se pone aqui porque 
                        }  
                    }
                       
                    if (contadorcomparacion==palabraSeleccionada.length){
                            System.out.println("GANASTE");
                            System.exit(0);
                        }else{
                            oportunidades--;
                    if(oportunidades == 0){
                                System.out.println("Pierdes el juego");
                                System.exit(0);
                        }
                    }
                }
            }
    }
}
/*Isela Alejandra Ponce de León Carrasco
Ernesto Domínguez Meléndez
Vianey Hernandez
Luis Eduardo Valenzuela */