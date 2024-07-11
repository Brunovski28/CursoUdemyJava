package exercicios.basico._03estruturaWhile;

import java.util.Scanner;

public class LeituraSenha {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int senha = entrada.nextInt();

        while (senha != 2002){
            System.out.println("Senha inválida");
            senha = entrada.nextInt();
        }

        System.out.println("Acesso permitido");

    }

}
