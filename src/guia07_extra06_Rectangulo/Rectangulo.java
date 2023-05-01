/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package guia07_extra06_Rectangulo;

import java.util.Scanner;

public class Rectangulo {
    double lado1, lado2;
    private static Scanner sc = new Scanner(System.in);
    public Rectangulo() {
    }
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double calcular_area(){    
        return (this.lado1 * this.lado2);
    }
}
