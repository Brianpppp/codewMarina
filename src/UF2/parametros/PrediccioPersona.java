package UF2.parametros;
import java.util.Scanner;
public class PrediccioPersona {
    private String equipo="";
    private String lenguaje="";
    private int suerte=0;
    private int edad=0;
    public static void main (String[] args) {
        PrediccioPersona programa = new PrediccioPersona();
        programa.inici();

    }
    public void inici() {
            menu();
            Opcion();
    }
    public void menu() {
        System.out.print("Escribe tu mes en que maciste.");
        System.out.print("\n");
        System.out.print("Enero[E]\tFebrero[F]\tMarzo[M]\n");
        System.out.print("Abril[A]\tMayo[MY]\tJunio[J]\n");
        System.out.print("Julio[JL]\tAgosto[AG]\tSetiembre[SEP]\n");
        System.out.print("Octubre[OCT]\tNoviembre[NOV]\tDiciembre[DIC]\n");
        System.out.print("\n\n");
    }
    public void Opcion() {
        Scanner lector = new Scanner(System.in);
        String opcio = lector.nextLine();
        System.out.println("como t llamas");
        String nombre= lector.nextLine();
        System.out.println("dime tu edad");
        edad= lector.nextInt();
        if (opcio.equalsIgnoreCase("E")) {
            suerte= edad*3/2;
            equipo ="Bayer Munich";
            lenguaje="C++";
        }
        else if (opcio.equalsIgnoreCase("F")) {
            suerte = edad - 4;
            equipo = "Atlético de Madrid";
            lenguaje = "Python";
        }
        else if (opcio.equalsIgnoreCase("M")) {
            suerte = edad / 4;
            equipo = "Chelsea";
            lenguaje = "JavaScript";
        }
        else if (opcio.equalsIgnoreCase("A")) {
            suerte = edad % 4;
            equipo = "Manchester city";
            lenguaje = "Node.js";
        }
        else if (opcio.equalsIgnoreCase("MY")) {
            suerte = edad * 3/6;
            equipo = "Liverpool";
            lenguaje= "React";
        }
        else if (opcio.equalsIgnoreCase("J")) {
            suerte = edad + edad;
            equipo = "Real Madrid";
            lenguaje = "C#";
        }
        else if (opcio.equalsIgnoreCase("JL")) {
            suerte = edad * edad / 5;
            equipo = "BVB";
            lenguaje = "Swift";
        }
        else if (opcio.equalsIgnoreCase("AG")) {
            suerte = edad * 1/2 * edad;
            equipo= "FCB";
            lenguaje = "Java";
        }
        else if (opcio.equalsIgnoreCase("SEP")) {
            suerte = edad / edad;
            equipo = "Juve";
            lenguaje = "PHP";
        }
        else if (opcio.equalsIgnoreCase("OCT")) {
            suerte = edad * 4 / 3;
            equipo = "PSG";
            lenguaje = "R";
        }
        else if (opcio.equalsIgnoreCase("NOV")) {
            suerte = edad % 2 + 23;
            equipo = "Sevilla CF";
            lenguaje = "Go";
        }
        else if (opcio.equalsIgnoreCase("DIC")) {
            suerte= (edad + edad) / 2;
            equipo = "Manchester United";
            lenguaje = "Ruby";
        }


        else {
            suerte = 0;
            equipo = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
            lenguaje = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
            System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
        }
        System.out.println("Un plaer conèixer-te " + nombre + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.println(">>> El teu número de la sort és : " + suerte + "!");
        System.out.println(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és : " + equipo + ".");
        System.out.print(">>> El teu llenguatge de programació més estimat serà : " + lenguaje + "!");
    }
}

