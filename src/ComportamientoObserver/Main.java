package ComportamientoObserver;

public class Main {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();
        Observador observador1 = new ObservadorConcreto(sujeto);
        Observador observador2 = new ObservadorConcreto(sujeto);

        sujeto.agregarObservador(observador1);
        sujeto.agregarObservador(observador2);

        sujeto.setEstado(5);
    }
}