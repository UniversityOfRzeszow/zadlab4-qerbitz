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
public class Sześcian {
    Double a;
    
    public Sześcian(Double a){
        this.a = a;
    }
    
    
    public Double pole_szescianu()
    {
        return 6*(a*a);
    }
    
    public Double objetosc_szescianu()
    {
        return a*a*a;
    }
    
    public void show()
    {
        System.out.println("Dlugosc boku a: " +a);
        System.out.println("Pole szescianu: "+ pole_szescianu());
        System.out.println("Objetosc szescianu: "+ objetosc_szescianu());
    }
    
}
