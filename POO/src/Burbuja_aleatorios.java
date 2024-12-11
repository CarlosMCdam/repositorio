/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenacion;
import java.util.Calendar;
import java.util.Vector;
/**
 *
 * @author Gema
 */
public class Burbuja_aleatorios {
public static int TAM=100;
    public static void main(String[] args) {
        // TODO code application logic here
      int a[]=new int[1000];
      int i, pasada, aux,indice,intercambio=1;
      Calendar calendario = Calendar.getInstance();
      //Calendar calendario = new GregorianCalendar();
      System.out.println(calendario.get(Calendar.HOUR_OF_DAY)+ ":" + calendario.get(Calendar.MINUTE) + ":" + calendario.get(Calendar.SECOND));
      System.out.printf( "Datos en el orden inicial:\n\n" );
      for(i=0; i<100;i++){
            a[i]=(int)(Math.random()*100);
       }


      for (i=0;i<=TAM-1;i++ )
	 System.out.printf("%4d",a[i]);
       System.out.printf("\n");
      for (pasada=1;(pasada<=TAM-1)&&(intercambio==1); pasada++ ){  /* pasadas */
         intercambio=0;
         for (i=0;i<=TAM-2;i++ ){
            if (a[i]>a[i+1]){ //comparación
               aux = a[i];    //intercambio
               a[i] = a[i+1];
               a[i+1] = aux;
               intercambio=1;
               System.out.printf("Array en la pasada %d tras intercambio %d:",pasada,i+1);
               for (indice=0;indice<=TAM-1;indice++ )
                    System.out.printf("%4d", a[indice]);
                System.out.printf("\n");
            }
         }
         System.out.printf("Array ordenado tras la pasada %d:",pasada);
         for (indice=0;indice<=TAM-1;indice++ )
             System.out.printf("%4d", a[indice]);
         System.out.printf("\n");
      }
      System.out.printf( "\n\nDatos ordenados en sentido ascendente\n\n" );
      for (i=0;i<=TAM-1;i++ )
         System.out.printf("%4d", a[i]);
      System.out.printf("\n");
      System.out.println(calendario.get(Calendar.HOUR_OF_DAY)+ ":" + calendario.get(Calendar.MINUTE) + ":" + calendario.get(Calendar.SECOND));
}
}
