import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            String cmd = in.next();
            switch(cmd){
                case "push":
                    st.push(in.nextInt());
                    break;
                case "pop":
                    if(st.isEmpty()) sb.append("-1\n");
                    else sb.append(st.pop() + "\n");
                    break;
                case "size":
                    sb.append(st.size() + "\n");
                    break;
                case "empty":
                    if(st.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "top":
                    if(st.isEmpty()) sb.append("-1\n");
                    else sb.append(st.peek() + "\n");
                    break;
            }
        }

        System.out.println(sb);

        in.close();
    }
}