
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Pacientes {
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
public Pacientes (){} 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    

    public static void main(String[] args) {
    int i=0,tam=3;
    Pacientes[]pacientes1= new Pacientes [tam];
    int j;
    
    for(i=0; i<tam; i++){
    pacientes1[i]= new Pacientes();
    pacientes1[i].setNombre(JOptionPane.showInputDialog("Ingrese Nombre:"));
    pacientes1[i].setApellido(JOptionPane.showInputDialog("Ingrese Apellido:"));
    pacientes1[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese Edad:")));
    pacientes1[i].setDNI(Integer.valueOf(JOptionPane.showInputDialog("Ingrese DNI:")));
    }
    
    for(i=0;i<tam;i++){
    JOptionPane.showMessageDialog(null,"Apellido: "+pacientes1[i].getApellido()+ "\nNombre: " +pacientes1[i].getNombre()+"\nDNI: "+pacientes1[i].getDNI()+"\nEdad: "+pacientes1[i].getEdad());
    }
    
    
    
    
    
    }
    
}
