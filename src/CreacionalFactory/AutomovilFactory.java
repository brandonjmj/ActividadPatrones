package CreacionalFactory;

public class AutomovilFactory extends VehiculoFactory {
    Vehiculo crearVehiculo() {
        return new Automovil();
    }
}