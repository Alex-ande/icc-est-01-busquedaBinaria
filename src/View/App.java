package View;

import Controller.SearchMethods;
import Controller.SortingMethods;
import Controllers.*;;
import Views.View;

public class App {
    public static void main(String[] args) {
        View Vista = new View ();


        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();



        controller Controller = new controller(Vista, sortingMethods, searchMethods);

    }
}
