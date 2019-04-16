package simpleAlgorithmExamaple;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int day = scanner.nextInt();
            int price = 0;
            if (day == 1) {
                price = 1;
                System.out.println(price);
            }
            if (day == 2) {
                price = 2;
                System.out.println(price);
            }
            if (day == 3) {
                price = 1;
                System.out.println(price);
            }
            if (day == 4) {
                price = 2;
                System.out.println(price);
            }
            if (day == 5) {
                price = 3;
                System.out.println(price);
            }
        }
    }
}