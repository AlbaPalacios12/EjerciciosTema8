import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);
        Caja2 c= new Caja2(12, 4, 6, Unidad.cm);
        System.out.println(c);
        System.out.println( c.getVolumen());
        System.out.println("Escribe una modificacion para etiqueta");
        String etiq= sc.next();
        System.out.println("La etiqueta ahora es:");
        c.setEtiqueta(etiq);
    }
}
