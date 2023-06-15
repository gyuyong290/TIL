import java.util.Scanner;

public class Main {

    public static int[] getPrime(int n){
        int[] arr = new int[n];
        for(int i=2; i<n; i++){
            arr[i] = i;
        }
        for(int i=2; i<n; i++){
            if(arr[i] == 0) continue;

            for(int j= 2*i; j<n; j+=i){
                arr[j] = 0;
            }
        }
        return arr;
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[] prime = getPrime(n+1);

        for(int i=m; i<n+1; i++){
            if(prime[i] != 0) System.out.println(i);
        }

        in.close();
    }
}