package CreacionalFactory;

public class Main {
    public static void main(String[] args) {
        SelectorFabrica selector = new SelectorFabrica();
        VehiculoFactory factory = selector.seleccionarFabrica(1);
        if (factory != null) {
            factory.conducirVehiculo();
        } else {
            System.out.println("Opción inválida.");
        }
    }
}