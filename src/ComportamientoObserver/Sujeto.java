package ComportamientoObserver;

import java.util.ArrayList;
import java.util.List;

class Sujeto {
    private List<Observador> observadores = new ArrayList<>();
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        notificarObservadores();
    }

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
}