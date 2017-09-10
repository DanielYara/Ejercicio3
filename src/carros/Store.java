/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

import java.util.ArrayList;

/**
 *
 * @author Jose Daniel Yara Sepulveda
 * @author Oscar Porras Junco
 */
public class Store {

    
    private Adress adress;
    private ArrayList<Car> cars;
   

    public Store(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }
    
    public void addcar(Car Carro){
        cars.add(Carro);
        
    }
    ArrayList <Car> ListarCarros = new ArrayList <Car>();
    
    
    
    
    
//    private Category Nombre;
//    private Category Categoria;
//    private CarModel Price;
//    private CarModel ModelNumber;
//    private Car model;
//    private Car Traveled;
//    
//    public String toString(){
//        String Reporte = "Marca:" + Nombre;
//       
//        return Reporte;
//    }
//    
//    
    
    
    
    
}
