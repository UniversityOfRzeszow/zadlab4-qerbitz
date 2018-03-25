/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Krzys
 */
public class Koło {
    
    Double r;
    
    public Koło(Double r){
        this.r=r;
    }
    
    public Double pole_kola()
    {
        return Math.PI*(r*r);
    }
    
    public Double obwod_kola()
    {
        return (2*Math.PI)*r;
    }
    
    public void show()
    {
        System.out.println("Promien kola: " +r);
        System.out.println("Pole kola: " +pole_kola());
        System.out.println("Obwod kola: " +obwod_kola());
        
    }
}
