import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[8001];
        int sum = 0, max = -5000, min = 5000, median = 5000, mode = 5000;

        for(int i=0; i<n; i++){
            int value = in.nextInt();
            sum += value;
            arr[value+4000]++;  // 

            if(max < value) max = value;
            if(min > value) min = value;
        }

        int cnt = 0;  // counted numbers to get median
        int freq = 0;  // frequency to get mode
        boolean flag = false;

        for(int i = min+4000; i <= max+4000; i++){
            if(arr[i] > 0){
                // to get median
                if(cnt < (n+1)/2){
                    cnt += arr[i];
                    median = i-4000;
                }

                // to get mode
                if(freq < arr[i]){ // first mode num
                    freq = arr[i];
                    mode = i-4000;
                    flag = true;
                } else if(freq == arr[i] && flag){  // second mode num
                    mode = i-4000;
                    flag = false;
                }
            }
        }

        System.out.println(Math.round((double)sum/n));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);

        in.close();
    }
}