import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // 1 7 19 37 61
        //  6 12 18 24
        int passed = 1;
        int room = 1;
        int i = 1;
        while(room < n){
            room += i*6;
            i++;
            passed++;
        }

        System.out.println(passed);
        in.close();
    }
}