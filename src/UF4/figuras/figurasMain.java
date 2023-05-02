package UF4.figuras;

public class figurasMain {
    /**
     * esta funcion añade valores int y string dependiendo que figura has puesto
     * @param args
     */
    public static void main(String[] args) {
        rectangle r1 =new rectangle("azul");


        /*rectangle r2 = new rectangle();
        r2.base=5;
        r2.altura=3;
        r2.color="verde";*/

        rectangle r2 = new rectangle(5,3);
        r2.color="verde";


       /* rectangle r3=new rectangle();
        r3.base=6;
        r3.altura=4;
        r3.color="rosa";*/
        rectangle r3=new rectangle(6 ,4,"rosa");
        r3.base=6;
        r3.altura=4;

        cuadrado c1=new cuadrado(3,"rojo");

        triangulo t1=new triangulo(4, 4,3,"verde");

        circulo cr1=new circulo(2.5,"azul");
        }
}