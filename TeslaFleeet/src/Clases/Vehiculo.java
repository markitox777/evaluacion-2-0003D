/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private String codigoNumerico;
    private String mantenimiento;


    public Vehiculo() {
    }

    public Vehiculo(String codigoNumerico, String mantenimiento) {
        this.codigoNumerico = codigoNumerico;
        this.mantenimiento = mantenimiento;
    }

    public String getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(String codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigoNumerico=" + codigoNumerico + ", mantenimiento=" + mantenimiento + '}';
    }
    
}
