/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Cetecom
 */
public class Auto extends Vehiculo{
    private Integer cantidadPersonas; //que el usuario me de este valor
    private String autoPilot; //si o no

    public Auto() {
    }

    public Auto(Integer cantidadPersonas, String autoPilot) {
        this.cantidadPersonas = cantidadPersonas;
        this.autoPilot = autoPilot;
    }

    public Auto(Integer cantidadPersonas, String autoPilot, String codigoNumerico, String mantenimiento) {
        super(codigoNumerico, mantenimiento);
        this.cantidadPersonas = cantidadPersonas;
        this.autoPilot = autoPilot;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(String autoPilot) {
        this.autoPilot = autoPilot;
    }

    @Override
    public String toString() {
        return "Auto{" + "cantidadPersonas=" + cantidadPersonas + ", autoPilot=" + autoPilot + '}';
    }
    
    //datos del auto
    public void datosAuto(){
        System.out.println("codigo numerito;"+super.getCodigoNumerico()+ 
                            " autoPilot:"+ getAutoPilot()+ " Capadicad de personas:"+ getCantidadPersonas()+
                                "requiere mantencion:"+ super.getMantenimiento());
    }
    
    public void adicionalAutoPilot(int cantidadHoras, double total){
        
    int ValorHoraAlquiler= 15000;
    //calculamos el total 
    total = ValorHoraAlquiler * cantidadHoras;
    
    if(autoPilot != "no"){
        total = total * (110/100); //o 1.1
        System.out.println("su total es de: $"+total);
        
    }
    }
    
}
