package Guia7.actividad04;
// Actividad 4
public class coche1 {

    // Atributos
    String marca;
    String modelo;
    int anio;
    String color;
    double velocidadActual;

    // Constructor
    public coche1(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.velocidadActual = 0.0;
    }

    // Métodos
    public void acelerar(double cantidad) {
        velocidadActual += cantidad;
    }

    public void frenar(double cantidad) {
        velocidadActual = Math.max(0, velocidadActual - cantidad);
    }

    public void reparar() {
        System.out.println("El coche ha sido reparado.");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }
}
