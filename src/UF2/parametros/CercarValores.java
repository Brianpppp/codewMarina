package UF2.parametros;
import java.util.Random;
import java.util.Arrays;
public class CercarValores {
    private int[] array = new int[10];

     private  Random rd = new Random();

    public static void main(String[] args) {
        CercarValores programa = new CercarValores();
        programa.inici();
    }

    public void inici() {

        arrayRandom();
        copia1();
    }
    public void arrayRandom() {
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(11);
        }
    }
    public void copia1() {
         int copia1[] = Arrays.copyOfRange(array, 0, 5);
         int copia2[] = Arrays.copyOfRange(array, 5, array.length);
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        System.out.print("Valors a cercar: [ ");
        for (int i = 0; i < copia1.length; i++) {
            System.out.print(copia1[i] + " ");
        }
        Arrays.sort(copia2);
        System.out.println("]");
        System.out.print("Array on es cerca: [ ");
        for (int i = 0; i < copia2.length; i++) {
            System.out.print(copia2[i] + " ");
        }
        System.out.println("]");

        for (int i = 0; i < copia1.length; i++) {
            boolean trobat = false;
            for (int j = 0; j < copia2.length; j++) {
                if (copia1[i] == copia2[j] && trobat == false) {
                    System.out.println("A la posicio " + Arrays.binarySearch(copia2, copia1[i]) + " hi ha el valor " + copia1[i]);
                    trobat = true;
                }

            }
        }
    }
}

