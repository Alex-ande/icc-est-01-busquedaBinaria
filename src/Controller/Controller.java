package Controller;
import Models.Persona;
import Views.View;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    private Persona[] personas;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.searchMethods = searchMethods;
        this.sortingMethods = sortingMethods;

        System.out.println("Controller created");
    }

    public void start() {
        int option = 0;
        do {
            option = view.showMenu();  // Corrección: el método showMenu() pertenece a view
            switch (option) {
                case 1:
                    inputPersona();  // Corrección: el nombre del método debe ser inputPersona
                    break;
                case 100:  // Corrección: cambiar el punto y coma (;) por dos puntos (:)
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 0);
    }

    public void inputPersona() {
        int numeroPersona = view.inputInt("Ingrese el número de personas");
        personas = new Persona[numeroPersona];  // Corrección: la variable debe llamarse personas, no Personas
        for (int i = 0; i < numeroPersona; i++) {
            personas[i] = view.inputPersona();  // Corrección: inputPersona en vez de imputPersona
        }
    }
}


