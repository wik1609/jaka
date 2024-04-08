import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Promień koła to ");
        double promien = r.nextInt();

        double pi = 3.14;

        double suma = pi * (promien * promien);

        System.out.println("Pole koła to " + suma);


    }

}
