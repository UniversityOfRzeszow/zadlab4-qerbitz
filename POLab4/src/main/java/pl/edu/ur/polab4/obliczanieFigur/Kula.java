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
public class Kula {
    
    Double r;
    
    public Kula(Double r){
        this.r=r;
    }
    
    public Double pole_kuli()
    {
        return 4*Math.PI*(r*r);
    }
    
    public Double obwod_kuli()
    {
        return (4*Math.PI*(r*r*r))/3;
    }
    
    public void show()
    {
        System.out.println("Promien kuli: " +r);
        System.out.println("Pole kuli: " +pole_kuli());
        System.out.println("Obwod kuli: " +obwod_kuli());
        
    }
}
