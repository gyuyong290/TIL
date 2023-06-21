import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] dots = new int[n][2];
        
        for(int i=0; i<n; i++){
            dots[i][0] = in.nextInt();
            dots[i][1] = in.nextInt();
        }

        Arrays.sort(dots, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                else return o1[0] - o2[0];
            }
        });

        for(int[] dot : dots){
            System.out.println(dot[0] + " " + dot[1]);
        }
        in.close();
    }
}