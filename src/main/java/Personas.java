/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author steve
 */
public class Personas {
    
    private int id;
    private String nombre;
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personas(int id) {
        this.id = id;
    }

    public Personas(String nombre) {
        this.nombre = nombre;
    }

    public Personas() {
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
