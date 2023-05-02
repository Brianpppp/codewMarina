package UF4.ProyecteFigura;

public class Rectangle  extends Figura{
    private int costat_1;
    private int costat_2;

    public Rectangle(int c1, int c2){
        costat_1=c1;
        costat_2=c2;
        setFigura("Rectangle");
    }
    public int getCostat_1() {
        return costat_1;
    }

    public Rectangle setCostat_1(int costat_1) {
        this.costat_1 = costat_1;
        return this;
    }
    public int getCostat_2() {
        return costat_2;
    }
    public Rectangle setCostat_2(int costat_2) {
        this.costat_2 = costat_2;
        return this;
    }

 public double calculArea(){
        double area=getCostat_1()*getCostat_2();
        return area;
 }
}
