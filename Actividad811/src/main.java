public class main {
    public static void main(String[] args) {
        Nota cancion []= {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.LA};
        Piano piano = new Piano();
        for (Nota nota :cancion) { // añadimos las notas al piano
            piano.add(nota);
        }
        piano.interpretar();
    }
}

