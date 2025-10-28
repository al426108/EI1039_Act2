import composite.Caja;
import composite.CajaTeBlanco;
import composite.CajaTeVerde;
import composite.Paquete;
import decorator.EmailNotificador;
import decorator.SmsNotificador;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- EJERCICIO 3 -----");
        ejercicio3();
        System.out.println("-----------------------");
        System.out.println("----- EJERCICIO 4 -----");
        ejercicio4();
        System.out.println("-----------------------");
    }

    private static void ejercicio3() {
        System.out.println("Demo Empaquetador de Té...");

        Paquete paquete1 = new Paquete();
        paquete1.add(new CajaTeBlanco());
        paquete1.add(new CajaTeBlanco());
        paquete1.add(new CajaTeVerde());

        Paquete paquete2 = new Paquete();
        paquete2.add(new CajaTeVerde());
        paquete2.add(new CajaTeVerde());
        paquete2.add(new CajaTeBlanco());

        Paquete envioAsia = new Paquete();
        envioAsia.add(paquete1);
        envioAsia.add(paquete2);

        int totalPaquete1 = paquete1.getNumeroPorciones();
        System.out.println("Este paquete consta de " + totalPaquete1 + " unidades");

        int totalPaquete2 = paquete2.getNumeroPorciones();
        System.out.println("Este paquete consta de " + totalPaquete2 + " unidades");

        int totalEnvio = envioAsia.getNumeroPorciones();
        System.out.println("Este paquete consta de " + totalEnvio + " unidades");
        System.out.println("El envío a Asia contiene " + totalEnvio + " unidades de té");
    }

    private static void ejercicio4() {
        System.out.println("Demo Empaquetador de Té...");

        Paquete paquete1 = new Paquete();
        paquete1.add(new CajaTeBlanco());
        paquete1.add(new CajaTeBlanco());
        paquete1.add(new CajaTeVerde());

        Paquete paquete2 = new Paquete();
        paquete2.add(new CajaTeVerde());
        paquete2.add(new CajaTeVerde());
        paquete2.add(new CajaTeBlanco());

        Paquete envioAsia = new Paquete();
        envioAsia.add(paquete1);
        envioAsia.add(paquete2);

        Caja notificarEmail = new EmailNotificador(envioAsia);
        Caja notificarTambienSms = new SmsNotificador(notificarEmail);

        int totalPaquete1 = paquete1.getNumeroPorciones();
        System.out.println("Este paquete consta de " + totalPaquete1 + " unidades");

        int totalPaquete2 = paquete2.getNumeroPorciones();
        System.out.println("Este paquete consta de " + totalPaquete2 + " unidades");

        int totalEnvio = notificarTambienSms.getNumeroPorciones();
        System.out.println("Este paquete consta de " + totalEnvio + " unidades");
        System.out.println("El envío a Asia contiene " + totalEnvio + " unidades de té");
    }
}
