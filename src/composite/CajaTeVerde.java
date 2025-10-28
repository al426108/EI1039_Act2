package composite;

public class CajaTeVerde implements Caja {
    private final int porciones = 24;

    public CajaTeVerde(){
        System.out.println("Añado una caja de Te Verde");
    }

    @Override
    public int getNumeroPorciones() {
        return porciones;
    }
}
