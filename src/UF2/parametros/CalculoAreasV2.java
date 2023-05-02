package UF2.parametros;

import java.util.Scanner;
public class CalculoAreasV2 {
private double o =0;
private double area=0;
private boolean fin=false;
    public static void main (String[] args) {
        CalculoAreasV2 programa =new   CalculoAreasV2();
        programa.inici();
     }
    public void inici(){
        while (!fin) {
            menu();
            Opcion();
        }
    }
      public void menu(){
          System.out.println("\n que calculo quieres hacer");
          System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
          System.out.println("[T] Triangulo");
          System.out.println("[C] Cuadrado");
          System.out.println("[R] Rectangulo.");
          System.out.println("[TR] Trapecio.");
          System.out.println("[RM] Rombo.");
          System.out.println("[PL] Paralelograma.");
          System.out.println("[CL] Circulo.");
          System.out.println("[FIN] salir del programa.");
      }
    public void Opcion() {
        Scanner lector = new Scanner(System.in);
        String opcio = lector.nextLine();
        if (opcio.equalsIgnoreCase("T")) {
            o = triangulo();

        }
        else if (opcio.equalsIgnoreCase("C")) {
            o=cuadrado();

        }
        else if (opcio.equalsIgnoreCase("R")) {
            o=rectangulo();

        }
        else if (opcio.equalsIgnoreCase("TR")) {
            o=trapecio();

        }
        else if (opcio.equalsIgnoreCase("RM")) {
            o=rombo();

        }
        else if (opcio.equalsIgnoreCase("PL")) {
            o=paralelograma();

        }
        else if (opcio.equalsIgnoreCase("CL")) {
            o=circulo();

        }

        else if (opcio.equalsIgnoreCase("fin")) {
           fin=true;
        }
        else{
            System.out.println("opcion incorrecta");
        }
        System.out.println("El resulado es " + o + ".");
    }
        public double triangulo() {
            Scanner lector = new Scanner(System.in);
            System.out.println("base");
           double b =lector.nextDouble();
            System.out.println("altura");
            double h =lector.nextDouble();
            area = (b*h)/2;
            return area;
        }
         public double cuadrado() {

        Scanner lector = new Scanner(System.in);
        System.out.println("radio");
        double r = lector.nextDouble();
        area = Math.pow(r, 2);
        return area;
        }
       public double rectangulo() {

        Scanner lector = new Scanner(System.in);
        System.out.println("altura");
        double a = lector.nextDouble();
        System.out.println("base");
        double b = lector.nextDouble();
        area = a*b;
        return area;
       }
       public double trapecio() {
        Scanner lector = new Scanner(System.in);
        System.out.println("base menor");
        double a = lector.nextDouble();
        System.out.println("base mayor");
        double b = lector.nextDouble();
        System.out.println("altura");
        double h = lector.nextDouble();
        area = ((a * b) * h) / 2;
        return area;

       }
      public double rombo() {
        Scanner lector = new Scanner(System.in);
        System.out.println("diagonal mayor");
        double dM = lector.nextDouble();
        System.out.println("diagonal menor");
        double dm = lector.nextDouble();
        area = (dM*dm)/2;
        return area;
      }
        public double paralelograma() {
        Scanner lector = new Scanner(System.in);
        System.out.println("base");
        double b = lector.nextDouble();
        System.out.println("altura");
        double h = lector.nextDouble();
        area = b*h;
        return area;
      }
     public double circulo() {
        Scanner lector = new Scanner(System.in);
        System.out.println("radio");
        double r=lector.nextDouble();
        area =Math.pow(r, 2)*Math.PI;
        return area;
     }
}
