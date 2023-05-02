package UF4.figuras;

/**
 * añadir variables
 */
public class rectangle {
     public int base;
     public int altura;
      public String color;

     public int getBase() {
          return base;
     }

     public int getAltura() {
          return altura;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public void setAltura(int altura) {
          this.altura = altura;
     }

     public void setBase(int base) {
          this.base = base;
     }

     /**
      *
      * @param b
      * @param a
      */
     public rectangle(int b, int a){
          base=b;
          altura=a;

     }

     /**
      *
      * @param c
      */
     public rectangle(String c){
          color=c;
     }

     /**
      * funcio instancia
      * @param b int
      * @param a  int
      * @param c string
      */
     public rectangle( int b,int a ,String c){
          color=c;
          base =b;
          altura=a;


     }
}
