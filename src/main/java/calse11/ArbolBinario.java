/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calse11;

/**
 *
 * @author steve
 */
public class ArbolBinario {

    private nodoArbol raiz;

    public void insertar(int value) {
        if (raiz == null) {
            raiz = new nodoArbol(value);
        } else {
            insertar(value);
        }

    }

    public void insertar(nodoArbol nodo, int value) {
        if (value < nodo.getId()) {
            if (nodo.getHijoizq() == null) {
                nodo.setHijoizq(new nodoArbol(value));

            } else {
                insertar(nodo.getHijoizq(), value);

            }

        } else {
            if (nodo.getHijoDer() == null) {
                nodo.setHijoDer(new nodoArbol(value));
            } else {
                insertar(nodo.getHijoDer(), value);
            }
        }
    }
   public void inOrden(){
       if (raiz!=null) {
          inOrdenRecorrer(raiz);
       }
       else{
           System.out.println("El Arbol esta vacia");  
       }
   }
   private void inOrdenRecorrer(nodoArbol nodo){
       if (nodo != null) {
          inOrdenRecorrer(nodo.getHijoizq()) ;
           System.out.println(nodo.getId());
           inOrdenRecorrer(nodo.getHijoDer());
       }
   }
    }

