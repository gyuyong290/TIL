import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int answer = 0;
        for(int i=1; i<n; i++){
            int num = i, sum = i;
            while(num!=0){
                sum += num%10;
                num /= 10;
            }
            if(sum == n) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        in.close();
    }
}