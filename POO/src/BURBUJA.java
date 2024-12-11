/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gema
 */
public class BURBUJA {
    public static final int TAM=9;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int a[]= {10,5,4,6,3,4,7,11,13};
      int i, pasada, aux;
      for (i=0;i<TAM;i++)
	 System.out.printf("%4d",a[i]);
       System.out.printf("\n");

       for (pasada=0;pasada<=TAM-2; pasada++ ){  /* pasadas */
         for (i=0;i<TAM-1;i++ ){
            if (a[i]>a[i+1]){ //comparación
               aux = a[i];    //intercambio
               a[i] = a[i+1];
               a[i+1] = aux;
            }
         }
       }
      System.out.printf( "\n\nDatos ordenados en sentido ascendente\n\n" );
      for (i=0;i<=TAM-1;i++ )
         System.out.printf("%4d", a[i]);
      System.out.printf("\n");
      
    }
}
