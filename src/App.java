public class App {
    public static void main(String[] args) throws Exception {
        // Los libros se crean Fuera de la biblioteca -> agregacion\\
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
        Libro libro2= new Libro("El amor en los tiempos del colera","Gabriel Garcia Marquez");
        Libro libro3 = new Libro ("El principito", "Antoine de Saint-Exupery");
        
    // Se crea la biblioteca y se agregan los libros al catalogo\\
        Biblioteca biblioteca = new Biblioteca("Biblioteca Luis Angel Arango");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println();
        biblioteca.mostrarCatalogo();

        biblioteca.buscarPorAutor("Gabriel Garcia Marquez");
        System.out.println();
        biblioteca.buscarPorAutor("Jorge luis Borges");
    }
}
