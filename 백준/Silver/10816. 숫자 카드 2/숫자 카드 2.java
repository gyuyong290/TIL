import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int num = in.nextInt();
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else map.put(num, 1);
        }
        int m = in.nextInt();
        int[] cards = new int[m];
        for(int i=0; i<m; i++){
            cards[i] = in.nextInt();
            if(map.containsKey(cards[i]))
                sb.append(map.get(cards[i]) + " ");
            else sb.append("0 ");
        }
        System.out.println(sb);
        in.close();
    }
}