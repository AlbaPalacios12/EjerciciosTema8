
public class HoraExacta extends Hora {
    protected int segundos;

    public HoraExacta(int horas, int minutos, int segundos) {
        super(horas, minutos); // aprovechamos el constructor de la clase Hora (superclase)
        // this.segundos = segundos; permite asignar cualquier valor a la variable
        // segundos
        if (!setSegundos(segundos)) { // mejor usar el metodo para asignar valores
            System.out.println("Segundos incorrectos");
        }
    }

    // añadimos un metodo para asignar segundos
    public boolean setSegundos(int segundos) {
        boolean correcto = false;
        if (0 <= segundos && segundos < 60) { // rango valido
            this.segundos = segundos;
            correcto = true;
        }
        return correcto;
    }

    @Override // sustituimos el metodo para incrementar segundos en vez de minutos
    public void inc() {
        segundos++;
        if (segundos < 59) {
            segundos = 0;
            super.inc();
        }
    }

    @Override // sustituimos el toString () para mostrar los segundos
    public String toString() {
        String result = super.toString(); // usamos el de la superclase
        result += ":" + segundos;
        return result;
    }
}
