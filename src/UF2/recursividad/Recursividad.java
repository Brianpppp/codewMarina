package UF2.recursividad;

import UF2.parametros.Eliminar;

public class Recursividad {
    ;


    public static void main(String args[]) {
       Recursividad programa = new Recursividad();
       programa.inicio();

    }
    public void inicio(){
        menu(33);
    }
       public void menu(int x){
        if(x>0) {
            if (x % 2 == 0) {
                System.out.println("El nombre " + x + " és parell");
            }
            else {
                System.out.println("El nombre " + x + " és senar");

            }
            menu(x-1);
        }
    }
}

