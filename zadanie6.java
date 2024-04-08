import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //pierwszy skaner
        System.out.println("Pierwsza liczba to ");
        int a = input.nextInt();

        Scanner in = new Scanner(System.in); //drugi skaner
        System.out.println("Druga liczba to ");
        int b = in.nextInt();

        int suma = a + b;
        System.out.println("Suma liczb to " + suma);
        input.close();
        in.close();
    }
    
}
