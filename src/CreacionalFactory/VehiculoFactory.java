package CreacionalFactory;

public abstract class VehiculoFactory {
    abstract Vehiculo crearVehiculo();

    void conducirVehiculo() {
        Vehiculo vehiculo = crearVehiculo();
        vehiculo.conducir();
    }
}