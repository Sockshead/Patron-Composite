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
public class Calle implements Composite{
    private float oX,oY,dX,dY, disM,tiempo;
    private String nombre;
    
    public Calle() {
        setNombre("");
    }
    
    public void mostrar(){
        System.out.println("Coordenada de origen en x: "+oX+" Coordenada de origen en y: "+oY+" Coordenada de destino en x: "+dX+" Coordenada de destino en y: "+dY+
                " nombre de calle: "+nombre+" distancia en metros: "+disM+" tiempo en minutos "+tiempo);
    }
    
    public Calle(float oX,float oY,float dX,float dY,String nombre,float disM, float tiempo){
        setoX(oX);
        setoY(oY);
        setdX(dX);
        setdY(dY);
        setNombre(nombre);
        setDisM(disM);
        setTiempo(tiempo);
    }

    public float getoX() {
        return oX;
    }

    public void setoX(float oX) {
        this.oX = oX;
    }

    public float getoY() {
        return oY;
    }

    public void setoY(float oY) {
        this.oY = oY;
    }

    public float getdX() {
        return dX;
    }

    public void setdX(float dX) {
        this.dX = dX;
    }

    public float getdY() {
        return dY;
    }

    public void setdY(float dY) {
        this.dY = dY;
    }

    public float getDisM() {
        return disM;
    }

    public void setDisM(float disM) {
        this.disM = disM;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
