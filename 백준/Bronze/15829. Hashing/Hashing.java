import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] line = in.next().toCharArray();

        int r = 31, m = 1234567891;
        
        int hash = 0;
        for(int i=0; i<n; i++){
            int num = line[i] - 'a' + 1;
            int r2 = 1;
            for(int j=0; j<i; j++){
                r2 = r2 * r % m;
            }
            hash += num * r2;
        }
        hash %= m;

        System.out.println(hash);
        in.close();
    }
}