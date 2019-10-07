package arreglo_con_posiciones_pares;

public class ARREGLO_CON_POSICIONES_PARES {

    public static void main(String[] args) {
        byte[] array = new byte[15];

        byte x = 0;

        for (byte i = 0; i < array.length; i++) {
            x = (byte) ((Math.random() * 100) + 1); 
            if (i % 2 == 0) { 
                if (x % 2 == 0) { 
                    array[i] = x;
                } else {
                    array[i] = (byte) (x + 1); 
                }
            } else { 
                array[i] = x;
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }
}

/*
Isela Alejandra Ponce de León Carrasco
Ernesto Domínguez Meléndez
Vianey Hernandez
Luis Eduardo Valenzuela */