import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidadPersonas = 10;
        Persona[] personas = new Persona[cantidadPersonas];

        Scanner scanner = new Scanner(System.in);     //Resource leak: "welcom" 

        for (int i = 0; i < cantidadPersonas; i++) {
        System.out.println("Ingrese el nombre de la persona "+(i));
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad de las personas"+(i));
        int edad = scanner.nextInt();
        scanner.nextLine();
        personas[i] = new Persona(nombre, edad);   
        }

        System.out.println("personas sin ordenar");
        for (int i = 0; i < cantidadPersonas; i++) {
         System.out.println(personas[i].getEdad()+"|");   
        }

        String nombre = scanner.nextLine();
        int edad = scanner.nextInt();
        personas[1] = new Persona(nombre, edad);


    }
}
