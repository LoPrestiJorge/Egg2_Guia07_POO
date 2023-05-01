/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package guia07_extra05_empleado;

public class Extra05_Empleado {

    public static void main(String[] args) {
        Empleado e = new Empleado();
        e = e.crear();
        System.out.println("El sueldo actualizado de acuerdo a la edad es " + e.calcular_aumento());

        Empleado e2 = new Empleado();
        e2 = e2.crear();
        System.out.println("El sueldo de e2 actualizado de acuerdo a la edad de acuerdoo2232  " + e2.calcular_aumento());
    }

}
