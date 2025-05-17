/*
 Nohemy Aguilar Valaldares
 Reto 01, sesión 1
 Clase paciente / uso de scanner
*/


import java.util.Scanner;

public class Paciente {

    String nombre;
    int edad;
    String exp;

    // inicializar scanner

    Scanner sc = new Scanner(System.in);

    // comenzar a leer las variables

    public void introducirDatos(){

        System.out.println("------- Datos del paciente -------");

        System.out.println("Ingresa el nombre del paciente: ");
        nombre = sc.nextLine();

        System.out.println("Ingresa la edad del paciente " + nombre + " ");
        edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresa el expediente del paciente "+ nombre + ": ");
        exp = sc.nextLine();

        sc.close();

    }

    //metodo

    public void mostrarInformacion(){

        System.out.println("------- Información del paciente -------");
        System.out.println("Nombre del paciente: " + nombre);
        System.out.println(nombre + " tiene la edad de " + edad + " años");
        System.out.println("El expediente de " + nombre + " es " + exp);
    }


}
