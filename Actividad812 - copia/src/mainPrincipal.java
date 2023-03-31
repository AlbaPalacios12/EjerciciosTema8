
public class mainPrincipal {
    public static void main(String[] args) throws Exception {
        CajaCarton cc= new CajaCarton(10, 9, 13, Unidad.cm);
        System.out.println("Las medidas concretas de la caja se corresponden con: " + cc);
        System.out.println("El volumen al 80% del volumen real es: " + cc.getVolumen() + " medido en cm");      
    }
}