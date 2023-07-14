package CreacionalFactory;

public class SelectorFabrica {
    VehiculoFactory seleccionarFabrica(int opcion) {
        VehiculoFactory factory = null;

        switch (opcion) {
            case 1:
                factory = new MotoFactory();
                break;
            case 2:
                factory = new AutomovilFactory();
                break;
            case 3:
                factory = new CamionetaFactory();
                break;
        }

        return factory;
    }
}

