import java.io.*;
import java.util.*;

//Este codigo se encarga de agregar y leer los datos disponibles en los archivos de textos
public class Archivo{
    //Esta funcion escribe en los archivos de txt
    public static void writeLines(String archivo, String linea){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))){
            bw.write(linea);
            bw.newLine();
        } catch (IOException e){
            System.err.println("Error al escribir en "+ archivo);
        }
    }
    //Esta funcion lee los datos de los archivos de texto
    public static List<String> readLines(String archivo){
        List<String> lineas = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = br.readLine()) != null){
                lineas.add(linea);
            }
        } catch (IOException e){
            System.out.println("Error leyendo " + archivo);
        }
        return lineas;
    }
    
}
