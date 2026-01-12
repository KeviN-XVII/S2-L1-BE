package Esercizio1;

import Exceptions.NumberEs1;
import Exceptions.PositionEs1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es1 {
        public static void main(String[] args) throws NumberEs1, PositionEs1 {
            int[] numeri = new int[5];
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            for  (int i = 0; i < numeri.length; i++) {
                int MathRandom = random.nextInt(10)+1;
                numeri[i] = MathRandom;
            }
            System.out.println(Arrays.toString(numeri));
        int numUser;
        int numPosizione;

            do {
                System.out.print("Inserisci un numero da 1 a 10 o 0 per interrompere: ");
                numUser = scanner.nextInt();

                if (numUser == 0) {
                    System.out.println("Programma terminato");
                }
                else if (numUser > 0 && numUser <= 10) {
                    System.out.print("Inserisci la posizione da 1 a 5: ");
                    numPosizione = scanner.nextInt();

                    if (numPosizione > 0 && numPosizione <= 5) {
                        numeri[numPosizione - 1] = numUser;
                        System.out.println(Arrays.toString(numeri));
                    } else {
                        throw new NumberEs1();
                    }
                }
                else {
                    throw new PositionEs1();
                }

            } while (numUser != 0);
        }
    }
