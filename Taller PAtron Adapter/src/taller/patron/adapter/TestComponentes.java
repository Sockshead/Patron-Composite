package taller.patron.adapter;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestComponentes {
    private ArrayList<Ruta> rutas;

    public static void main(String[] args) {
        new TestComponentes();
    }

    public TestComponentes() {
        rutas = new ArrayList();
        this.menu();
    }

    private void menu() {
        char opcion;
        do {
            String entrada = JOptionPane.showInputDialog("=======Bienvenido=========\n"
                    + "1. Guardar nueva ruta \n "
                    + "2. Ver rutas \n "
                    + "0. Salir");
            opcion = entrada.charAt(0);
            switch (opcion) {
                case '0':
                    JOptionPane.showMessageDialog(null, "CHAO PESCAO..!", "Despedida", 2);
                    System.exit(0);
                    break;
                case '1':
                    this.newRuta();
                    break;
                case '2':
                    this.verRutas();
                    break;
                case '3':
                    break;
            }
        } while (opcion != '0');
    }

    private void newCalle(Ruta ruta) {
        float oX = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el punto de origen en X:"));
        float oY = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el punto de origen en Y:"));
        float dX = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el punto de destino en X:"));
        float dY = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el punto de destino en Y:"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la calle:");
        float disM = (float) Math.sqrt((float) Math.pow((dX - oX), 2) + (float) Math.pow((dY - oY), 2));
        float velocidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la velocidad promedio:"));
        velocidad = (velocidad*1000)/3600;
        float tiempo = (disM/velocidad)/60;

        Composite calle = new Calle(oX, oY, dX, dY, nombre, disM, tiempo);
        ruta.add(calle);
    }

    private void newRuta() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la ruta:");
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la ruta:"));
        int cupos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los cupos de su vehiculo:"));
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la ruta:");
        String hora = JOptionPane.showInputDialog("Ingrese la hora de la ruta:");
        String destino = JOptionPane.showInputDialog("Ingrese el nombre del destino:");
        Ruta ruta = new Ruta(nombre, valor, cupos, fecha, hora, destino);
        
        char opcion;
        do {
            String entrada = JOptionPane.showInputDialog("=======Desea agregar una calle?=========\n"
                    + "1. Si \n "
                    + "2. No ");
            opcion = entrada.charAt(0);
            switch (opcion) {
                case '1':
                    this.newCalle(ruta);
                    break;
                case '2':
                    ruta.mostrar();
                    this.rutas.add(ruta);
                    this.menu();
                    break;
            }
        } while (opcion != '0');
    }
    
    private void verRutas(){
        Ruta rut;
        for(int i=0;i<rutas.size();i++){
            rut = rutas.get(i);
            rut.mostrar();
        }
    }
    
}