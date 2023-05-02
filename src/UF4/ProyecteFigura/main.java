package UF4.ProyecteFigura;

public class main {
        public static void main(String args[]) {
            Figura f1=new Figura();
            f1.imprimirDades();


            Cercle c1= new Cercle(6);
            c1.imprimirDades();


            Trapezi t1=new Trapezi(8,8,8);
            t1.imprimirDades();


            Rombe r1=new Rombe(3,6);
            r1.imprimirDades();

            Pararllelogram p1=new Pararllelogram(6,3);
            p1.imprimirDades();

            Triangle tr=new Triangle(6,2);
            tr.imprimirDades();

            Quadrat q1=new Quadrat(6);
            q1.imprimirDades();

            Rectangle rc=new Rectangle(4,5);
            rc.imprimirDades();
        }
}
