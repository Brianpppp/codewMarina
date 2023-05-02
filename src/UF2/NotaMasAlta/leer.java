package UF2.NotaMasAlta;
import java.util.Scanner;
public class leer {

    public static double[] leerArray(double[] array){
        Scanner lector = new Scanner(System.in);
        for(int i=0; i<array.length;i++){
            array[i]=lector.nextDouble();
        }
        return array;
    }
    public static double calcularMitjana(double [] array){
        double mid=0;
        for (int i = 0; i < array.length; i++) {
            mid = mid + array[i];
        }
        return mid  / array.length;
    }
}



