import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int tc = in.nextInt();

        for(int t=0; t<tc; t++){
            char[] arr = in.next().toCharArray();
            Stack<Boolean> st = new Stack<>();

            for(int i=0; i<arr.length; i++){
                if(arr[i] == '('){
                    st.add(true);
                } else if(st.isEmpty()){
                    st.add(false);
                    break;
                } else st.pop();
            }
            
            if(st.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.println(sb);
        in.close();
    }
}