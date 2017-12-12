/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Aplicacion {
    public static void main(String[] args) {
        Estudiante e= new Estudiante();
        e.setNombre("katherine");
        e.setCedula("1723038491");
        e.setIdEstudiante("E001");
        for (int i = 0; i < 6; i++) {
            e.setNotas(i);
        }
        JOptionPane.showMessageDialog(null,e.toString());
        
    }
    
}
