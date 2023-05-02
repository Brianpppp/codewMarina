package UF2.parametros;
import java.util.Scanner;

public class CalculNota7 {
    double[] nums = new double[5]; // en cada funcion habia un array por lo cual borré y los puse como una global para no repetir
        private double min = 0;
        private double max = 0;
        private double mitj = 0;

        public static void main(String args[]) {
            CalculNota7 programa = new CalculNota7();
            programa.inici();
        }

        public void inici() {
            mostrarMenu();
            llegirDades();
           max= calculaMax();
           min= calculaMin();
           mitj= calculaMitj();
            imprimir();
            //guarde el return de cada una de las funciones introduciendo una de las variables globales que estas arriba para luego imprimir
        }
        public void mostrarMenu() {
            System.out.println("Registramos 5 numeros");
            System.out.println("calcularemos la mediana");
            System.out.println("calcularemos el valor maximo");
            System.out.println("calcularemos el valor minimo");

        }
        public void llegirDades() {
            Scanner s = new Scanner(System.in);
            for (int i = 0; i < nums.length; i++) {
                System.out.print("Ingrese el número #" + (i + 1) + " (de 0 a 10): ");
                double nota = s.nextDouble();
                while (nota < 0 || nota > 10) {
                    System.out.print("Número inválido, ingrese nuevamente: ");
                    nota= s.nextInt();
                }
                nums[i] = nota;
            }
        }
        // al principio no tenia un arra en la cual no se podia guardar los numeros lo cual introducir un for para recorrer los numeros
    //tambien introduci un while para que solo acepten numero entre 0 y 10 en caso que pase que vuelva a introducir otra vez el numero

        public  double calculaMax() { //calcula el valor maximo
            double max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) max = nums[i];
            }
            return max;
        }

        public  double calculaMin() { //calcula el valor minimo

            double min = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min)
                    min = nums[i];
            }
            return min;
        }

        public  double calculaMitj() { //calcula el valor de la medina
            double sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return sum / nums.length;

        }
    private void imprimir() {
        System.out.println("La nota más pequeña és: " + min + '\n' + "La nota más gande: " + max + '\n' + "Y la media és: " + mitj);
    }

}



