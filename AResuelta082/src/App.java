import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        HoraExacta r = new HoraExacta(11, 15, 23); // hora de descanso
        System.out.println(r);
        for (int i = 0; i <= 61; i++) {
            r.inc();
        }
        System.out.println(r);
        System.out.println("Escriba los segundos:");
        int segundos = new Scanner(System.in).nextInt();
        if (r.setSegundos(segundos)) {
            System.out.println(r);
        } else {
            System.out.println("No es posible cambios los segundos");
        }
    }
}
