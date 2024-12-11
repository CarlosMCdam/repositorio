public class OperacionesArray {
    private final int[] ejemplo;
    public OperacionesArray(int[] ejemplo) {
        this.ejemplo = ejemplo;
    }
    public int[] getEjemplo() {
        return ejemplo;
    }

    public void listarEjemplo() {
        for (int i : ejemplo) {
            System.out.println(i);
        }

    }
    public void ordenarArray() {
        for (int i = 0; i < ejemplo.length; i++) {
            if (ejemplo[i] > ejemplo[i+1]) {
                int temp = ejemplo[i];
                ejemplo[i] = ejemplo[i+1];
                ejemplo[i+1] = temp;
                System.out.print(ejemplo[i]+" ");
            }
        }
    }
}
