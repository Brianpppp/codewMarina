package UF4.HerenciaACT;

public class Estudiant extends Persona {
     private String assignatures;
     private String curs;
   private String escola;
    private double notes;

    /**
     *
      * @return id
     */
    public String getAssignatures() {
        return assignatures;
    }

    /**
     *
     * @param assignatures
     * @return
     */
    public Estudiant setAssignatures(String assignatures) {
        this.assignatures = assignatures;
        return this;
    }

    /**
     *
     * @return
     */
    public String getCurs() {
        return curs;
    }

    /**
     *
     * @param curs
     * @return
     */
    public Estudiant setCurs(String curs) {
        this.curs = curs;
        return this;
    }

    /**
     *
     * @return
     */
    public String getEscola() {
        return escola;
    }

    /**
     *
     * @param escola
     * @return
     */
    public Estudiant setEscola(String escola) {
        this.escola = escola;
        return this;
    }

    /**
     *
     * @return
     */
    public double getNotes() {
        return notes;
    }

    /**
     *
     * @param notes
     * @return
     */
    public Estudiant setNotes(double notes) {
        this.notes = notes;
        return this;
    }
}
