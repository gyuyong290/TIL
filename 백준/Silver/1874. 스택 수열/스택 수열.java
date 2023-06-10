import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] seq = new int[n];
        for(int i=0; i<n; i++){
            seq[i] = in.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        char[] arr = new char[n*2];
        int num1 = 0;
        int idx = 0;

        for(int s : seq){
            if(st.empty() || num1 < s){
                while(num1 < s) {
                    st.push(++num1);
                    arr[idx++] = '+';
                }
            }
            if(st.peek() == s){
                st.pop();
                arr[idx++] = '-';
            } else if(st.peek() > s){
                System.out.println("NO");
                break;
            }
        }

        if(idx == n*2){
            for(char c : arr){
                System.out.println(c);
            }
        }
            
        in.close();
    }
}