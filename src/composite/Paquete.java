package composite;
import java.util.ArrayList;
import java.util.List;

public class Paquete implements Caja {
    private List<Caja> children;

    public Paquete(){
        children = new ArrayList<>();
        System.out.println("Añado una caja de Paquete de cajas");
    }

    public void add(Caja c) {
        children.add(c);
    }

    public void remove(Caja c) {
        children.remove(c);
    }

    public List<Caja> getChildren() {
        return children;
    }

    @Override
    public int getNumeroPorciones() {
        int total = 0;
        for(Caja c : children) {
            total += c.getNumeroPorciones();
        }
        return total;
    }
}
