import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Ponemos que la lista de libros sea igual al metodo de anhadirlibros para que los libros se añadan a esa lista
        List<Libro> libros=AñadirLibros.anhadirLibros();
        //Después llamamos al escritor de libros y guardarmos los libros en el archivo
        EscritorLibros.guardarLibros(libros);
        //Y ya por ultimo nos muestra la informacion
        LectorLibros.leerLibros();
        }
    }
