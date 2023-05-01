/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
package guia07_extra01_cancion;

import guia07_extra01_cancion.Cancion;

public class Extra01_Cancion {

    public static void main(String[] args) {
        Cancion song = new Cancion();
        song.cargar();
        song.mostrar();
    }

}
