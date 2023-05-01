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

import java.util.Scanner;


public class Circunferencia {
    private double radio;
    Scanner sc = new Scanner(System.in);
    Circunferencia() {}    
 
//Metodo constructor para inicializar el radio.    
public Circunferencia (double radio) {
    this.radio = radio;
}   

public void setRadio(double radio) {
        this.radio = radio;
    }
public double getRadio() {
        return radio;
    }

public void crearCircunferencia(){
       System.out.println("Ingrese el radio de la circuferencia: ");
       this.radio = sc.nextDouble();
   }

    //método o función para calcular el area.
   public double area(){
       double area = Math.PI*(Math.pow((radio),2)); //para agregar el valor PI 
        return area;
   }
   
   //método o función para calcular el perímetro.
   public double perimetro(){
       double perimetro = 2*Math.PI*radio; 
        return perimetro;
   }

   //método o función para mostrar por pantalla los resultados.
   public void mostrar(){
       System.out.println("El area es: "+this.area());
       System.out.println("El perimetro es: "+this.perimetro());
   }
   
   
}

