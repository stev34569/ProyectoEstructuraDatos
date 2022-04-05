package lec8viernes;

public class Lista {

    private Nodo cabeza;
    private Nodo ultimo;

    public void insertar(Persona persona) {

        if (cabeza == null) {
            cabeza = new Nodo(persona);
            cabeza.setNext(cabeza);
            ultimo = cabeza;

        } //Insertar segun el orden del Id
        else if (persona.getId() < cabeza.getDato().getId()) {
            Nodo aux = new Nodo(persona);
            aux.setNext(cabeza);
            ultimo.setNext(aux);
            cabeza = aux;

        } //Evalua si es mayor que el ultimo
        else if (ultimo.getDato().getId() <= persona.getId()) {
            Nodo aux = new Nodo(persona);
            ultimo.setNext(aux);
            aux.setNext(cabeza);
            ultimo = aux;

            //version  presentacion
            //ultimo.setNext(new Nodo(persona)
            //ultimo = ultimo.getNext.getNex();
            //ultimo.setNext(cabeza);
        } //insertar en el medio
        else {
            Nodo aux = new Nodo(persona);
            Nodo temp = cabeza.getNext();
            //Evaluo un elemento hacia adelante para ver si es mayor o igual
            //si es mayor o igual deboinsertar despues del temp.
            while (temp.getNext().getDato().getId() >= persona.getId()) {
                //moverme al siguiente nodo
                temp = temp.getNext();

            }
            aux.setNext(temp.getNext());
            temp.setNext(aux);
        }
        ultimo.setNext(cabeza);
    }

    public void modifica(Persona persona) {
        Nodo aux = cabeza;

        aux.setDato(persona);// para pasar todo el objeto mas corto
        aux.getDato().setNombre(persona.getNombre());//Reamplasar el nombre
    }

    public Persona extrae(int id) {
        if (cabeza == null) {
            return null;
        }

        Nodo temp = cabeza;
        //Ecenario si solo hay un elemto en la lista
        if (cabeza.getNext() == cabeza) {
            if (cabeza.getDato().getId() == id) {
                cabeza = null;
                ultimo = null;
                return temp.getDato();

            }
        }

        //Escenario de que id es la cabeza y hay mas elementos
        if (cabeza.getDato().getId() == id) {
            cabeza = cabeza.getNext();
            ultimo.setNext(cabeza);
            temp.setNext(null);
            return temp.getDato();
        }
        //Recorre la lista comparando el id
        // O hasta llegar al ultimo elemto
        while (temp.getNext().getDato().getId() != id && temp.getNext() != cabeza) {
            temp = temp.getNext();
        }
        //si encontro el id y llego a la cabeza
        // otra vez 
        if (temp.getNext() == cabeza && ultimo.getDato().getId() !=id) {
            return null;
        }

        Nodo aux = temp.getNext();
        temp.setNext(aux.getNext());
        aux.setNext(null);

        //si estoy eliminando al ultimo elemento
        //Hay que mantener la referencia del ultimo
        if (aux == ultimo) {
            ultimo = temp;
        }
        return aux.getDato();
    }

    @Override
    public String toString() {
        Nodo aux = cabeza;
        String contenido = "Lista";
        System.out.println("test");
        if (aux == null) {
            contenido += "esta vacia";

        } else {
            //Para imprimir la cabeza

            contenido += aux + ",";
            aux = aux.getNext();
            //Imprimir todos los demas

            while (aux != cabeza) {
                contenido += aux + ",";
                aux = aux.getNext();

            }
        }
        return contenido;
    }

}
