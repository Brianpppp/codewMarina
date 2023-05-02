package UF4.ProyecteFigura;

public class Pararllelogram  extends Figura{
    private int b;
    private int h;

    public Pararllelogram (int b, int h) {
        this.b = b;
        this.h=h;
        setFigura("Pararllelogram");
    }

    public int getB() {
        return b;
    }

    public Pararllelogram setB(int b) {
        this.b = b;
        return this;
    }

    public int getH() {
        return h;
    }

    public Pararllelogram setH(int h) {
        this.h = h;
        return this;
    }
    public double calculArea(){
       double area=getB() * getH();
       return area;
    }
}
