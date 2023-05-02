package UF2.RegistroNotas;

public class Registro {
    public static void main(String[] args) {
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        max a = new max();
        min b= new min();
        mediana c= new mediana();
        double max = a.calcularMaxim(notes);
        double min = b.calcularMinim(notes);
        double mitjana = c.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}
