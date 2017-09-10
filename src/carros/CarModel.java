/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author Jose Daniel Yara Sepulveda
 * @author Oscar Porras Junco
 */
public class CarModel {
    private Category category;
    private int Price;
    private String ModelNumber;
    
    public CarModel(Category category, int Price, String ModelNumber){
        this.category = category;
        this.Price = Price;
        this.ModelNumber = ModelNumber;
    }
    
    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return Price;
    }

    public String getModelNumber() {
        return ModelNumber;
    }
    
    
    
}
