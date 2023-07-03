import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<k; i++){
            int value = Integer.parseInt(br.readLine());
            if(value == 0){
                sum -= st.pop();
            }
            else {
                st.add(value);
                sum += value;
            }
        }

        System.out.println(sum);
    }
}