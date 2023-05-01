/*
-Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, 
-y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
-Crear un método para cargar un libro pidiendo los datos al usuario y luego
-informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package guia07_ejercicio01_libros;

import java.util.Scanner;


public class Libro {
    String ISBN ; 
    String Titulo; 
    String Autor;
    int  nroPaginas;
    
    public Libro(String ISBN, String Titulo, String Autor, int nroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.nroPaginas = nroPaginas;
    }
   
    public Libro(){};
    
    public void cargarLibro(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ISBN");
        this.ISBN = sc.next();
        System.out.println("Ingrese Titulo");
        this.Titulo = sc.next();
        System.out.println("Ingrese Autor");
        this.Autor = sc.next();
        System.out.println("Ingrese num. paginas");
        this.nroPaginas = sc.nextInt();
        
    }
    
    public void informar(){
        
        System.out.println("ISBN: "+ this.ISBN);
        System.out.println("Titulo: "+ this.Titulo);
        System.out.println("ISBN: "+ this.Autor);
        System.out.println("Nro paginas: "+ this.nroPaginas);
        
    }
    
}
