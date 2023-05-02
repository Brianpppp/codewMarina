package UF4.HerenciaMultinivelACT;

public class Arona extends seat{
    private String color ="blau";
    private int km=0;

    /**
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     * @return
     */
    public Arona setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     *
     * @return
     */
    public int getKm() {
        return km;
    }

    /**
     *
     * @param km
     * @return
     */
    public Arona setKm(int km) {
        this.km = km;
        return this;
    }
}
