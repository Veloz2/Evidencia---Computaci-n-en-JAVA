import java.util.Scanner;
//Se encarga de validar que user y contraseña sean correctas, funciona como un filtro de seguridad
public class Login {
    private Scanner sc = new Scanner(System.in);

    public boolean newLogin(){
        while(true){
            System.out.print("Ingrese usuario: ");
            String user = sc.nextLine();
            System.out.print("Ingrese contraseña: ");
            String pass = sc.nextLine();

            for(String linea : Archivo.readLines("db/admin.txt")){
                String[] datos = linea.split(",");
                if(datos[0].equals(user) && datos[1].equals(pass)){
                    System.out.println("Bienvenido al Sistema\n");
                    return true;
                }
                System.out.println("Usuario o contraseña incorrectas\n");
            }

        }

    }
}
