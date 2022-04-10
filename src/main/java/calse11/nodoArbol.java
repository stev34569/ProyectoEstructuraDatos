/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calse11;

/**
 *
 * @author steve
 */
public class nodoArbol {
    private int  id;
    private nodoArbol hijoizq;
    private nodoArbol hijoDer;

    public nodoArbol() {
    }

    public nodoArbol(int id, nodoArbol hijoDer) {
        this.id = id;
        this.hijoDer = hijoDer;
    }

    nodoArbol(int value) {

    }

   
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public nodoArbol getHijoizq() {
        return hijoizq;
    }

    public void setHijoizq(nodoArbol hijoizq) {
        this.hijoizq = hijoizq;
    }

    public nodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(nodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }
    
}

