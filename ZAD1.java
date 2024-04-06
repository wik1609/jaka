
import java.util.Scanner;

public class ZAD1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Przedmioty
        String[] przedmioty = {"chemii", "biologii", "matematyki"};
        double suma = 0;

        // Pobieranie ocen od użytkownika
        for (String przedmiot : przedmioty) {
            System.out.print("Podaj ocenę z " + przedmiot + ": ");
            double ocena = scanner.nextDouble();
            suma += ocena;
        }

        // Obliczanie średniej arytmetycznej
        double srednia = suma / przedmioty.length;

        // Wyświetlanie wyniku
        System.out.println("Twoja średnia arytmetyczna z przedmiotów: " + srednia);
    
        scanner.close();
    }
}