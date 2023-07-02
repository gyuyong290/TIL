import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];  // for counting sort
        int min = 10001, max = 0;  // to check range
        for(int i=0; i<n; i++){
            int value = Integer.parseInt(br.readLine());  // input
            arr[value]++;  // counting sort
            if(min > value) min = value;
            if(max < value) max = value;
        }

        for(int i=min; i<=max; i++){  // search array in range
            if(arr[i] > 0){
                for(int j=0; j<arr[i]; j++){
                    sb.append(i + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}