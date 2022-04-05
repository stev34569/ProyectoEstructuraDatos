/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec8viernes;

public class Nodo {

    private Persona dato;
    private Nodo next;

    public Nodo(Persona dato) {
        this.dato = dato;

    }

    public Nodo() {
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

}
