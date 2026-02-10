import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class LectorLibros {
    public static void leerLibros() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("libros.ser"))) {
            {
                List<Libro> librosRecuperados = (List<Libro>) ois.readObject();

                //Recorremos la lista para que nos muestre los datos de cada objeto de la lista
                System.out.println("Lista de libros:");
                for (Libro libro : librosRecuperados) {
                    System.out.println(libro.getTitulo());
                    System.out.println(libro.getAutor());
                    System.out.println(libro.getAño());
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException("Error al leer la lista de libros", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("No se pudo leer la clase de libros", e);
        }
    }
}
