package EstructuralAdapter;

class AdaptadorPago implements Pago {
    private ProcesadorPago procesador;

    AdaptadorPago(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void pagar(int cantidad) {
        float cantidadFloat = cantidad;
        procesador.procesarPago(cantidadFloat);
    }
}
