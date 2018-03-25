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
public class Prostopadłościan {
    
    Double a;
    Double b;
    Double h;
    
    public Prostopadłościan(Double a, Double b, Double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    
    public Double pole_prostopadloscianu()
    {
        return (2*(a*b)+(b*h)+(h*a));
    }
    
    public Double objetosc_prostopadloscianu()
    {
        return a*b*h;
    }
    
    public void show()
    {
        System.out.println("Dlugosc boku a: " +a);
        System.out.println("Dlugosc boku b: " +b);
        System.out.println("Dlugosc wysokosci: " +h);
        System.out.println("Pole Prostopadloscianu: "+ pole_prostopadloscianu());
        System.out.println("Objetosc Prostopadloscianu: "+ objetosc_prostopadloscianu());
    }
}
