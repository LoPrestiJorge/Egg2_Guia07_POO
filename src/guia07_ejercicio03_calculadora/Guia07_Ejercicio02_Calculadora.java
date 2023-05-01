/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 */
package guia07_ejercicio03_calculadora;

import java.util.Scanner;

public class Guia07_Ejercicio02_Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Operacion n = new Operacion();
        
        n.crearOperacion(); //Para pedir los números 
        
        //Para mostrar los números usando get
        System.out.println("Los números seleccionados son: "+n.getNum1()+", "+n.getNum2());
        
        //Métodos para realizar las operaciones
        n.suma();
        n.restar();
        n.multiplicar();
        n.dividir();
        
        //método para mostrar.
        n.mostrar();
                
      
        
    }
    
    
}
