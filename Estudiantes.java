/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane; 
/**
 *
 * @author usuario
 */
public class Estudiantes {
private int legajo;
private String nombre;
private int edad;
private String curso;

public Estudiantes (){} 

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    
}
public static void main (String args[]){ 
  int a=1;
  int i;
  Estudiantes[] estudiante= new Estudiantes[a];
  for(i=0; i<a; i++){
 estudiante[i] = new Estudiantes();
 estudiante[i].setLegajo(Integer.valueOf(JOptionPane.showInputDialog("Ingrese legajo")));
 estudiante[i].setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));
 estudiante[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese Edad")));
 estudiante[i].setCurso(JOptionPane.showInputDialog("Ingrese Curso (escribir nombre de curso)"));
    
    
}
for(i=0; i<a; i++){ 
JOptionPane.showMessageDialog(null, "Legajo: "+estudiante[i].getLegajo()+"\nNombre: "+estudiante[i].getNombre()+"\nEdad: "+estudiante[i].getEdad()+"\nCurso: "+estudiante[i].getCurso());

}

}
}