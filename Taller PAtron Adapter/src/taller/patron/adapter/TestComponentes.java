package taller.patron.adapter;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestComponentes {

    ArrayList<Composite> calles;
    ArrayList<Ruta> rutas;
    private float oX, oY, dX, dY, disM, tiempo;
    private String nombre;

    public static void main(String[] args) {
        new TestComponentes();

        /*Composite c1 = new Calle(74,50,30,69,"Autopista",20000,20);
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
        b.mostrar();*/
    }

    public TestComponentes() {
        this.calles = new ArrayList();
        this.rutas = new ArrayList();
        this.oX = 0;
        this.oY = 0;
        this.dX = 0;
        this.dY = 0;
        this.disM = 0;
        this.tiempo = 0;
        this.nombre = "";
        this.menu();
    }

    private void menu() {
        char opcion;
        do {
            String entrada = JOptionPane.showInputDialog("=======Bienvenido=========\n"
                    + "1. Crear nueva calle \n "
                    + "2. Crear nueva ruta \n "
                    + "3. Agregar calle a una ruta \n"
                    + "0. Salir");
            opcion = entrada.charAt(0);
            switch (opcion) {
                case '0':
                    JOptionPane.showMessageDialog(null, "CHAO PESCAO..!", "Despedida", 2);
                    System.exit(0);
                    break;
                case '1':
                    this.newCalle();
                    break;
                case '2':
                    this.newRuta();
                    break;
                case '3':
                    this.calleEnRuta();
                    break;
            }
        } while (opcion != '0');
    }

    private void newCalle() {
        this.oX = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la coordenada de origen en X:"));
        this.oY = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la coordenada de origen en Y:"));
        this.dX = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la coordenada de destino en X:"));
        this.dY = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la coordenada de destino en Y:"));
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre de la calle:");
        this.disM = (float) Math.sqrt((float) Math.pow((dX - oX), 2) + (float) Math.pow((dY - oY), 2));
        this.tiempo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo promedio:"));

        Composite calle = new Calle(oX, oY, dX, dY, nombre, disM, tiempo);
        calles.add(calle);
    }

    private void newRuta() {
        char opcion;
        Ruta ruta;
        do {
            String entrada = JOptionPane.showInputDialog("=======Seleccione el tipo de ruta a agregar=========\n"
                    + "1. Ruta mas corta \n "
                    + "2. Ruta con menos trafico \n "
                    + "3. Ruta con menos peajes \n"
                    + "0. Regresar");
            opcion = entrada.charAt(0);
            switch (opcion) {
                case '0':
                    this.menu();
                    break;
                case '1':
                    ruta = new Ruta("Mas corta");
                    rutas.add(ruta);
                    break;
                case '2':
                    ruta = new Ruta("Con menos trafico");
                    rutas.add(ruta);
                    break;
                case '3':
                    ruta = new Ruta("Con menos peajes");
                    rutas.add(ruta);
                    break;
            }
        } while (opcion != '0');
    }

    private void calleEnRuta() {
        char opcion;
        do {
            String entrada = JOptionPane.showInputDialog("=======Agregar una Calle a una Ruta=========\n"
                    + "1. Crear nueva calle \n "
                    + "2. Crear nueva ruta \n "
                    + "3. Agregar calle a una ruta \n"
                    + "0. Regresar");
            opcion = entrada.charAt(0);
            switch (opcion) {
                case '0':
                    this.menu();
                    break;
                case '1':
                    this.newCalle();
                    break;
                case '2':
                    this.newRuta();
                    break;
                case '3':
                    this.calleEnRuta();
                    break;
            }
        } while (opcion != '0');
    }
}
