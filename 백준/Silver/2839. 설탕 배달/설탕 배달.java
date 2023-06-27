import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int five = n/5;
        int min = n%5;
        int three = min/3;
        while(min%3 != 0) {
            five--;
            min = n - five*5;
            three = min/3;
        }
        if(five < 0 || three < 0) System.out.println(-1);
        else System.out.println(five + three);
        in.close();
    }
}