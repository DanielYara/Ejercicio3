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
public class Car {
    private ArrayList<CarModel> model;
    public  int Traveled;
    
    public Car(CarModel model, int Traveled){
        this.model.add(model);
        this.Traveled = Traveled;
    }
    
    public ArrayList<CarModel> getModel(){
    return model;
    }

    public int getTraveled() {
        return Traveled;
    }
    
    public void setTraveled(int Traveled){
        this.Traveled = Traveled;
    }

    public void setModel(ArrayList<CarModel> model) {
        this.model = model;
    }
    
    

    
    
    
    }
