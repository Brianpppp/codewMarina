package UF2.NotaMasAlta;
import java.util.Scanner;
public class MedianaMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
           leer cal=new leer();

           System.out.println("primer vector");
           double[] arrayA=new double[10];
              arrayA=cal.leerArray(arrayA);
        System.out.println("segundo vector");
        double[] arrayB=new double[10];
        arrayB=cal.leerArray(arrayB);

        double mitjanaA = cal.calcularMitjana(arrayA);
        double mitjanaB = cal.calcularMitjana(arrayB);


            if (mitjanaA > mitjanaB) {
                System.out.println("arrayA té una mitjana més alta.");
            }
            else if (mitjanaA < mitjanaB) {
                System.out.println("arrayB té una mitjana més alta.");
            }
            else {
                System.out.println("Les dues mitjanes són iguals!");
            }
        }
    }

