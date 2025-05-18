/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 7
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args){

        Path rutaLog = Paths.get("src/errores.log");
        Path rutaError = Paths.get("src/registro_fallos.txt");

        int totalLineas = 0, conteoErrores = 0, conteoWarnings = 0;

        try(BufferedReader lector = Files.newBufferedReader(rutaLog)){

            String linea;

            while((linea = lector.readLine()) != null){
                totalLineas++;
                if(linea.contains("ERROR")){
                    conteoErrores++;
                }
                if(linea.contains("WARNING")){
                    conteoWarnings++;
                }
            }

            System.out.println("~~~~~ Analisis terminado ~~~~~");
            System.out.println("• Total de lineas leídas: " + totalLineas);
            System.out.println("• Total de errores: " + conteoErrores);
            System.out.println("• Totald e advertencias: " + conteoWarnings);

            double porErrores = (totalLineas > 0) ? ((double) conteoErrores / totalLineas) * 100 : 0;
            double porWarnings = (totalLineas > 0) ? ((double) conteoWarnings / totalLineas) * 100 : 0;

            System.out.println("♦ Porcentaje de errores: %.2f%%\n" + porErrores);
            System.out.println("♦ Porcentaje de warnings: %.2f%%\n" + porWarnings);
        } catch (IOException e){
            System.out.println("~~~~ Error procesando el archivo de logs ~~~~~\n" + e.getMessage());

            try(BufferedWriter writer = Files.newBufferedWriter(rutaError)){
                writer.write("**** Se produjo un error leyendo 'errores.log' ****\n " + e.getMessage());
            }catch (IOException ex){
                System.out.println("***** No se pudo escribir en el archivo de registro de fallos *****");
            }

        }
    }
}
