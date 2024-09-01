package Guia7.actividad05;
// Actividad 5
public class Persona {

    // Atributos
    String nombre;
    int edad;
    String ciudad;
    String genero;

    // Método constructor
    public Persona(String nombre, int edad, String ciudad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.genero = genero;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Género: " + genero);
    }
}
