import java.util.Arrays;

public abstract class Instrumento{
    protected Nota[] melodia; // almacena las notas a interpretar

    public Instrumento() {
        melodia = new Nota[0]; // creamos la tabla de notas vacia
    }

    // algoritmo para insercion no ordenada
    void add(Nota nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1); // aumentamos el tamaño de la tabla
        melodia[melodia.length - 1] = nota; // metemos la nota en la ultima posicion
    }

    abstract void interpretar(); // para las subclases de la clase Instrumento
}
