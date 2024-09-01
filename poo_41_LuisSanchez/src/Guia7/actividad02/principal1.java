package Guia7.actividad02;

public class principal1 {

    public static void main(String[] args) {
        Loro loro1 = new Loro();

        loro1.nombre = "Ferri";
        loro1.color = "Verde";
        loro1.edad = 5;
        loro1.hablar();
        loro1.volar();

        System.out.println("Nombre: " + loro1.nombre);
        System.out.println("Color: " + loro1.color);
        System.out.println("Edad: " + loro1.edad + " años");
    }
}
