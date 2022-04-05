package lec09viernes;

import lec8viernes.*;

/**
 *
 * @author steve
 */
public class ListaDobleCircular {

    public NodeDobleCircular cabeza;
    public NodeDobleCircular ultimo;

    public void insertar(Persona persona) {
        //No existe ningun otro elemento en la lista
        if (cabeza == null) {
            cabeza = new NodeDobleCircular(persona);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

            //Si existe algun elemento al menos y se desea
            //inserta al inicio el nuevo nodo
        } else if (persona.getId() < cabeza.getPerosona().getId()) {
            NodeDobleCircular aux = new NodeDobleCircular(persona); 
            aux.setNext(cabeza);
            aux.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
    
            //Si existe algun elemento al menos y se desea
            //inserta al final el nuevo nodo
        } else if (persona.getId() >= cabeza.getPerosona().getId()) {
            NodeDobleCircular aux = new NodeDobleCircular(persona);
            aux.setBack(ultimo);
            ultimo.setNext(aux);
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        }
        else{
            NodeDobleCircular aux = cabeza;
            while (aux.getNext().getPerosona().getId()<persona.getId()) {                
                
                aux=aux.getNext();
            }
            NodeDobleCircular temporal = new NodeDobleCircular(persona);
            temporal.setNext(aux.getNext());
            temporal.setBack(aux);
            temporal.getNext().setBack(aux);
            aux.setNext(temporal);
            
        }
    }

}
