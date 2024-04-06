import java.util.Scanner;

    public class ZAD2 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Przedmioty
            String[] przedmioty = {"chemii", "biologii", "matematyki"};
            double[][] oceny = new double[przedmioty.length][3]; // Tablica przechowująca oceny (maksymalnie 3 ocen na przedmiot)
    
            // Dodawanie ocen dla każdego przedmiotu
            for (int i = 0; i < przedmioty.length; i++) {
                System.out.println("Dodawanie ocen dla przedmiotu: " + przedmioty[i]);
                int liczbaOcen = dodajOceny(scanner, oceny[i]); // Funkcja dodająca oceny dla danego przedmiotu
                double srednia = obliczSrednia(oceny[i], liczbaOcen); // Obliczanie średniej arytmetycznej ocen dla danego przedmiotu
                System.out.println("Średnia arytmetyczna z " + przedmioty[i] + ": " + srednia);
            }
    
            scanner.close();
        }
    
        // Funkcja dodająca oceny do tablicy i zwracająca liczbę dodanych ocen
        public static int dodajOceny(Scanner scanner, double[] oceny) {
            int liczbaOcen = 0;
            while (true) {
                System.out.print("Podaj ocenę (lub wpisz 'koniec' aby zakończyć): ");
                String input = scanner.nextLine();
    
                if (input.equalsIgnoreCase("koniec")) {
                    break;
                }
    
                try {
                    double ocena = Double.parseDouble(input);
                    oceny[liczbaOcen] = ocena;
                    liczbaOcen++;
                } catch (NumberFormatException e) {
                    System.out.println("Niepoprawny format. Wprowadź liczbę.");
                }
            }
            return liczbaOcen;
        }
    
        // Funkcja obliczająca średnią arytmetyczną ocen
        public static double obliczSrednia(double[] oceny, int liczbaOcen) {
            if (liczbaOcen == 0) {
                return 0; // Jeśli nie ma żadnych ocen, zwracamy 0
            }
    
            double suma = 0;
            for (int i = 0; i < liczbaOcen; i++) {
                suma += oceny[i];
            }
            return suma / liczbaOcen;
        }
    }

