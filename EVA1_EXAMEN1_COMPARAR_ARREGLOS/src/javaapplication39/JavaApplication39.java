    public static void main(String[] args) {
        Scanner scapturar = new Scanner(System.in);
        int[] aiArreglo1 = new int[3];
        int[] aiArreglo2 = new int[3];
        boolean bool = true;

        //CAPTURAR
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

        //COMPARACION
        for (int i = 0; i < aiArreglo1.length; i++) {
            
                if (aiArreglo1[i] != aiArreglo2[i]) {
                    bool = false;
                }
            System.out.println(bool);
        }

        if (bool = false) {
            System.out.println("Son diferentes");

        } else {
            System.out.println("Son iguales");
        }
    }
    }

/*
Isela Alejandra Ponce de León Carrasco
Ernesto Domínguez Meléndez
Vianey Hernandez
Luis Eduardo Valenzuela */
    

