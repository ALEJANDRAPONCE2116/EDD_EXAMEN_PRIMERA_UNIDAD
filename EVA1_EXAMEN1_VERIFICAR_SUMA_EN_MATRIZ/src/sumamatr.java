
import java.util.Scanner;
import java.util.Arrays; //libreria para imprimir matriz de manera mas facil
public class sumamatr {
    public static void main(String[] args) {
        int sumaFilas = 0;  
        int sumaCols = 0;  
        int tamaño =4;  
        int eleccionCol = 0; 
        int eleccionFila = 0;  
        
        Scanner capturar = new Scanner(System.in);
        
        int [][] matriz = new int[tamaño][tamaño];
        
        //Llenar matriz con numeros aleatorios 
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
        
        System.out.println(Arrays.toString(matriz[0])+
                "\n"+Arrays.toString(matriz[1])+
                "\n"+Arrays.toString(matriz[2])+
                "\n"+Arrays.toString(matriz[3]));
        
        System.out.println("Ingresa la columna para hacer su suma y calcular su promedio (0 - 3)");
        eleccionCol = capturar.nextInt();
        
        for (int i = 0; i < tamaño; i++) {
            sumaCols += matriz[i][eleccionCol];
            //System.out.println(sumaFilas);
        }
        
        System.out.println("Ingresa la fila para hacer su suma y calcular su promedio (0 - 3)");
        eleccionFila = capturar.nextInt();

        for (int i = 0; i < tamaño; i++) {
            sumaFilas += matriz[eleccionFila][i];
            //System.out.println(sumaCols);
        }
                    
            System.out.println("Suma columna "+eleccionCol+": "+sumaCols);
            System.out.println("Suma fila "+eleccionFila+": "+sumaFilas);
            System.out.println("Promedio columna 0: "+(double)sumaCols/4); 
            System.out.println("Promedio fila 0: "+(double)sumaFilas/4);
            
            if((double)sumaCols/4 == (double)sumaFilas/4){
                System.out.println("El promedio de la columna "+eleccionCol+" es igual al"
                        + " promedio de la fila "+eleccionFila);
            }else{
                System.out.println("Los promedios no son iguales");
            }
    }
}