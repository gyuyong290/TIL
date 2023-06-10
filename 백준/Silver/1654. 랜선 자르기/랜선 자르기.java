import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int lines[] = new int[k];
        long min = 0;
        long max = 0;
        for(int i=0; i<k; i++){
            lines[i] = in.nextInt();
            if(max < lines[i]) max = lines[i];
        }  // input

        max++;
        // binary search
        while(min<max){
            long mid = (min + max) / 2;
            int cnt = 0;
            for(int i=0; i<k; i++){
                cnt += lines[i]/mid;
            }
            if(cnt < n){
                max = mid;
            } else{
                min = mid+1;
            }

        }
            
        System.out.println(min-1);
        in.close();
    }
}
