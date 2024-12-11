import java.util.Scanner;

public class Main {
    public static void ordenarArray(int [] ejemplo) {
        for (int i = 0; i < ejemplo.length; i++) {

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(Cuenta.INTERES);

        Cuenta cuenta = new Cuenta();

        Cuenta cuenta1 = new Cuenta(100,"Carlos","22/11/2024");
        System.out.println(cuenta1.getSaldo());
        cuenta.setSaldo(200);
        System.out.println(cuenta.getSaldo());
        //OperacionesArray2 op2 = new OperacionesArray2();
        int [] ejemplo = {3,4,5,5};
        OperacionesArray2.listarEjemplo(ejemplo);
        ordenarArray(ejemplo);
    }
}