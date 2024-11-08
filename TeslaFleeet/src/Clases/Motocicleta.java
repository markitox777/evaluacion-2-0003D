/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Cetecom
 */
public class Motocicleta extends Vehiculo{
    private String modoEco;
    private Integer capacidadBateria;

    public Motocicleta() {
    }

    public Motocicleta(String modoEco, Integer capacidadBateria) {
        this.modoEco = modoEco;
        this.capacidadBateria = capacidadBateria;
    }

    public Motocicleta(String modoEco, Integer capacidadBateria, String codigoNumerico, String mantenimiento) {
        super(codigoNumerico, mantenimiento);
        this.modoEco = modoEco;
        this.capacidadBateria = capacidadBateria;
    }

    public String getModoEco() {
        return modoEco;
    }

    public void setModoEco(String modoEco) {
        this.modoEco = modoEco;
    }

    public Integer getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(Integer capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "modoEco=" + modoEco + ", capacidadBateria=" + capacidadBateria + '}';
    }
    
    //datos de la motocicleta
    public void datosMotocicleta(){
        System.out.println("codigo numerito;"+super.getCodigoNumerico()+ 
                            " capacidad de bateria:"+ getCapacidadBateria()+ " modo eco:"+ getModoEco()+
                                "requiere mantencion:"+ super.getMantenimiento());
    }
    
    //costo adicional por el modo eco
    public void AdicionalMotocicleta(int cantidadHoras,double total){
    
        int ValorHoraAlquiler= 15000;
    //calculamos el total 
    total = ValorHoraAlquiler * cantidadHoras;
    if (modoEco!="no"){
        total= total * (108/100);//o tambien puede ser 1.08
        System.out.println("su total es de: $"+ total);
        
        
    }
            
}
}
