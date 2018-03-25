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
public class Stożek {
    
    Double r;
    Double h;
    Double l;
    
    public Stożek(Double r, Double h, Double l){
        this.r = r;
        this.h = h;
        this.l = l;
    }
    
    public Double pole_stozka()
    {
        return Math.PI*r*(r+l);
    }
    
    public Double obwod_stozka()
    {
        return (Math.PI*(r*r)*h)/3;
    }
    
    public void show()
    {
        System.out.println("Promien stozka: " +r);
        System.out.println("Dlugosc stozka: " +l);
        System.out.println("Wysokosc stozka: " +h);
        System.out.println("Pole stozka: " +pole_stozka());
        System.out.println("Obwod stozka: " +obwod_stozka());
        
    }
}
