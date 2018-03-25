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
public class Kwadrat {
    
    Double a;
    
    public Kwadrat(Double a){
        this.a = a;
    }
    
    public Double pole_kwadratu()
    {
        return a*a;
    }
    
    public Double obwod_kwadratu()
    {
        return 4*a;
    }
    
    public void show()
    {
        System.out.println("Dlugosc boku a: " +a);
        System.out.println("Pole kwadratu: "+ pole_kwadratu());
        System.out.println("Obwod kwadratu: "+ obwod_kwadratu());
    }
    
}
