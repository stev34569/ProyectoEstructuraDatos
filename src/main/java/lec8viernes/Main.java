package lec8viernes;

public class Main {

    public static void main(String[] args) {

        Lista lista = new Lista();

        Persona persona1 = new Persona(1, "pedro1");
        Persona persona2 = new Persona(2, "pedro2");
        Persona persona3 = new Persona(3, "pedro3");
        Persona persona4 = new Persona(4, "pedro4");
        
        lista.insertar(persona1);
        lista.insertar(persona2);
        lista.insertar(persona3);
        lista.insertar(persona4);
        System.out.println(lista);
      

        //lista.insertar( new Persona (1,"pedro1"));
        // lista.insertar( new Persona(2,"pedro2"));
        // lista.insertar( new Persona (3,"pedro3"));
        // lista.insertar( new Persona (4,"pedro4"));
        // lista.insertar( new Persona (5,"pedro"));
    }

}
