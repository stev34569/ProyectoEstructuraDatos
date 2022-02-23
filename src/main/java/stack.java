/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author steve
 */
public class stack {

    private node top;
    private int lenght;

    public void stack() {
        top = null;
        lenght = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getLengt() {
        return lenght;
    }

    /**
     *
     * este metodo ingresa un nuevo valor al inicio/top de nuestra pila
     *
     */
    public void push(int value) {
        node newNode = new node(); //detalle
        newNode.setValue(value);
        //verifica sinla lista esta vacia 
        if (isEmpty()) {

            top = newNode;
            System.out.println("");
            System.out.println(top.getValue());
        } else {
            if (top == null) {

            }

            newNode.setNext(top);

            top = newNode;
            System.out.println("El top anterior fue");
            System.out.println(top.getValue());

            lenght++;
        }

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("por queno agregas un nuevo nodo ?");
            System.out.println(top.getValue());
            lenght--;
            //asigna como primer elemento ,el siguiente de la pila
            top = top.getNext();
            System.out.println("El nuevo top es");
            System.out.println(top.getValue());
            lenght--;
        } else {
        }
    }
}
