package decorator;

import composite.Caja;

public class NotificadorDecorator implements Caja {
    private Caja wrapee;

    public NotificadorDecorator(Caja c) {
        this.wrapee = c;
    }

    @Override
    public int getNumeroPorciones() {
        return this.wrapee.getNumeroPorciones();
    }
}
