package ComportamientoObserver;

class ObservadorConcreto implements Observador {
    private Sujeto sujeto;

    public ObservadorConcreto(Sujeto sujeto) {
        this.sujeto = sujeto;
    }

    public void actualizar() {
        int estado = sujeto.getEstado();
        System.out.println("El estado del sujeto ha cambiado a: " + estado);
    }
}