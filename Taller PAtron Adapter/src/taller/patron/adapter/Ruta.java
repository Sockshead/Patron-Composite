/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.patron.adapter;

import java.util.ArrayList;

/**
 *
 * @author JUan Camilo Posada
 */
public class Ruta implements Composite {
    private String nombre;
    
    private ArrayList <Composite> componentes;
    
    public Ruta(String nombre){
        setNombre(nombre);
        setComponentes(new ArrayList());
    }
    
    public Ruta(){
        setNombre("");
        setComponentes(new ArrayList());
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void mostrar(){
        for(Composite c: componentes) c.mostrar();
        System.out.println("se tomo la ruta "+nombre);
    }
    
    public void add(Composite e){
        getComponentes().add(e);
    }
    
    public ArrayList<Composite> getComponentes(){
        return componentes;
    }
    
    public void setComponentes(ArrayList<Composite> componentes){
        this.componentes = componentes;
    }
}
