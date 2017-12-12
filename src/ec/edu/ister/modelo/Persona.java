/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Persona {
    private String cedula;
    private String nombre;
    private Date fehcaNacimiento;
    
    public Persona(){
    
    }

    public Persona(String cedula, String nombre, Date fehcaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fehcaNacimiento = fehcaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFehcaNacimiento() {
        return fehcaNacimiento;
    }

    public void setFehcaNacimiento(Date fehcaNacimiento) {
        this.fehcaNacimiento = fehcaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", fehcaNacimiento=" + fehcaNacimiento + '}';
    }
    
   
    
    
}
