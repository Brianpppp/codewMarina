package UF2.parametros;
import java.util.Scanner;
public class LlegirRealDouble {
    public static void main (String[] args) {
        LlegirRealDouble programa = new LlegirRealDouble();
        programa.inici();
}
    public void inici(){
        System.out.println("leemos un real por teclado");
        double a = LeerReal();
        System.out.println("El real ha sido " + a + ".");
        System.out.println("leemos un real por teclado");
        a = LeerReal();
        System.out.println("El otro real ha sido " + a + ".");

    }
    public double LeerReal(){
        Scanner lector = new Scanner(System.in);
        double real=0;
        boolean leer =false;
        while(!leer){
            leer=lector.hasNextDouble();
            if(leer){
                real=lector.nextDouble();
            }
            else{
                System.out.println("esto no es un real");
                lector.next();
            }
        }
        lector.nextLine();
        return real;
    }
}
