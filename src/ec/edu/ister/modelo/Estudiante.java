/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Estudiante  extends Persona{
    private String idEstudiante;
    ArrayList<Double> notas = new ArrayList<Double>();

    public Estudiante() {
    }

    public Estudiante(String ci,String nom,Date fechaNacimiento, String idEstudiante, String cedula, String nombre, Date fehcaNacimiento) {
        super(cedula, nombre, fehcaNacimiento);
        this.idEstudiante = idEstudiante;
        
    }
    
    
    /**
     * @return the idEstudiante
     */
    public String getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * @param idEstudiante the idEstudiante to set
     */
    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    /**
     * @return the notas
     */
    public String getNotas() {
        return Arrays.toString(notas.toArray());
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double notas) {
        this.notas.add(notas);
    }
//    public double todasNotas(){
//        for (int i = 0; i < 10; i++) {
//            
//        }
//    }
    public double promedio(){
        double pr=0, suma=0;
        
        for (Double nota : notas) {
            suma += nota;
            //for each-for mejorado-(iterator consultar )
        }
        pr= suma/notas.size();
        return pr;
    }

    @Override
    public String toString() {
        return super.toString()+"codigo estudiante "+
                getIdEstudiante()+"\n notas"+getNotas()+"Promedio\n"+promedio();
           
    }
    
    
}
