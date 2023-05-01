/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package guia07_extra05_empleado;

import java.util.Scanner;

public class Empleado {

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    private String nombre;
    private int edad;
    private double salario;
    private final Scanner sc = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcular_aumento() {
        double aumento = 0;
        if (edad >= 32) {
            aumento = (this.getSalario() + (this.getSalario() * 0.11));
            //aumento = aumento *1.1 es equivalente
        } else {
            aumento = (this.getSalario() + (this.getSalario() * 0.05));
        }
        return aumento;
    }

    public Empleado crear() {
        String anombre;
        int aedad;
        double asalario;
        System.out.println("Ingrese nombre");
        anombre = sc.nextLine();
        System.out.println("Ingrese edad");
        aedad = sc.nextInt();
        System.out.println("Ingrese salario");
        asalario = sc.nextDouble();

        Empleado e = new Empleado(anombre, aedad, asalario);
        return e;
    }
}
