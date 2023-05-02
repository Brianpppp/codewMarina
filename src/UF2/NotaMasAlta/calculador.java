package UF2.NotaMasAlta;

public class calculador {
    public static double calcularMitjana(double [] array){
        double mediana = array[0];
        double mid;
        for (int i = 0; i < array.length; i++) {
            mediana = mediana + array[i];
        }
        mid = mediana / array.length;
        return mid;
    }
}



