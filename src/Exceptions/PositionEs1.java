package Exceptions;

public class PositionEs1 extends Exception {
//    checked perchè dobbiamo scrivere del codice

    public PositionEs1() {
        super("Il numero inserito non è valido");
    }
}