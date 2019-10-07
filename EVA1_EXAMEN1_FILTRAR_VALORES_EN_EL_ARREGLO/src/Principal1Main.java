
public class Principal1Main {

    public static void main(String[] args) {
        int arre[] = new int[15];
        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int) ((Math.random() * 100));
            for (int j = 0; j < i; j++) {
                if (arre[i] == arre[j]) {
                    i--;
                }
            }
            if (arre[i] % 2 == 1) {
                i--;
                System.out.print("[" + arre[i] + "]");

            }

        }
    }
}

/*
Isela Alejandra Ponce de León Carrasco
Ernesto Domínguez Meléndez
Vianey Hernandez
Luis Eduardo Valenzuela */
