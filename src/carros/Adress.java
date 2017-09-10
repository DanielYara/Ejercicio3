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
public class Adress {
    private String Direccion;
    private String House;
    private String Country;
    private String PostCode;

    public Adress(String Direccion, String House, String Country, String PostCode) {
        this.Direccion = Direccion;
        this.House = House;
        this.Country = Country;
        this.PostCode = PostCode;
    }

    public String getHouse() {
        return House;
    }

    public String getCountry() {
        return Country;
    }

    public String getPostCode() {
        return PostCode;
    }
    
    
    
}    
