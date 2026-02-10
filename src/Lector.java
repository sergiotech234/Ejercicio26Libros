import java.io.*;
import java.util.ArrayList;

public class Lector {
    public ArrayList<Libro> cargarLibros(String archivo) throws Exception{
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Libro>) ois.readObject();
        }
    }
}
