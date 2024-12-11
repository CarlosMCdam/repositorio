/**
 *
 * @author Gema
 */
public class Insercion_1 {
    public static int TAM=5;
    public static void main(String[] args) {
         int vector[] = { 5, 4, 6, 3, 4};
         int i=0, j, aux,indice;
         //Impresión de datos en el orden inicial
         System.out.printf( "Datos en el orden inicial:\n\n" );
         for (i=0;i<=TAM-1;i++ )
                System.out.printf("%4d",vector[i]);
         System.out.printf("\n");
         //Comienzo del algoritmo
         i=0;//FALTABA EN LOS APUNTES
         do
         {
                i++;
                aux = vector[i];
                j=i-1;
                System.out.printf("\n\t--------INICIO DE LA PASADA %d:---------\n",i);
                while (vector[j]>aux && j>0)
                {
                        vector[j+1]=vector[j]; //vector[i]=aux;
                        j--;
                        System.out.printf("\n\t\t--------PASADA %d:---------\n",i);
                for (indice=0;indice<=TAM-1;indice++ )
                    System.out.printf("%4d", vector[indice]);
                System.out.printf("\n");
                }
                if (vector[j]>aux)
                {
                        vector[j+1]=vector[j];
                        vector[j]=aux;
                }
                else
                        vector[j+1]=aux;
                System.out.printf("fin de la pasada %d\n",i);
                for (indice=0;indice<=TAM-1;indice++ )
                    System.out.printf("%4d", vector[indice]);
                System.out.printf("\n");
        } while(i<TAM-1);
        // Impresión de datos ordenados
        System.out.printf( "\n\nDatos ordenado en sentido ascendente\n\n" );
        for (i=0;i<=TAM-1;i++ )
            System.out.printf("%4d", vector[i]);
        System.out.printf("\n");


}

}
