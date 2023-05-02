package UF4.ProyecteFigura;

public class Rombe extends Figura {
    private int dM;
    private int dm;

    public Rombe(int dM,int dm){
        this.dM=dM;
        this.dm=dm;
        setFigura("Rombe");
    }

    public int getdM() {
        return dM;
    }

    public Rombe setdM(int dM) {
        this.dM = dM;
        return this;
    }

    public int getDm() {
        return dm;
    }

    public Rombe setDm(int dm) {
        this.dm = dm;
        return this;
    }
    public double calculArea(){
         double area =getdM() * getDm()/2;
         return area;
    }
}
