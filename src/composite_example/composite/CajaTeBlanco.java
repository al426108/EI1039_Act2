package composite_example;

public class CajaTeBlanco implements Caja {
    private final int porciones = 60;

    public CajaTeBlanco(){
        System.out.println("Añado una caja de Te Blanco");
    }

    @Override
    public int getNumeroPorciones() {
        return porciones;
    }
}
