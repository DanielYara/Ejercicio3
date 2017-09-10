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
public class Category {
    private String Categoria;
    private String Nombre;

    public Category(String Categoria, String Nombre) {
        this.Categoria = Categoria;
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    

    
    
    
    }
