/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package guia07_extra04_cuenta;

public class Extra04_Cuenta {

    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        c.cargarSaldo();
        c.retirar_dinero();
    }

}
