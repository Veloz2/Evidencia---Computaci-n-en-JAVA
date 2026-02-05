import java.util.Scanner;

public class Menu {
    
    private Scanner sc = new Scanner(System.in);
    private Sistema sistema;
    
    public Menu(Sistema sistema){
        this.sistema = sistema;
    }

    public void mostrar(){
        int opcion;
        do{
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("1. Alta doctor");
            System.out.println("2. Alta paciente");
            System.out.println("3. Crear cita");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());  

            switch(opcion){
                case 1 -> sistema.altaDoctor();
                case 2 -> sistema.altaPaciente();
                case 3 -> sistema.crearCita();
                case 4 -> sistema.mostrarDatos();
                case 5 -> System.out.println("Saliendo");
                default -> System.out.println("Opcion invalida\n");

            }
        } while (opcion != 5);
    }
}
