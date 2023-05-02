package UF4.ProyecteFigura;

import UF2.parametros.CalculNota7;

public class Quadrat extends Figura {
    private int costat;

    public int getCostat() {
        return costat;
    }
    public Quadrat(int r){
        costat=r;
        setFigura("Quadrat");
}
    public Quadrat setCostat(int costat) {
        this.costat = costat;
        return this;
    }
    public double calculArea(){
        double area= getCostat() * getCostat();
        return area;
    }
}
