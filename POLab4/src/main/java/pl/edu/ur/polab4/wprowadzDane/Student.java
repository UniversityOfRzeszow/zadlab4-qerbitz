/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/**
 *
 * @author Krzysztof Plesniak
 */
public class Student {

    Scanner wczytaj = new Scanner(System.in);
    int i;                                          
    
    
    
    public String imie;
    public String nazwisko;
    public int nr_indeksu;
    public String nazwaspecjalnosci;
    public int rok_studiow;

    public Student() {
        this.imie = "";
        this.nazwisko = "";
        this.nr_indeksu = 0;
        this.nazwaspecjalnosci = "";
        this.rok_studiow = 0;
    }

    public void show() {
        System.out.println("Imie: " +imie);
        System.out.println("Nazwisko: " +nazwisko);
        System.out.println("Nr indeksu: " +nr_indeksu);
        System.out.println("Nazwa specjalnosci: " +nazwaspecjalnosci);
        System.out.println("Rok studiow: " +rok_studiow);
    }

    public void usuniecie_danych() {
        this.imie = "";
        this.nazwisko = "";
        this.nr_indeksu = 0;
        this.nazwaspecjalnosci = "";
        this.rok_studiow = 0;
    }

    public void wybrany_indeks() {
        System.out.println("Podaj imie: ");
        this.imie = wczytaj.next();
        
        System.out.println("Podaj nazwisko: ");
        this.nazwisko = wczytaj.next();
        
        System.out.println("Podaj nr indeksu: ");
        this.nr_indeksu = wczytaj.nextInt();
        
        System.out.println("Podaj specjalnosc: ");
        this.nazwaspecjalnosci = wczytaj.next();
        
        System.out.println("Podaj rok studiow: ");
        this.rok_studiow = wczytaj.nextInt();
    }
}
