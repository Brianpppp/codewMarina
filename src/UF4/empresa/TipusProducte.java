package UF4.empresa;

public class TipusProducte {
    private String nom;
    private int codiIndentificdor;
    private double preu;
    private int  estoc;
    private boolean venda;

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     * @return
     */

    public TipusProducte setNom(String nom) {
        this.nom = nom;
        return this;
    }

    /**
     *
     * @return
     */
    public int getCodiIndentificdor() {
        return codiIndentificdor;
    }

    /**
     *
     * @param codiIndentificdor
     * @return
     */
    public TipusProducte setCodiIndentificdor(int codiIndentificdor) {
        this.codiIndentificdor = codiIndentificdor;
        return this;
    }

    /**
     *
     * @return
     */
    public double getPreu() {
        return preu;
    }

    /**
     *
     * @param preu
     * @return
     */
    public TipusProducte setPreu(double preu) {
        this.preu = preu;
        return this;
    }

    /**
     *
     * @return
     */
    public int getEstoc() {
        return estoc;
    }

    /**
     *
     * @param estoc
     * @return
     */
    public TipusProducte setEstoc(int estoc) {
        this.estoc = estoc;
        return this;
    }

    /**
     *
     * @return
     */
    public boolean isVenda() {
        return venda;
    }

    /**
     *
     * @param venda
     * @return
     */
    public TipusProducte setVenda(boolean venda) {
        this.venda = venda;
        return this;
    }
}
