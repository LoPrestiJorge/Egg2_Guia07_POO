/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package guia07_extra03_adivinador;

import java.util.Scanner;

public class Juego {

    private static Scanner entrada = new Scanner(System.in);
    double num1;
    double num2;
    int victoriasj1 = 0;
    int victoriasj2 = 0;

    public Juego(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Juego() {
    }

    public void cargarnum1() {
        System.out.println("Jugador 1: ingresá el número del 1 al 10, sin que el jugador 2 lo vea: ");
        num1 = entrada.nextDouble();
    }
    
    public void cargarnum2() {
        System.out.println("Jugador 2: ingresá el número del 1 al 10, sin que el jugador 1 lo vea: ");
        num1 = entrada.nextDouble();
    }

    public void Adivina2() {
        cargarnum1();
        int cont = 0; 
        System.out.println("Jugador 2: ingresá un número del 1 al 10 para adivinar, tenes 3 intentos: ");
        while (cont != 3) {
        num2=entrada.nextDouble();   
            if (num2 == num1) {
                System.out.println("¡Adivinaste!");
                victoriasj2++;
                break;
            } else {
                cont++;
                System.out.println("Fallaste, tenes " + (3 - cont) + " intentos");
                if (num2 > num1) {
                    System.out.println("El número a adivinar es más bajo");
                } else {
                    System.out.println("El número a adivinar es más alto");
                }
            }
        }
        if(cont==3){
            System.out.println("Perdiste");
        }
    }
    
        public void Adivina1() {
        cargarnum2();
        int cont = 0; 
        System.out.println("Jugador 1: ingresá un número del 1 al 10 para adivinar, tenes 3 intentos: ");
        while (cont != 3) {
        num2=entrada.nextDouble();   
            if (num2 == num1) {
                System.out.println("¡Adivinaste!");
                victoriasj1++;
                break;
            } else {
                cont++;
                System.out.println("Fallaste, tenes " + (3 - cont) + " intentos");
                if (num2 > num1) {
                    System.out.println("El número a adivinar es más bajo");
                } else {
                    System.out.println("El número a adivinar es más alto");
                }
            }
        }
        if(cont==3){
            System.out.println("Perdiste");
        }
    }
    
    public void iniciar_juego(){
        for (int i = 0; i < 5; i++) {
           Adivina2(); 
           System.out.println("Ahora es el turno del jugador 1");
           Adivina1();
        }
    }
}