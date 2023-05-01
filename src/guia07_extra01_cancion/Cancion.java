/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
package guia07_extra01_cancion;

import java.util.Scanner;

public class Cancion {

    private static Scanner entrada = new Scanner(System.in);
    public String titulo;
    public String autor;

    //Constructor vacío iniciado con cadenas vacías ' "" '. 
    Cancion() {
        titulo = "";
        autor = "";            
    }

    //contructor con parametros.
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void cargar() {
        System.out.println("Ingrese el título de la canción: ");
        this.titulo = entrada.next();
        System.out.println("Ingrese el autor de la canción: ");
        this.autor = entrada.next();
    }

    public void mostrar() {
        System.out.println("El nombre de la canción es: " + this.titulo);
        System.out.println("El autor de la canción es: " + this.autor);
    }

}
