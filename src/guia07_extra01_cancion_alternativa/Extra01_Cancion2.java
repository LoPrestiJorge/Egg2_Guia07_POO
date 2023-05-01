
package guia07_extra01_cancion_alternativa;

import java.util.Scanner;

public class Extra01_Cancion2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        Cancion c1 = new Cancion();
                
        System.out.println("Ingrese el titulo");
        c1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        c1.setAutor(leer.next());   
        
        System.out.println("El titulo de la cancion es " + c1.getTitulo());
        System.out.println("El autor de la cancion es: " + c1.getAutor()); 
        
    }

}
    
    

