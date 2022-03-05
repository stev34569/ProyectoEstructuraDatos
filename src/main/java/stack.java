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
        if (top == null) {
            System.out.println("La pila se encuentra vacia");
        } else {
            return false;
        }
        return false;
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
        //verifica si la lista esta vacia 
        if (isEmpty()) {
            //Inicializa la pila con el new node
            top = newNode;

        } else {
            //si no esta vacia nuestro nuevo node hace referencia al que este en el top en ese momento
            System.out.println("El top anterios fue");
            System.out.println(top.getValue());
            newNode.setNext(top);

            //nuestro star top ahora es nuestro nuevo nodo
            top = newNode;
            System.out.println("Se agrego nuestra nuevo nodo al top de la pila");
            System.out.println(top.getValue());

            lenght++;
        }

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("por queno agregas un nuevo nodo ?");
           
        } else {
             System.out.println("se quito el top de la pila");
               System.out.println(top.getValue());
                //asigna como primer elemento ,el siguiente de la pila
               top=top.getNext();
                 System.out.println("El nuevo top es");
               System.out.println(top.getValue());
                lenght--;
               
        }
    }
}
