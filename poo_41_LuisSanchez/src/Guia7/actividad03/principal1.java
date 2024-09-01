package Guia7.actividad03;

public class principal1 {

    public static void main(String[] args) {
        // Crear una instancia de la clase auto
        auto miAuto = new auto();

        miAuto.marca = "Toyota";
        miAuto.modelo = "Corolla";
        miAuto.año = 2022;
        miAuto.encender();
        miAuto.acelerar();
        miAuto.frenar();
        miAuto.apagar();

        // Usar métodos que devuelven valores
        String nombreCompleto = miAuto.obtenerNombreCompleto();
        int año = miAuto.obtenerAño();

        // Mostrar el nombre completo del auto y el año
        System.out.println("Información adicional del auto:");
        System.out.println("Nombre completo del auto: " + nombreCompleto);
        System.out.println("Año del auto: " + año);
    }
}
