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
  Estudiantes[] alumno= new Estudiantes[a];
  for(i=0; i<a; i++){
 alumno[i] = new Estudiantes();
 alumno[i].setLegajo(Integer.valueOf(JOptionPane.showInputDialog("Ingrese legajo")));
 alumno[i].setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));
 alumno[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese Edad")));
 alumno[i].setCurso(JOptionPane.showInputDialog("Ingrese Curso (escribir nombre de curso)"));
    
    
}
for(i=0; i<a; i++){ 
JOptionPane.showMessageDialog(null, "Legajo: "+alumno[i].getLegajo()+"\nNombre: "+alumno[i].getNombre()+"\nEdad: "+alumno[i].getEdad()+"\nCurso: "+alumno[i].getCurso());

}

}
}
