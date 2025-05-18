/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 7
*/

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {
    public static void main(String[] args){

        Path rutaCarpeta = Paths.get("src/config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        String parametros = "---- Texto escrito desde código en Java ---\n"
                          + "• Tiempo de ciclo: 55.8 s\n"
                          + "• Velocidad de línea: 1.2 m/s\n"
                          + "• Número de estaciones: 8\n";

        try{

            if(!Files.exists(rutaCarpeta)){
                Files.createDirectory(rutaCarpeta);
                System.out.println("<<<<< Carpeta 'config' creada con éxito >>>>>>");
            }

            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("---- Escritura en archivo exitosa! ☺ -----");

            if(Files.exists(rutaArchivo)){
                System.out.println("~~~~~~ Archivo creado de forma exitosa ~~~~~");
                System.out.println("○ Archivo creado en: " + rutaArchivo.toAbsolutePath());

                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("***** Mostrando contenido del archivo *****");
                System.out.println(contenidoLeido);
            }else{
                System.out.println("<<<<<< Archivo no creado >>>>>>");
            }
        }catch (IOException e){
            System.out.println("---- Error trabajando con el archivo ----");
            System.out.println(e.getMessage());
        }
    }
}
