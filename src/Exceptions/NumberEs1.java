package Exceptions;

public class NumberEs1 extends Exception {
//    checked perchè dobbiamo scrivere del codice

    public NumberEs1() {
        super("Il numero della posizione inserita non è valida");
    }
}
