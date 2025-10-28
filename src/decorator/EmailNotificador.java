package decorator;

import composite.Caja;

public class EmailNotificador extends NotificadorDecorator {
    public EmailNotificador(Caja c) {
        super(c);
    }

    @Override
    public int getNumeroPorciones(){
        int numPorciones = super.getNumeroPorciones();
        System.out.println("Enviando email: Num de porciones = " + numPorciones);
        return numPorciones;
    }
}
