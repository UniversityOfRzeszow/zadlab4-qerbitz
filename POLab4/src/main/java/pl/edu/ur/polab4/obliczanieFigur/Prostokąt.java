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
public class Prostokąt {
    
    Double a;
    Double b;
    
    public Prostokąt(Double a, Double b){
        this.a = a;
        this.b = b;
    }
    
    public Double pole_prostokata()
    {
        return a*b;
    }
    
    public Double obwod_prostokata()
    {
        return (2*a)+(2*b);
    }
    
    public void show()
    {
        System.out.println("Dlugosc boku a: " +a);
        System.out.println("Dlugosc boku b: " +b);
        System.out.println("Pole prostokata: "+ pole_prostokata());
        System.out.println("Obwod prostokata: "+ obwod_prostokata());
    }
}
