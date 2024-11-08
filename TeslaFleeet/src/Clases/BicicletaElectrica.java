/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Cetecom
 */
public class BicicletaElectrica extends Vehiculo{
    private String tipoFreno;
    private Integer capacidadBateria;

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(String tipoFreno, Integer capacidadBateria) {
        this.tipoFreno = tipoFreno;
        this.capacidadBateria = capacidadBateria;
    }

    public BicicletaElectrica(String tipoFreno, Integer capacidadBateria, String codigoNumerico, String mantenimiento) {
        super(codigoNumerico, mantenimiento);
        this.tipoFreno = tipoFreno;
        this.capacidadBateria = capacidadBateria;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public Integer getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(Integer capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" + "tipoFreno=" + tipoFreno + ", capacidadBateria=" + capacidadBateria + '}';
    }
    
    //datos de la bicicicleta
    public void datosBicicleta(){
        System.out.println("codigo numerito;"+super.getCodigoNumerico()+ 
                            " tipo de freno:"+ getTipoFreno()+ " capacidad de bateria:"+ getCapacidadBateria()+
                                "requiere mantencion:"+ super.getMantenimiento());
    }
    
    public void descuentoBicicleta(double total, int cantidadHoras){
        int ValorHoraAlquiler= 15000;

    //calculamos el total 
    total = ValorHoraAlquiler * cantidadHoras;
    if (this.capacidadBateria< 20){
        total= total * (8/100) ; //o 0.92 
        System.out.println("su total es de: $"+ total);
        
        
    }
    }
}
