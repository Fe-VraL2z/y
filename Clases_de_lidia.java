/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases_de_lidia;


/**
 *
 * @author Lalito
 */
import java.util.Scanner;

public class Clases_de_lidia {
    static int size = 40;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los nombres de las personas: ");
        String[] vector = new String[size];

        // Se solicita al usuario que llene el arreglo.
        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextLine();
        }

        // Se imprime el arreglo original.
        imprimeVector(vector);

        // Se llama al método de ordenamiento por burbuja.
        OrdenaBurbuja(vector);

        // Se llama al método de ordenamiento por burbuja con señal.
        OrdenaBurbujaSeñal(vector);
    }

    public static void imprimeVector(String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void OrdenaBurbuja(String[] vector) {
        String aux;
        long iniciaTiempo = System.nanoTime();

        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j].compareTo(vector[j + 1]) > 0) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        long finTiempo=System.nanoTime();
        double diferencia = (double)(finTiempo-iniciaTiempo)*1.0e-9;
        System.out.println("\nEl arreglo ordenado con burbuja dura: "+diferencia);
    }

    public static void OrdenaBurbujaSeñal(String[] vector) {
        int intercambios = 0, comparaciones = 0;
        String aux;
        int i = 0;
        boolean band = true;

        long iniciaTiempo = System.nanoTime();
        while (i < vector.length - 1 && band) {
            band = false;
            for (int j = 0; j < vector.length - i - 1; j++) {
                comparaciones++;
                if (vector[j].compareTo(vector[j + 1]) > 0) {
                    intercambios++;
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                    band = true;
                }
            }
            i++;
        }
        long finTiempo = System.nanoTime();
        double diferencia = (double)(finTiempo - iniciaTiempo) * 1.0e-9;
        System.out.println("El arreglo ordenado con burbuja con señal dura: " + diferencia);
    }
}
