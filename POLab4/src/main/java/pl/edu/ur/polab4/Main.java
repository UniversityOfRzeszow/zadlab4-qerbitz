package pl.edu.ur.polab4;

import pl.edu.ur.polab4.obliczanieFigur.*;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5

        int wybor;
        double a, b, h, r,l;

        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Wybierz figure geometryczna: ");
        System.out.println("1. Kolo");
        System.out.println("2. Kula");
        System.out.println("3. Kwadrat");
        System.out.println("4. Prostokat");
        System.out.println("5. Prostopadloscian");
        System.out.println("6. Stozek");
        System.out.println("7. Szescian");

        wybor = wczytaj.nextInt();

        switch (wybor) {
            case 1:
                System.out.println("Podaj promien kola");
                r = wczytaj.nextDouble();
                Koło kolo1 = new Koło(r);
                kolo1.show();
                break;
            case 2:
                System.out.println("Podaj promien Kuli");
                r = wczytaj.nextDouble();
                Kula kula1 = new Kula(r);
                kula1.show();
                break;
            case 3:
                System.out.println("Podaj bok kwadratu");
                a = wczytaj.nextDouble();
                Kwadrat Kwadrat1 = new Kwadrat(a);
                Kwadrat1.show();
                break;
            case 4:
                System.out.println("Podaj pierwszy bok: ");
                a = wczytaj.nextDouble();
                System.out.println("Podaj drugi bok: ");
                b = wczytaj.nextDouble();
                Prostokąt prostokat1 = new Prostokąt(a, b);
                prostokat1.show();
                break;
            case 5:
                System.out.println("Podaj pierwszy bok prostopadłoscianu: ");
                a = wczytaj.nextDouble();
                System.out.println("Podaj drugi bok prostopadłoscianu: ");
                b = wczytaj.nextDouble();
                System.out.println("Podaj wysokosc prostopadłoscianu: ");
                h = wczytaj.nextDouble();
                Prostopadłościan prostopadloscian1 = new Prostopadłościan(a,b,h);
                prostopadloscian1.show();
                break;
            case 6:
                System.out.println("Podaj promien stozka");
                r = wczytaj.nextDouble();
                System.out.println("Podaj dlugosc boku stozka");
                l = wczytaj.nextDouble();
                System.out.println("Podaj wysokosc stozka");
                h = wczytaj.nextDouble();
                Stożek Stozek1 = new Stożek(r,l,h);
                Stozek1.show();
                break;
            case 7:
                System.out.println("Podaj bok Szescianu");
                a = wczytaj.nextDouble();
                Sześcian Szescian1 = new Sześcian(a);
                Szescian1.show();
                break;
        }
    }

}
