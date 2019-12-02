/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author dieg_
 */
public class tablero {
    nodos primero;
    nodos ultimo;
    
    public tablero(){
        primero=ultimo=null;
    }
    
    public boolean esVacio(){
        return primero==null;
    }
    
    public void agregarAlFinal(String name, int jugador){
        if(!esVacio()){
            ultimo= new nodos(name, jugador, ultimo, null);
            ultimo.getAnterior().setSiguiente(ultimo);
        }else{
            primero=ultimo= new nodos(name, jugador);
        }
    }
    
    public void mostrarTodo(){
        if(!esVacio()){
            String datos= "";
            nodos tmp =primero;
            while(tmp!=null){
                datos=datos+"["+tmp.getNombre()+"]<=>";
                tmp= tmp.getSiguiente();
            }
            //JOptionPane.showMessageDialog(null, datos, "Mostrando todo el tablero", JOptionPane.INFORMATION_MESSAGE);
            
            System.out.println(datos);
            
            
        }
    }
}
