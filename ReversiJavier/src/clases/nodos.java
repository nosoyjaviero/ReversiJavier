/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author dieg_
 */
public class nodos {
     private String nombre;
    private int jugador;
    
    private nodos anterior;
    private nodos siguiente;


    public nodos() {
    }
    
    public nodos(String nombre, int jugador) {
        this(nombre, jugador, null, null);
    }
    
    public nodos(String nombre, int jugador, nodos anterior, nodos siguiente) {
        this.nombre = nombre;
        this.jugador = jugador;
        this.anterior= anterior;
        this.siguiente= siguiente;
    }
    
    public void asignar(String nombre, int jugador, nodos anterior, nodos siguiente){
        setNombre(nombre);
        setJugador(jugador);
        setAnterior(anterior);
        setSiguiente(siguiente);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the jugador
     */
    public int isJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    /**
     * @return the anterior
     */
    public nodos getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(nodos anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the siguiente
     */
    public nodos getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(nodos siguiente) {
        this.siguiente = siguiente;
    }
}
