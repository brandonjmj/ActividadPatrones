package CreacionalFactory;

public class MotoFactory extends VehiculoFactory {
    Vehiculo crearVehiculo() {
        return new Moto();
    }
}

