package UF4.ProyecteFigura;

public class Cercle extends Figura {
     private int radi;
     public Cercle(int r){

         radi=r;
         setFigura("Cercle");
     }

    public int getRadi() {
        return radi;
    }

    public Cercle setRadi(int radi) {
        this.radi = radi;
        return this;
    }
    public double calculArea(){
         double area=Math.PI*Math.pow(getRadi(),2);
         return area;
    }
}
