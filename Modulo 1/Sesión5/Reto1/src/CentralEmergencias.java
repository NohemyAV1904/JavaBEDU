/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 5
*/

public class CentralEmergencias {
    public static void main(String[] args){

        Ambulancia ambulancia = new Ambulancia("Ambulancia E-98", "Alex");
        Patrulla patrulla = new Patrulla("Patrulla T-694", "Luna");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad de Bomberos UB74", "Diana");

        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();
    }
}
