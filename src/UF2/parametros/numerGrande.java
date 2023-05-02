package UF2.parametros;
import java.util.Scanner;
public class numerGrande {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int segundoMaximo = encontrarSegundoMaximo(numeros);

        System.out.println("El segundo número más grande es: " + segundoMaximo);
    }

    public static int encontrarSegundoMaximo(int[] numeros) {
        int maximo = numeros[0];
        int segundoMaximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                segundoMaximo = maximo;
                maximo = numeros[i];
            } else if (numeros[i] > segundoMaximo && numeros[i] != maximo) {
                segundoMaximo = numeros[i];
            }
        }

        return segundoMaximo;
    }
}

