import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class EscritorLibros {

    public static void guardarLibros(List<Libro> libros) {
        //Guardamos la lista en un archivo binario
        try (ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream("Libros.ser"))) {
            oos.writeObject(libros);
            System.out.println("Objeto libro serializado y guardado en libro.ser");
        } catch (IOException e) {
            System.out.println("Error al guardar el objeto: " + e.getMessage());
        }
    }
}