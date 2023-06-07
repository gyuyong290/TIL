import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int two = 0;
        int five = 0;
        for(int i=2; i<=n; i++){
            if(i%2 == 0){
                int t = i;
                while(t%2 == 0){
                    t /= 2;
                    two++;
                }
            }
            if(i%5 == 0){
                int t = i;
                while(t%5 == 0){
                    t /= 5;
                    five++;
                }
            }
        }
        int ans = two < five ? two : five;
        System.out.println(ans);
        in.close();
    }
}