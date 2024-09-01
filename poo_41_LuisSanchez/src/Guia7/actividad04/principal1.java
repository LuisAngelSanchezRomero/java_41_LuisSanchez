package Guia7.actividad04;

public class principal1 {

    public static void main(String[] args) {
        coche1 miCoche = new coche1("Ferrari", "Deportivo", 2019, "Verde");

        // Mostrar la información inicial del coche
        miCoche.mostrarInfo();
        miCoche.acelerar(50.0);
        System.out.println("Después de acelerar:");
        miCoche.mostrarInfo();
        miCoche.frenar(20.0);
        System.out.println("Después de frenar:");
        miCoche.mostrarInfo();
        miCoche.reparar();
    }
}

