/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package guia07_ejercicio04_rectangulo;

import java.util.Scanner;

public class Rectangulo {

    private static Scanner entrada = new Scanner(System.in);

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //método constructor vacío
    Rectangulo() {
    }

    //método función para cargar datos.
    public void cargar() {
        System.out.println("Ingrese la base del rectángulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectángulo: ");
        altura = entrada.nextDouble();
    }

    public double superficie() {
        double superficie = base * altura;
        return superficie;
    }

    public double perimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void mostrar() {
        System.out.println("La superficie del rectángulo es: " + this.superficie());
        System.out.println("El perímetro del rectángulo es: " + this.perimetro());
        System.out.println("---------------------------------------------------");
    }

    public void dibujoRectangulo() {
        for (int i = 0; i < this.base; i++) {
            for (int j = 0; j < this.altura; j++) {
                System.out.print("* ");
            }
         System.out.println("");
        }

    }
}
