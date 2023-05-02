package UF4.ProyecteFigura;

public class Trapezi extends Figura {
    private int a;
    private int b;
    private int h;

    public Trapezi(int a , int h ,int b){
        this.a=a;
        this.b=b;
        this.h=h;
        setFigura("Trapezi");
    }

    public int getA() {
        return a;
    }

    public Trapezi setA(int a) {
        this.a = a;
        return this;
    }

    public int getB() {
        return b;
    }

    public Trapezi setB(int b) {
        this.b = b;
        return this;
    }

    public int getH() {
        return h;
    }

    public Trapezi setH(int h) {
        this.h = h;
        return this;
    }
    public  double calculArea(){
         double area =getA() + getB() * getH()/2;
         return area;
    }
}
