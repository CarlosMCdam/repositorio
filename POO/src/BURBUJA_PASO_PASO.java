/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
//import java.util.GregorianCalendar;
/**
 *
 * @author gema
 */
public class BURBUJA_PASO_PASO {
  public static final int TAM=9;
    public static void main(String[] args) {
        // TODO code application logic here
      int a[]= { 10,5,4,6,3,4,7,11,13};
      int i, pasada, aux,indice;
      boolean intercambio=true;
      Calendar calendario = Calendar.getInstance();
      //Calendar calendario = new GregorianCalendar();
      System.out.println(calendario.get(Calendar.HOUR_OF_DAY)+ ":" + calendario.get(Calendar.MINUTE) + ":" + calendario.get(Calendar.SECOND));
      System.out.printf( "Datos en el orden inicial:\n\n" );
      for (i=0;i<=TAM-1;i++ )
	 System.out.printf("%2d",a[i]);
      System.out.printf("\n");
      for (pasada=1;(pasada<=TAM-1)&&(intercambio==true); pasada++){  /* pasadas */
         intercambio=false;
         for (i=0;i<=TAM-2;i++ ){
            if (a[i]>a[i+1]){ //comparación
               aux = a[i];    //intercambio
               a[i] = a[i+1];
               a[i+1] = aux;
               intercambio=true;
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
