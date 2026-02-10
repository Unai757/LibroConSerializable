import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AñadirLibros {

    public static List<Libro> anhadirLibros() {
        Scanner sc = new Scanner(System.in);
        //Creamos el arraylist para añadir los libros que creemos
        List<Libro> libros = new ArrayList<>();
        System.out.println("Cuantos libros quieres añadir");
        int numero = sc.nextInt();
        sc.nextLine();
        //Recorremos el bucle para añadir los libros que queramos
        for (int i = 1; i <= numero; i++) {
            System.out.println("Dime el titulo del libro");
            String nombre = sc.nextLine();
            System.out.println("Dime el autor del libro");
            String autor = sc.nextLine();
            System.out.println("Dime el año de publicación del libro");
            int anho = sc.nextInt();
            sc.nextLine();
            //Después de pedir todos los datos creamos el objeto y lo añadimos a la arraylist
            Libro libro = new Libro(nombre, autor, anho);
            libros.add(libro);
        }

        return libros;
    }
}
