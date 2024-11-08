/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleeet;

import Clases.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import Clases.Auto;
import Clases.BicicletaElectrica;
import Clases.Motocicleta;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class TeslaFleeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administracion lista = new Administracion();
        Scanner entrada = new Scanner(System.in);
        
        int opcion= 0;
        
        while(opcion!=8){
            System.out.println("Menu");
            System.out.println("1- Agregar auto");
            System.out.println("2- Agregar moto");
            System.out.println("3- Agregar bicicleta electrica");
            System.out.println("4- Arrendar auto");
            System.out.println("5- Arrendar motocicleta"); 
            System.out.println("6- Arrendar bicicleta electrica");
            System.out.println("7- Cantidad de vehiculos en TeslaFleet");
            System.out.println("8 Salir");
            
            opcion= entrada.nextInt();
            switch(opcion){
                case 1:
                    Auto nuevoAuto = new Auto(); 
                    System.out.println("Ingrese la cantidad de personas que puede llevar");
                    nuevoAuto.setCantidadPersonas(entrada.nextInt());
                    
                    System.out.println("Ingrese el codigo numerico para el auto");
                    nuevoAuto.setCodigoNumerico(entrada.next());
                    
                    System.out.println("Requiere de mantencion? si o no");
                    nuevoAuto.setMantenimiento(entrada.next());


                    lista.agregarAuto(nuevoAuto);
                    //agregar moto
                case 2:
                    Motocicleta nuevaMoto= new Motocicleta();
                    
                    System.out.println("ingrese la capacidad de la bateria ");
                    nuevaMoto.setCapacidadBateria(entrada.nextInt());
                    
                    System.out.println("Ingrese el codigo numero para el auto");
                    nuevaMoto.setCodigoNumerico(entrada.next());
                    
                    System.out.println("Requiere de mantencion? si o no");
                    nuevaMoto.setMantenimiento(entrada.next());
                    
                    System.out.println("Tiene modo economico? si/no");
                    nuevaMoto.setModoEco(entrada.next());
                    lista.agregarMoto(nuevaMoto);
                    //agregar bicicleta
                case 3:
                    BicicletaElectrica nuevaBici= new BicicletaElectrica();
                    System.out.println("ingrese el tipo de freno");
                    nuevaBici.setTipoFreno(entrada.next());
                    
                    System.out.println("Ingrese el codigo numero para el auto");
                    nuevaBici.setCodigoNumerico(entrada.next());
                    
                    System.out.println("Requiere de mantencion? si o no");
                    nuevaBici.setMantenimiento(entrada.next());
                    
                    System.out.println("ingrese la capacidad de bateria");
                    nuevaBici.setCapacidadBateria(entrada.nextInt());
                    
                    lista.agregarbicicleta(nuevaBici);
                    //arrendar auto
                case 4:
                    System.out.println("Ingrese el codigo del auto que arrendara");
                    entrada.nextInt();
                    
                    System.out.println("Ingrese ");
                    entrada.nextInt();
                    
                    System.out.println("Requiere de mantencion? si o no");
                    entrada.next();
                    
                    System.out.println("ingrese la capacidad de bateria");
                    entrada.nextInt();
                case 5:
                    System.out.println("");
                    entrada.nextInt();
                    
                    System.out.println("Ingrese el codigo del auto");
                    entrada.nextInt();
                    
                    System.out.println("Requiere de mantencion? si o no");
                    entrada.next();
                case 7:
                    


            }
        }
        
        
        
    }
    
}
