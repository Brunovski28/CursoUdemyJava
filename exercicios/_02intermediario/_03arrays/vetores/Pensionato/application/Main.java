package exercicios._02intermediario._03arrays.vetores.Pensionato.application;

import exercicios._02intermediario._03arrays.vetores.Pensionato.entities.Room;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos quartos vai ser alugado?");
        int nRooms = entrada.nextInt();

        Room[] room = new Room[nRooms];

        for (int i = 0; i < room.length; i++) {

            System.out.println("Alugel #" + (i + 1));
            System.out.println("Digite o nome do estudante");
            String name = entrada.nextLine();
            name = entrada.nextLine();

            System.out.println("Digite o e-mail do estudante");
            String mail = entrada.nextLine();

            System.out.println("Digite o Número do quarto");
            int numberRoom = entrada.nextInt();

            room[i] = new Room(name, mail, numberRoom);

        }

        int[] allRooms = new int[nRooms];
        int[] index = new int[nRooms];

        // For da linha 39 até 65 com objetivo de ordenar o vetor por quartos em ordem decrescente
        for (int i = 0; i < allRooms.length; i++) {

            int numberMinimum = 0;
            int temp = 0;

            for (int j = 0; j < room.length; j++) {

                int count = 0;

                for (int k = 0; k < allRooms.length; k++) {

                    if (room[j].getNumberRoom() == allRooms[k]) {
                        count++;
                    }

                }

                if (count == 0) {
                    if (room[j].getNumberRoom() > numberMinimum) {
                        numberMinimum = room[j].getNumberRoom();
                        temp = j;
                    }
                }
            }
            allRooms[i] = numberMinimum;
            index[i] = temp;
        }

        for (int i = room.length - 1; 0 < i + 1; i--) {
            System.out.println("============================");
            System.out.println(room[index[i]].toString());
        }
    }
}
