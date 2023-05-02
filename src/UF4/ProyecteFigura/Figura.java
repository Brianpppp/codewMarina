package UF4.ProyecteFigura;

public class Figura {
    private String figura;

    private static int id;

    public Figura() {
        //this.figura = figura;
        this.id =++id;
    }

    public String getFigura() {
        return figura;
    }
    public int getId() {
        return id;
    }

    public void setFigura(String figura) {
        this.figura = figura;
        //
        // return this;
    }

    public void imprimirDades(){
         System.out.println("la figura es "+ getFigura());
        System.out.println("la id es " + getId());
        System.out.println("el area es " + calculArea());
        System.out.println(" ");
        System.out.println("--------------------------");

    }
    public double calculArea(){
        //double area=0;
        return 0;
    }
}
