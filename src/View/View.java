package View;

import Models.Persona;
import java.util.Scanner;  // Corrección: importación correcta de Scanner

public class View {
    private Scanner scanner;

    public View() {  // Eliminar constructor duplicado
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("Menu");
        System.out.println("1. Ingresar personas");
        System.out.println("100. Salir");
        System.out.println("Ingrese una opción:");
        return scanner.nextInt();
    }

    public int inputInt(String message) {
        System.out.println(message);  // Corrección: mensaje debe estar sin comillas
        return scanner.nextInt();
    }

    public Persona inputPersona() {
        String name = inputName();
        int age = inputAge();
        return new Persona(name, age);
    }

    public String inputName() {
        System.out.println("Ingrese el nombre:");
        return scanner.next();  // Corrección: se usa next() para leer un String, no nextInt()
    }

    public int inputAge() {
        return inputInt("Ingrese la edad:");
    }
}

