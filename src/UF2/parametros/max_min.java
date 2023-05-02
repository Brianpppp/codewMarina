package UF2.parametros;
import java.util.Scanner;

public class max_min {
    private double[] numeros = new double[5];
    private double a = 0;
    private boolean fin = false;

    public static void main(String[] args) {
        max_min programa = new max_min();
        programa.inici();
    }

    public void inici() {
        while (!fin){
            menu();
        imprimirOpciones();

    }

    }
    public void menu() {
        System.out.println("[R] Registrar 5 numeros.");
        System.out.println("[MAX] Consultar la maxima nota.");
        System.out.println("[MIN] Consultar la nota minima.");
        System.out.println("[MID] calcular la mediana.");
        System.out.println("[FIN] SALIR.");
        System.out.print("Opció: ");
    }

    public void imprimirOpciones() {
        Scanner lector = new Scanner(System.in);
        String opcio = lector.nextLine();
        if (opcio.equalsIgnoreCase("R")) {
            pedirNumeros(numeros);
        }
        else if (opcio.equalsIgnoreCase("MAX")) {
            a = encontrarMayor(numeros);
            System.out.println("el resultado es : " + a);

        }
        else if (opcio.equalsIgnoreCase("MIN")) {
            a = encontrarMenor(numeros);
            System.out.println("el resultado es : " + a);

        }
        else if (opcio.equalsIgnoreCase("MID")) {
            a = calcularMediana(numeros);
            System.out.println("el resultado es : " + a);

        }
        else if (opcio.equalsIgnoreCase("FIN")) {
            fin=true;
            System.out.println("adios");
        }
        else {
            System.out.println("Opció incorrecta!\n");
        }

    }
    public  void pedirNumeros(double[] numeros) {
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + " (de 0 a 10): ");
            double num = lector.nextDouble();
            while (num < 0 || num > 10) {
                System.out.print("Número inválido, ingrese nuevamente: ");
                num = lector.nextInt();
            }
            numeros[i] = num;
        }
    }

    public  double encontrarMayor(double[] numeros) {
        double mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    public  double encontrarMenor(double[] numeros) {
        double menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public double calcularMediana(double[] numeros) {
        Scanner lector = new Scanner(System.in);
        double mediana = numeros[0];
        double mid;
        for (int i = 0; i < numeros.length; i++) {
            mediana = mediana + numeros[i];
        }
        mid = mediana / numeros.length;
        return mid;
    }
}
