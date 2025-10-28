package decorator;

import composite.Caja;

public class SmsNotificador extends NotificadorDecorator {
    public SmsNotificador(Caja c) {
        super(c);
    }

    @Override
    public int getNumeroPorciones(){
        int numPorciones = super.getNumeroPorciones();
        System.out.println("Enviando SMS: Num de porciones = " + numPorciones);
        return numPorciones;
    }
}