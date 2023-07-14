package CreacionalFactory;

public class CamionetaFactory extends VehiculoFactory {
    Vehiculo crearVehiculo() {
        return new Camioneta();
    }
}
