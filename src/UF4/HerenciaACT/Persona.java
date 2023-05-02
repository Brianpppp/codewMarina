package UF4.HerenciaACT;

public class Persona {
   private int id;
     private int edad;
   private String nom;
   private String cognom;
   private String adreça;

    /**
     * get
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * @return
     */
    public Persona setId(int id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     * @return
     */
    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

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
    public Persona setNom(String nom) {
        this.nom = nom;
        return this;
    }

    /**
     *
     * @return
     */
    public String getCognom() {
        return cognom;
    }

    /**
     *
     * @param cognom
     * @return
     */
    public Persona setCognom(String cognom) {
        this.cognom = cognom;
        return this;
    }

    /**
     *
     * @return
     */
    public String getAdreça() {
        return adreça;
    }

    /**
     *
     * @param adreça
     * @return
     */
    public Persona setAdreça(String adreça) {
        this.adreça = adreça;
        return this;
    }
}
