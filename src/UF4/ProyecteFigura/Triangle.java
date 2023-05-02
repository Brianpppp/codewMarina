package UF4.ProyecteFigura;

public class Triangle extends Figura {
    private  int base;
    private  int h;





    public Triangle(int b,int a){
       base=b;
       h=a;
       setFigura("Triangle");

    }

    public int getBase() {
        return base;
    }

    public Triangle setBase(int base) {
        this.base = base;
        return this;
    }

    public int getH() {
        return h;
    }

    public Triangle setH(int h) {
        this.h = h;
        return this;
    }

    public double calculArea(){
         double area= getBase() * getBase();
         return area;
    }

}
