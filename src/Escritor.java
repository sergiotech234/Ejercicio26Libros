import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Escritor {

    public void guardarLibros(ArrayList<Libro> libros, String archivo) throws IOException {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(libros);
        }

    }
}
