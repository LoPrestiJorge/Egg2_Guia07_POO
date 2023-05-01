/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).

 */
package guia07_ejercicio02_circunferencia;


import guia07_ejercicio02_circunferencia.Circunferencia;
import java.util.Scanner;

public class Guia07_Ejercicio02_Circunferencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Circunferencia c1 = new Circunferencia(); 
        
        c1.crearCircunferencia();
        
        c1.area();
        
        c1.perimetro();
        
        c1.mostrar();
        
       
    }
}
