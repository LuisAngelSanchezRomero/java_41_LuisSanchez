package Guia7.actividad03;
// Actividad 3
public class auto {

    // Atributos
    String marca;
    String modelo;
    int año;

    // Métodos
    public void encender() {
        System.out.println("El auto " + marca + " " + modelo + " está encendido.");
    }

    public void apagar() {
        System.out.println("El auto " + marca + " " + modelo + " está apagado.");
    }

    public void acelerar() {
        System.out.println("El auto " + marca + " " + modelo + " está acelerando.");
    }

    public void frenar() {
        System.out.println("El auto " + marca + " " + modelo + " está frenando.");
    }

    // Método que devuelve el nombre completo del auto
    public String obtenerNombreCompleto() {
        return marca + " " + modelo;
    }

    // Método que devuelve el año del auto
    public int obtenerAño() {
        return año;
    }
}
