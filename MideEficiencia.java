/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_de_lidia;

/**
 *
 * @author Lalito
 */import java.util.Random;

public class MideEficiencia { static int size=20;
   public static void main(String[] args) {
        int[] vector =new int[size];
        vector =llenaVector(vector);
        imprimeVector(vector);
        OrdenaBurbuja(vector);
        OrdenaBurbujaSeñal(vector);

    }

    public static int[] llenaVector(int[] vector){
        System.out.println("Llenando vector........");
        for (int i = 0; i < vector.length; i++) {
            vector[i]=new Random().nextInt(100);
        }
        return vector;
    }

    public static void imprimeVector(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(String.valueOf(vector[i]+""));
        }
    }

    public static void OrdenaBurbuja(int[]vector){
        int AUX;
        long iniciaTiempo = System.nanoTime();

        for (int I = 1; I <= size; I++)
            for(int J=size-1;J>=I;J--)
                if (vector[J-1]>vector[J]){
                    AUX=vector[J-1];
                    vector[J-1]=vector[J];
                    vector[J]=AUX;
                }
        long finTiempo=System.nanoTime();
        double diferencia =(double)(finTiempo-iniciaTiempo)*1.0e-9;
        System.out.println("\nEL ARREGLO ORDENADO CON BURBUJA ES ");
        for (int I = 0; I < size-1; I++)
            System.out.print(vector[I]+"");
        System.out.println("\n Ordenamiento por burbuja dura: "+diferencia);
    }

    public static void OrdenaBurbujaSeñal (int[]vector){
        int intercambios=0,comparaciones=0;
        int aux =0, i=0;
        boolean band=false;

        long iniciaTiempo= System.nanoTime();
        while (i<vector.length-1 && band==false){
            band=true;
            for (int j = 0; j < vector.length-i-1;j++) {
                comparaciones++;
                if (vector[j]>vector[j+1]) {
                    intercambios ++;
                    aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                    band=false;
                }
            }
            i=i+1;
        }
        long finTiempo=System.nanoTime();
        double diferencia = (double)(finTiempo-iniciaTiempo)*1.0e-9;
        System.out.println("EL ORDENADO CON BURBUJA CON SEÑAL ES ");
        for (int I = 0; I <= size-1; I++)
            System.out.print(vector[I]+"");
        System.out.println("\n Ordenamiento por Burbuja con Señal dura: "+diferencia+" segundos");
    }
}
