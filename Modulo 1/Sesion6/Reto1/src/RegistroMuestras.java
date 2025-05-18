/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 6
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RegistroMuestras {
    public static void main (String[] args){

        ArrayList<String> muestras = new ArrayList<>();

        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        System.out.println(" >>>>> Muestras recibidas <<<<<");
        System.out.println("Las muestras son (en orden de recepción): ");
        for(int i=0; i<muestras.size(); i++){
            System.out.println((i+1) + ". " + muestras.get(i));
        }

        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("\n ---- Especies únicas ----");
        for(String especie : especiesUnicas){
            System.out.println("-> " + especie);
        }

        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        muestrasInvestigador.put("ME011", "Dra. Lucero");
        muestrasInvestigador.put("ME022", "Dra. Karla");
        muestrasInvestigador.put("ME033", "Dr. Horacio");

        System.out.println("\n Doctores encargados de las muestras: ");
        for(Map.Entry<String, String> entry : muestrasInvestigador.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String idBuscar = "ME011";
        System.out.println("\n---- Resultado de busqueda ----");
        System.out.println("La muestra es: " + idBuscar + " y su doctor responsable es: " +muestrasInvestigador.get(idBuscar));

    }
}
