import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.print("ust deyeri daxil et : ");
        int v1 = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("alt deyeri daxil et : ");
        int v2 = scan2.nextInt();
        int result = 1;

        for (int i = 0; i < v1; i++) {
            result *= v2;
        }
        System.out.print("Netice: " + result);
    }
}