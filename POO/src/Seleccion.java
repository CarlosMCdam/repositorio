/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenacion;

/**
 *
 * @author Gema
 */
public class Seleccion {
    public static int TAM=5;
    public static void main(String[] args) {
         int vector[] = { 5, 4, 6, 3, 4};
         int i=-1, j, k, aux,indice;
        //Impresión de datos en el orden inicial
         System.out.printf( "Datos en el orden inicial:\n\n" );
         for (i=0;i<=TAM-1;i++ )
                System.out.printf("%4d",vector[i]);
        //Comienzo del algoritmo
        i=-1;
        do
        {
                i++;
                aux = vector[i];
                k=i;
                j=i;//para no perder i
                do
            {
                        j++;
                        if (vector[j]<aux)
                        {
                                k=j;//para no perder j
                                aux=vector[j];//almacena el menor de los situados a la derecha del elemento tratado(vecto[i])
                        }
                } while (j<TAM-1);
                vector[k]=vector[i];
                vector[i]=aux;
                System.out.printf("\nTras pasada %d:   ",i+1);
                for (indice=0;indice<=TAM-1;indice++ )
                    System.out.printf("%4d", vector[indice]);
            System.out.printf("\n");
        } while (i<TAM-2);
        // Impresión de datos ordenados
        System.out.printf( "\n\nDatos ordenado en sentido ascendente\n\n" );
        for (i=0;i<=TAM-1;i++ )
            System.out.printf("%4d", vector[i]);
        System.out.printf("\n");
        }
}
