package Esercizio3;
import Exceptions.BancaException;

import java.io.IOException;

public class Es3 {
    public static void main(String[] args) throws BancaException {
        ContoCorrente conto1 = new ContoCorrente("Kevin",10);
        ContoOnLine conto2 = new ContoOnLine("Umberto",11,3);
        conto1.preleva(8);
        conto1.preleva(5);
        conto2.preleva(2);
        conto2.preleva(5);
    }
}
