/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/C**lasses/Class.java to edit this template
 */
package clases_de_lidia;
  import java.util.Random;

/**
 *
 * @author Lalito
 */
public class ComplejidadDelTiempo {
    
  



  
    public static void main(String[] args) {
        long iniciaTiempo =System.nanoTime();
        for (int i=0; i< 100000; i++)
            for (int j=0; j<1000; j++)
                new Random().nextDouble();
        long finTiempo = System.nanoTime();
        double diferencia = (double)(finTiempo -iniciaTiempo)* 1.0e-9;
        System.out.println("El programa dura" + diferencia+"segundos");
        // TODO code application logic here
}

    
}
