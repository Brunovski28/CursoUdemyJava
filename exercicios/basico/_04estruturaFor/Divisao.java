package exercicios.basico._04estruturaFor;

import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        for (int i=0; i<n; i++) {

            int x = entrada.nextInt();
            int y = entrada.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
        
    }
    
}
