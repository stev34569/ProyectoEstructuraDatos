/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec09viernes;

import lec8viernes.*;

/**
 *
 * @author steve
 */
class NodeDobleCircular {

    private Persona perosona;
    private NodeDobleCircular next;
    private NodeDobleCircular back;

    public NodeDobleCircular(Persona perosona) {
        this.perosona = perosona;
    }

    @Override
    public String toString() {
        return "NodeDobleCircular{" + "perosona=" + perosona + ", next=" + next + ", back=" + back + '}';
    }

    public Persona getPerosona() {
        return perosona;
    }

    public void setPerosona(Persona perosona) {
        this.perosona = perosona;
    }

    public NodeDobleCircular getNext() {
        return next;
    }

    public void setNext(NodeDobleCircular next) {
        this.next = next;
    }

    public NodeDobleCircular getBack() {
        return back;
    }

    public void setBack(NodeDobleCircular back) {
        this.back = back;
    }

}
