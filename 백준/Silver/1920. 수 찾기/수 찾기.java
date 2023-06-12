import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(in.nextInt(), true);
        }
        int m = in.nextInt();
        for(int i=0; i<m; i++){
            int num = in.nextInt();
            if(map.get(num) != null) System.out.println(1);
            else System.out.println(0);
        }

        in.close();
    }
}