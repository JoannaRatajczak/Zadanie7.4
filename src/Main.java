import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Spróbuj odgadnąć liczbę");

            int x = scan.nextInt();

            if (x >= 100 && x <= 200) {
                if (x % 3 == 0) {
                    System.out.println("Ok");
                    break;
                } else System.out.println("Podana liczba nie jest podzielna przez 3");
            } else if (x < 100) {
                System.out.println("Podana liczba jest za mała");
            } else {
                System.out.println("Podana liczba jest za duża");
            }
        }
    }
}
