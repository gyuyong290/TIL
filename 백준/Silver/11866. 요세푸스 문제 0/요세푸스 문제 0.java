import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
       
        LinkedList<Integer> josephus = new LinkedList<>();

        for(int i=1; i<=n; i++){
            josephus.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        int idx = k-1;
        while(josephus.size() > 1){
            sb.append(josephus.remove(idx) + ", ");
            idx += k - 1;
            while(idx >= josephus.size()){
                idx -= josephus.size();
            }
        }

        sb.append(josephus.remove(0) + ">");
        System.out.println(sb);
        in.close();
    }
}