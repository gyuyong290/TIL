import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static Queue<int[]> q = new LinkedList<>();

    public static boolean checkImportance(){
        int importance = q.peek()[1];
        for (int[] qq : q) {
            if(qq[1] > importance){
                q.add(q.poll());
                return false;
            }
        }
        return true;
    }
    public static void printQueue(int n, int m){
        int print = 1;
        while(!q.isEmpty()){
            if(checkImportance()){
                int[] poll = q.poll();
                if(poll[0] == m){
                    System.out.println(print);
                    return;
                } else{
                    print++;
                }
            }
        }
        return;
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for(int t=0; t<tc; t++){
            int n = in.nextInt();
            int m = in.nextInt();

            for(int i=0; i<n; i++){
                q.add(new int[]{i, in.nextInt()});
            }
            printQueue(n, m);
            q.clear();
        }

        in.close();
    }
}