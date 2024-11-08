/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teslafleeet;

import Clases.Auto;
import Clases.BicicletaElectrica;
import Clases.Motocicleta;
import Clases.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Administracion {
    private List<Vehiculo> listaVehiculos = new ArrayList<>();
    
    //agregar
    public void agregarAuto(Auto aggAuto){
    listaVehiculos.add(aggAuto);
        System.out.println("Se agrego correctamente.");
    }
    
    public void agregarMoto(Motocicleta aggMoto){
    listaVehiculos.add(aggMoto);
        System.out.println("Se agrego correctamente.");
    }
   
    public void agregarbicicleta(BicicletaElectrica aggBicicleta){
    listaVehiculos.add(aggBicicleta);
        System.out.println("Se agrego correctamente.");
    }
    
    
}
