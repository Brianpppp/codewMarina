package UF2.parametros;
import java.util.Scanner;

public class eliminarElemento {

        private int[] arrayy = new int[5];
        private int [] array2 = new int[4];
        private int delete = 0;

        public static void main (String[]args){
            eliminarElemento programa = new eliminarElemento();
            programa.inici();
        }

        public void inici(){
            llenar();
            delete = elemento();
            eliminar(delete);
            imprimir();
        }




        public void llenar(){
            Scanner lector = new Scanner(System.in);
            for (int i = 0;i<arrayy.length;i++){
                System.out.print("Introduce 5 numeros: " );
                arrayy[i] = lector.nextInt();
            }

        }

        public int elemento(){
            Scanner lector = new Scanner(System.in);
            int d = 0;
            System.out.println("De los siguientes valores, cual quieres eliminar?");
            for (int i = 0;i<arrayy.length;i++){
                System.out.print(arrayy[i] + ", ");
            }
            d = lector.nextInt();

            return d;
        }

        public void eliminar(int del){
            int cont = 0;
            for (int i = 0;i<arrayy.length;i++){
                if (arrayy[i] != del){
                    array2[i-cont] = arrayy[i];
                }
                else {
                    cont=1;
                }
            }
        }

        public void imprimir(){
            System.out.print("El array quedaría: ");
            for (int i = 0;i<array2.length;i++){
                System.out.print(array2[i] + ", ");
            }
            System.out.println();
        }
    }


