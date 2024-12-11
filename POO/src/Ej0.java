import java.util.Arrays;
import java.util.Collections;

public class Ej0 {
    public static void main(String[] args) {
        OperacionesArray op = new OperacionesArray(new int[]{45, 65, 234, 3, 98});
        System.out.println("Cargar un array\n"+Arrays.toString(op.getEjemplo()));
        System.out.println("Listar contenido de un array\n");
    }
}
