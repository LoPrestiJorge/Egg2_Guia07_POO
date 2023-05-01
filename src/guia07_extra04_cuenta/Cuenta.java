/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package guia07_extra04_cuenta;

import java.util.Scanner;

public class Cuenta {

    private static Scanner entrada = new Scanner(System.in);
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    Cuenta() {
    }

    public void cargarSaldo() {
        System.out.println("Ingrese el nombre del titular: ");
        titular = entrada.nextLine();
        System.out.println("Ingrese el saldo: ");
        saldo = entrada.nextDouble();
    }

    public void retirar_dinero() {
        while (saldo > 0) {
            
        System.out.println("Ingrese el monto a retirar: ");
        double transaccion = entrada.nextDouble();
        
        if(transaccion <= saldo){    
                saldo -= transaccion;  
                System.out.println("La transacción de: " + transaccion + " ha sido realizada con exito.");
                System.out.println("Su monto restante es: " + saldo);
                System.out.println("¿Quiere seguir operando? (S/N)");
                String opcion = entrada.next(); //usa solo next() cuando es solo un caracter. 

                if (opcion.equalsIgnoreCase("n")) {
                    System.out.println("Gracias por usar el servicio.");
                    break;
                }
    
            } else {
                System.out.println("No le alcanza para esta transacción, su saldo es: "+saldo);
            }
        }
        System.out.println("Ya no tiene saldo disponible.");
    }
}
