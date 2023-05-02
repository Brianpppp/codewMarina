package UF4.Persona;

public class persona {
    //Fitxer Persona.java
    private String dni;
    private String nom;
    private short edat;

    /**
     * constructora 1
     */

    public persona() {
    }

    /**
     * constructora 2
     * @param sDni
     * @param sNom
     * @param nEdat
     */
    public persona(String sDni, String sNom, int nEdat) {
        dni = sDni;
        nom = sNom;
        if (nEdat >= 0 && nEdat <= Short.MAX_VALUE)
            edat = (short) nEdat;
    }

    /**
     * constructora 3
     * @param sDni
     * @param sNom
     */

    public persona(String sDni, String sNom) {
        dni = sDni;
        nom = sNom;
    }

    /**
     * constructora 4
     * @param nEdat
     */
    public persona(int nEdat){
        if (nEdat >= 0 && nEdat <= Short.MAX_VALUE)
        edat=(short) nEdat;


    }

    /**
     * constructora 5
     * @param nEdat
     * @param sNom
     */
    public persona(int nEdat,String sNom ){
        nom=sNom;
        if (nEdat >= 0 && nEdat <= Short.MAX_VALUE)
            edat=(short) nEdat;

    }

    /**
     * constructora 6
     * @param sDni
     */

    public persona(String sDni){
        dni=sDni;
    }

    /**
     * constructora 7
     * @param sDni
     * @param nEdat
     */
    public persona(String sDni,int nEdat){
        dni=sDni;
        if (nEdat >= 0 && nEdat <= Short.MAX_VALUE)
            edat=(short) nEdat;

    }

    /**
     * hace cambiar el dni
     * @param nouDni
     * @return
     */
    // Retorna: 0 si s’ha pogut canviar el dni
    // 1 si el nou dni no és correcte − No s’efectua el canvi
    public int setDni(String nouDni) {
        // Aquí hi podria haver una rutina de verificació del dni
        // i actuar en conseqüència. Com que no la incorporem, retornem sempre 0
        dni = nouDni;
        return 0;
    }

    /**
     * cambia el nombre
     * @param nouNom
     */
    public void setNom(String nouNom) {
        nom = nouNom;
    }

    /**
     * cambia la edad
     * @param novaEdat
     * @return
     */
    // Retorna: 0 si s’ha pogut canviar l’edat
    // 1 : Error per passar una edat negativa
    // 2 : Error per passar una edat "enorme"
    public int setEdat(int novaEdat) {
        if (novaEdat < 0) {
            return 1;
        }
        if (novaEdat > Short.MAX_VALUE){
            return 2;
        }
        edat = (short) novaEdat;
        return 0;
    }

    /**
     *
     * @return dni
     */

    public String getDni() {
        return dni;
    }

    /**
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return edat
     */
    public short getEdat() {
        return edat;
    }

    /**
     * imprime el resultado
     */
    public void visualitzar() {
        System.out.println("Dni...........:" + dni);
        System.out.println("Nom...........:" + nom);
        System.out.println("Edat..........:" + edat);
    }
}
