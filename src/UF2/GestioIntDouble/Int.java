package UF2.GestioIntDouble;

import java.util.Scanner;

public class Int {
    public  void pedirNumeros() {
        int[] numeros = new int[10];
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1));
            int num = lector.nextInt();
            numeros[i] = num;
        }
    }
    public int calcularMaxim(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public int  calcularMitjana(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma/array.length;
    }
    public int calcularMinim(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
