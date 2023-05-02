package UF2.parametros;

import java.util.Scanner;

public class TrasnformarPalabras {
    private double nota=0;

    public static void main(String[] args) {
        TrasnformarPalabras programa = new  TrasnformarPalabras();
        programa.menu();
    }
    public void menu(){
        System.out.println("bienvenido a consulta de notas");
        System.out.println("si tu nota esta entre 9 i 10 es exelente");
        System.out.println("si tu nota esta entre 6.5 i 8 es notable");
        System.out.println("si tu nota esta entre 5 i 6.49 es aprovado");
        System.out.println("si tu nota esta entre menos de 5 es suspendido");
        inici();

    }

    public void inici() {
        Scanner lector = new Scanner(System.in);
        System.out.println("escribe tu nota");
        nota = lector.nextDouble();
        while  (nota < 0 || nota > 10) {
            System.out.print("Número inválido, ingrese nuevamente: ");
            nota = lector.nextInt();
        }
          String  a =notas();
        System.out.print(a);
    }
    public String notas(){
        String resultado="";
        if(nota>=9 && nota<=10){
           resultado="exelente";
        }
        else if (nota>=6.5 && nota<=8.9) {
            resultado = "notable";
        }
        else if (nota>=5 && nota<=6.49) {
            resultado = "aprovado";
        }
        else if (nota>=0 && nota<=4.9) {
            resultado = "suspendido";
        }
        return resultado;
    }
}



