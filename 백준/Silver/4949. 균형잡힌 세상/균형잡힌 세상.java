import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true){
            Stack<Boolean> st = new Stack<>();
            String str = in.nextLine();

            if(str.equals(".")) break;

            boolean balanced = true;
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                switch(c){
                    case '(': 
                        st.push(true);
                        break;
                    case '[': 
                        st.push(false);
                        break;
                    case ')':
                        if(st.empty() || !st.pop()) balanced = false;
                        break;
                    case ']':
                        if(st.empty() || st.pop()) balanced = false;
                        break;
                }

                if(!balanced){
                    sb.append("no\n");
                    break;
                }
            }
            
            if(balanced) {
                if(st.empty()) sb.append("yes\n");
                else sb.append("no\n");
            } 
        }
        System.out.println(sb);
        in.close();;
    }
}