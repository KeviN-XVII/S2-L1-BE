package Esercizio2;

import java.util.Scanner;

public class Es2Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try{
            System.out.println("Inserisci i Km percorsi :");
            int Km = scanner.nextInt();
            System.out.println("Inserisci i litri utilizzati :");
            int litri = scanner.nextInt();
            int kmlitro = Km / litri;
            System.out.println("km per litro percorsi : " + kmlitro);
        }catch(Exception e){
            System.out.println("valore non valido");
        }
        finally{
            scanner.close();
        }

    }

}
