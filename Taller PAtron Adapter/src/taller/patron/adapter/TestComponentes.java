/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.patron.adapter;

/**
 *
 * @author JUan Camilo Posada
 */
public class TestComponentes {
    public TestComponentes(){
    }
    public static void main(String[] args){
        Composite c1 = new Calle(74,50,30,69,"Autopista",20000,20);
        Composite c2 = new Calle(74,50,45,19,"Septima",22000,30);
        Composite c3 = new Calle(74,50,15,89,"Boyaca",25000,35);
        Composite c4 = new Calle(74,50,45,100,"Variante cota",10000,25);
        Composite c5 = new Calle(74,50,54,91,"Variante Cajica",7000,15);
        Composite c6 = new Calle(74,50,20,44,"Zipaquira",17000,30);
        
        Ruta a = new Ruta("Mas corta");
        Ruta b = new Ruta("Con menos trafico");
        Ruta c = new Ruta("Con menos peajes");
        
        a.add(c1);
        a.add(c2);
        a.add(c3);
        
        b.add(a);
        
        b.mostrar();
        
        c.add(c4);
        a.add(c5);
        a.add(c6);
        b.mostrar();
    }
}
