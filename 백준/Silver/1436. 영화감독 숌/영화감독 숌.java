import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int ans = 666;
        int count = 1;
        while(count != n){
            ans++;
            if(String.valueOf(ans).contains("666")) count++;
        }

        System.out.println(ans);
        in.close();
    }
}
