package UF2.parametros;

public class escribeEstrellas {
    public static void main (String[] args) {
        escribeEstrellas programa = new escribeEstrellas();
        programa.inici();
    }
    public void inici() {
        estrella(4);
        estrella(10);
        estrella(20);
        estrella(10);
        estrella(20);
        estrella(10);
        estrella(20);
        estrella(10);
        estrella(20);
        estrella(10);
        estrella(20);
    }
    public void estrella(int a){
        for(int i=0;i<a;i++){

            System.out.print("*");
          }
        System.out.println(" ");
        }
    }


