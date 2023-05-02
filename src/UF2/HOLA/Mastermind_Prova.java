package UF2.HOLA;
import java.util.Scanner;

//Un programa per jugar al MasterMind.
public class Mastermind_Prova {
    //Constants
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POSICIO = 'X';
    public final static char INCORRECTE = '-';
    public final int LONG_SECRET = 3;
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String secret = "holap";
    public static String resposta = "";

    //Mètodes associats al problema general
    public static void main(String[] args) {
        Mastermind_Prova programa =new Mastermind_Prova();
        programa.inici();
        //desenvolupeu el codi d'aquesta funció
    }


    public void inici() {
        //desenvolupeu el codi d'aquesta funció
        boolean end=false;
        generarParaulaSecreta();
        while(!end) {
            preguntarResposta();
            end = resoldreResposta(secret, resposta);
        }
    }


    //Mètodes associats al primer nivell de descomposició
    //Param. entrada:
    //Param. sortida:
    public String generarParaulaSecreta() {
        String res = "";
        for (int i = 0; i < LONG_SECRET; i++) {
            res = res + generarLletraAleatoria();
        }
        return res;
    }

    //Param. entrada: cap, tot s’obté del teclat
    // Param. sortida: la paraula de resposta (un String)
    public String preguntarResposta() {
        //desenvolupeu el codi d'aquesta funció
        //strin en la funcio con returm
        System.out.println("escribe la palabra secreta");
        Scanner palabra= new Scanner(System.in);
        resposta=palabra.nextLine();
        return resposta;
    }

    //Param. entrada:
    //Param. sortida:
    public boolean resoldreResposta(String secret, String resposta) {
        String res = generarPista(secret, resposta);
        boolean fi = false;
        System.out.print("La resposta és [" + res + "].");
        if (resposta.equals(secret)){
            System.out.println("Has encertat!");
            fi = true;
        } else {
            System.out.println("Continua intentant−ho!");
        }
        return fi;
    }

    //Mètodes associats al segon nivell de descomposició
    //Param. entrada:  añade variables como entrada string secret , string resposta
    //Param. sortida:  esta funcion devuelve boolean
    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % abc.length());
        return abc.charAt(index);
    }

    //Param. entrada: no tiene
    //Param. sortida: esta funcio devuelve un char
    public boolean comprovarResposta(String resposta) {
        if (resposta.length() != LONG_SECRET) {
            return false;
        }
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if ( -1 == abc.indexOf(c)){
                return false;
            }
        }
        return true;
    }

    //Param. entrada: añade una variable resposta como entrada
    //Param. sortida: esta funcion se devuelve un boolean
    public String generarPista(String s, String r) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char charSecret = s.charAt(i);
            char charResposta = r.charAt(i);
            if (charSecret == charResposta) {
                res = res + TOT_CORRECTE;
            }
            else if (s.indexOf(charResposta) != - 1){
                res = res + MALA_POSICIO;
            }
            else {
                res = res + INCORRECTE;
            }
        }
        return res;
    }
}