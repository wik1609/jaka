import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
    Scanner input = new Scanner(System.in); 
    System.out.println("Podaj liczbę ");
    
    int number = input.nextInt();
    int lastDigit = number%10; //liczba%10 zawsze wskaze nam ostatnia cyfre
    
    
    System.out.println("Twoja liczba to " + number);
    System.out.println("Ostatnia cyfra to " + lastDigit);
    input.close();
    } //% - reszta z dzielenia
}
