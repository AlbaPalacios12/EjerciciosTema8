
public class Caja2 {
    // escribimos sus atributos
    private int ancho, alto, fondo;
    private Unidad unidad;
    private String etiqueta;

    // creamos el constructor por defecto
    public Caja2() {
    }

    // constructor con los parametros
    public Caja2(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    // volumen de la caja en metros cubitos
    double getVolumen() { // se presupone que los datos estan en metros
        double Volumen = fondo * ancho * alto; // volumen de la caja en metros cubitos
        return Volumen;
    }

    public void setEtiqueta(String etiqueta) {
    this.etiqueta = etiqueta;
    String etiquetacopia=etiqueta.substring(0, 31);
        System.out.println(etiquetacopia);
        // al String le damos un tamaño maximo de 30

    }

    public String toString() {
        // cadena con la representacion de la caja
        String result;
        result = ancho + "-" + alto + "-" + fondo + ", unidad: " + unidad;
        return result;
    }
}
