import java.util.Scanner;

public class Main {

    static int recursiveMetod(int taban, int ust){
        if (ust == 0){
            return 1;
        } else if (ust == 1 ) {
            return taban;
        }
        return taban * recursiveMetod(taban, (ust-1));
    }
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.print("ust deyeri daxil et : ");
        int ust = scan1.nextInt();

        System.out.print("alt deyeri daxil et : ");
        int taban = scan1.nextInt();
        System.out.println(recursiveMetod(taban, ust));
    }
}