public class CajaCarton extends Caja2 {
 
    protected int ancho, alto, fondo; // atributos necesarios
    protected Unidad unidad= Unidad.cm;
    public CajaCarton (int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }
    @Override
    public double getVolumen() {
        double Volumen = fondo * ancho * alto; // volumen de la caja en metros cubitos
        Volumen= Volumen*0.8;
        return Volumen;

    }
    public String toString() {
        // cadena con la representacion de la caja
        String result;
        result = ancho + " ancho, " + alto + " alto, " + fondo + " fondo y unidad: " + unidad;
        return result;
    }
}
