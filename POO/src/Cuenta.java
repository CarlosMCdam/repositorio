public class Cuenta {
    public static final int INTERES = 2;
    private double saldo;
    private String titular;
    private String fecha;

    public Cuenta() {}
    public Cuenta(double saldo, String titular, String fecha) {
        this.saldo = saldo;
        this.titular = titular;
        this.fecha = fecha;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
