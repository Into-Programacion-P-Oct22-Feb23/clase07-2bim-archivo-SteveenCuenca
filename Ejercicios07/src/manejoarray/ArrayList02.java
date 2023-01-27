/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList02 {

    public static void main(String[] args) {
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);
    }

    public static ArrayList<String> obtenerDatos() {
        ArrayList<String> arreglo2 = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese el nombre del pais");
            String pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Si desea salir del ciclo oprima (s)");
            String opcion = entrada.nextLine();
            if (opcion.equals("s")) {
                bandera = false;
            }
        }
        return arreglo2;
    }

    public static String obtenerCadenaFinal(ArrayList<String> arreglo2) {
        String cadenaFinal = "";
        for (int i = 0; i < arreglo2.size(); i++) {
            cadenaFinal = String.format("%s%s\n", cadenaFinal, arreglo2);
        }
        return cadenaFinal;
    }

    /*ArrayList<String> arreglo2 = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese el nombre del pais");
            String pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Si desea salir del ciclo oprima (s)");
            String opcion = entrada.nextLine();
            if (opcion.equals("s")) {
                bandera = false;
            }
            for (int i = 0; i < arreglo2.size(); i++) {
                System.out.printf("Los paises son: \n%s\n", arreglo2.get(i));
            }
        }*/
 /*
        ArrayList <String> arreglo2 = new ArrayList<>();
        
        ArrayList <Boolean> arreglo4 = new ArrayList<>();
     */
}
