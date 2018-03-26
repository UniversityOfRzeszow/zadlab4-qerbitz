package pl.edu.ur.polab4;

import pl.edu.ur.polab4.obliczanieFigur.*;
import pl.edu.ur.polab4.wprowadzDane.*;
import java.util.Scanner;

public class Main {

    /**
     * Krzysztof Plesniak
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5

        Scanner wczytaj = new Scanner(System.in);
        int wybor;
        double a, b, h, r, l;
        int wyborglowny;

        System.out.println("Podaj nr zadania 1 lub 2: ");
        wyborglowny = wczytaj.nextInt();

        switch (wyborglowny) {
            case 1:
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
                        Prostopadłościan prostopadloscian1 = new Prostopadłościan(a, b, h);
                        prostopadloscian1.show();
                        break;
                    case 6:
                        System.out.println("Podaj promien stozka");
                        r = wczytaj.nextDouble();
                        System.out.println("Podaj dlugosc boku stozka");
                        l = wczytaj.nextDouble();
                        System.out.println("Podaj wysokosc stozka");
                        h = wczytaj.nextDouble();
                        Stożek Stozek1 = new Stożek(r, l, h);
                        Stozek1.show();
                        break;
                    case 7:
                        System.out.println("Podaj bok Szescianu");
                        a = wczytaj.nextDouble();
                        Sześcian Szescian1 = new Sześcian(a);
                        Szescian1.show();
                        break;
                }
                break;
            case 2:
                Student[] studenci = new Student[100];

                System.out.println("1. Wprowadzanie danych studenta pod wybrany index tablicy");
                System.out.println("2. Edycja spod wybranego indeksu");
                System.out.println("3. Usuniecie danych studenta");
                System.out.println("4. Wyswietlenie obiektu o danym indeksie");
                System.out.println("5. Wyswietlenie wszystkich obiektow");
                System.out.println("6. Wyswietlenie zakresu obiektów w podanym zakresie");

                int wybor2 = wczytaj.nextInt();
                int i;
                for (int j = 0; j < 100; j++) {
                    studenci[j] = new Student();
                }
                switch (wybor2) {

                    case 1:
                        System.out.println("Podaj indeks dla ktorego chcesz wprowadzic dane: ");
                        i = wczytaj.nextInt();
                        studenci[i].wybrany_indeks();
                        break;

                    case 2:
                        System.out.println("Podaj indeks dla ktorego chcesz edytowac dane: ");
                        i = wczytaj.nextInt();
                        studenci[i].wybrany_indeks();
                        break;

                    case 3:
                        System.out.println("Podaj indeks dla ktorego chcesz usunac dane: ");
                        i = wczytaj.nextInt();
                        studenci[i].usuniecie_danych();
                        break;

                    case 4:
                        System.out.println("Podaj indeks dla ktorego chcesz wyswietlic dane: ");
                        i = wczytaj.nextInt();
                        studenci[i].show();
                        break;

                    case 5:
                        for (int j = 0; j < 100; j++) {
                            studenci[j].show();
                        }
                        break;

                    case 6:
                        int poczatek,
                         koniec;
                        System.out.println("Podaj poczatkowa wartosc zakresu: ");
                        poczatek = wczytaj.nextInt();
                        System.out.println("Podaj koncowa wartosc zakresu: ");
                        koniec = wczytaj.nextInt();
                        for (int j = poczatek; j < koniec; j++) {
                            studenci[j].show();
                        }
                        break;

                }
                break;
        }
    }
}
