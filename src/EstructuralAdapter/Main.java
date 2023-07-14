package EstructuralAdapter;

public class Main {
    public static void main(String[] args) {
        ProcesadorPago procesador = new ProcesadorPago();
        Pago adaptador = new AdaptadorPago(procesador);

        adaptador.pagar(50); // El cliente utiliza la interfaz objetivo sin conocer la implementación subyacente
    }
}
