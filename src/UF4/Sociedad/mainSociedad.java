package UF4.Sociedad;

import UF4.Persona.persona;
public class mainSociedad {
    public static void main(String args[]) {



        persona a1 = new persona("47924183A", "BRIAN", 22);



         persona a2=new persona();
         a2.setDni("4554457a");
         a2.setNom("brian");
         a2.setEdat(21);


         persona a3=new persona(54);
         a3.setNom("ker");
         a3.setDni("5648584f");

         persona a4=new persona(45,"brian" );
         a4.setDni("5745365a");

         persona a5=new persona("453583583A");
         a5.setNom("alex");
         a5.setEdat(55);

         persona a6=new persona("735357383Q", 34);
         a6.setNom("kevin");

         persona a7=new persona();


         a1.visualitzar();
         a2.visualitzar();
        a3.visualitzar();
        a4.visualitzar();
        a5.visualitzar();
        a6.visualitzar();
        a7.visualitzar();


    }

}
