/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author steve
 */
public class queue {
    //declaracion de atri

    private node head;
    private node tail;

    //Constructor sin parametros
    public queue() {

        head = null;
        tail = null;
        //Metodo insertar   
    }

    public void insertar(int dato) {

        node newNode = new node();
        newNode.setValue(dato);
        newNode.setNext(null);
        //Porque es nuestro primer elemento en la cola
        if (head == null & tail == null) {
            head = newNode;
            tail = newNode;
        }
        tail.setNext(newNode);
        tail=newNode;
        System.out.println("El valor actual del head es:");
        System.out.println(head.getValue());
    }
    //metodo extraer dato
    public void extraer(){
        System.out.println("El valor actual del head es:");
        System.out.println(head.getValue());
        head =head.getNext();
       
        System.out.println("El valor anterior del tail es:");
        System.out.println(head.getValue());
    }
    //El metodo para comprobar que la cola esta vacia 
    public boolean  isEmty(){
        boolean cola= false;
        if (head == null & tail == null) {
         cola= true;
            System.out.println("la cola esta vacia");
        } else {
             System.out.println("la no cola esta vacia");
             cola =false;
        }
        return cola;
    }
    public int lenght(){
        int resultado = 0;
        node c=this.head;
        if (isEmty()) {
            return resultado;
        }
        while (c  !=null) {            
           resultado++; 
           c=c.getNext();
        }
        return resultado;
        
    }
}
