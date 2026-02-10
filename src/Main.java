import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String archivo = "archivo.bat";

        ArrayList<Libro>listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("El lazarillo de Tormes","Anonimo", "1554"));
        listaLibros.add(new Libro("Don Quijote", "Miguel de Cervantes", "1605"));
        listaLibros.add(new Libro("EL Capitan Alatriste", "Arturo Perez Reverte", "1996"));

        Escritor escritor =new Escritor();
        Lector lector = new Lector();

        try{
            escritor.guardarLibros(listaLibros, archivo);
            System.out.println("Lista de Libros guardadas");

            ArrayList<Libro>librosLeidos = lector.cargarLibros(archivo);

            System.out.println("Lista de Libros leidos en el archivo: ");
            for (Libro libro : librosLeidos) {
                System.out.println(libro);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}