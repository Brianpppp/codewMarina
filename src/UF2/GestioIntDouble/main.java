package UF2.GestioIntDouble;
import java.util.Scanner;
public  class main {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("¿Quieres trabajar con INT o DOUBLES? ");
    String tipo = sc.nextLine();

    // Creamos la instancia de la clase correspondiente

    if (tipo.equalsIgnoreCase("INT")) {
        Int uno =new Int();
    } else if (tipo.equalsIgnoreCase("DOUBLES")) {
        Double dos=new Double();
    } else {
        System.out.println("Tipo no válido");
        return;
    }

  }
}