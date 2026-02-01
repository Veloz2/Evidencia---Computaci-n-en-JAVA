import java.util.Scanner;

//Este codigo se encarga de crear las citas, dar de alta doctores y pacientes
//ademas mostrar los datos que se encuentran en los archivos de texto

public class Sistema {
    private Scanner sc = new Scanner(System.in);

    public void altaDoctor(){
        System.out.print("ID Doctor: " );
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nombre del Doctor: ");
        String nombre = sc.nextLine();

        Archivo.writeLines("doctores.txt", id + "," + nombre);
        System.out.println("Doctor guardado.\n");
    }
        public void altaPaciente(){
        System.out.print("ID Paciente: " );
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nombre del Paciente: ");
        String nombre = sc.nextLine();

        Archivo.writeLines("pacientes.txt", id + "," + nombre);
        System.out.println("Paciente guardado.\n");
    }
    private boolean existe(String archivo, int id){
        for(String linea : Archivo.readLines(archivo)){
            if (linea.trim().isEmpty()) continue;
            String[] datos = linea.split(",");
            if(Integer.parseInt(datos[0]) == id) return true;
        }
        return false;
    }

    public void crearCita(){
        System.out.print("ID Cita: ");
        String idCita = sc.nextLine();
        System.out.print("Fecha y hora: ");
        String fecha = sc.nextLine();
        System.out.print("Motivo: ");
        String motivo = sc.nextLine();
        System.out.print("ID Paciente: ");
        int idPaciente = Integer.parseInt(sc.nextLine());
        System.out.print("ID Doctor: ");
        int idDoctor = Integer.parseInt(sc.nextLine());

        if(existe("pacientes.txt", idPaciente) && existe("doctores.txt", idDoctor)){
            Archivo.writeLines("citas.txt", idCita + "," + fecha + "," + motivo + "," + idPaciente + "," + idDoctor);
            System.out.println("Cita guardada en el sistema\n");
        } else{
            System.out.println("Paciente o doctor no existen. \n");
        }
    }
    public void mostrarDatos(){
        System.out.println("\n");
        System.out.println(" ----- DOCTORES -----");
        for (String linea : Archivo.readLines("doctores.txt")){
            String[] d = linea.split(",");
            System.out.println("ID: "+ d[0] + " | Nombre: "+ d[1]);
            System.out.println("--------------------------");

        }

        System.out.println(" ----- PACIENTES -----");
        for (String linea : Archivo.readLines("pacientes.txt")){
            String[] p = linea.split(",");
            System.out.println("ID: "+ p[0] + " | Nombre: "+ p[1]);
            System.out.println("--------------------------");

        }
        System.out.println(" ----- CITAS -----");
        for(String linea : Archivo.readLines("citas.txt")){
            String[] c = linea.split(",");
            System.out.println("Cita ID: "+ c[0]);
            System.out.println("Fecha: "+ c[1]);
            System.out.println("Motivo: "+ c[2]);
            System.out.println("Paciente ID: "+ c[3]);
            System.out.println("Doctor ID: "+ c[4]);
            System.out.println("--------------------------");

        }
        System.out.println();
    }
}
