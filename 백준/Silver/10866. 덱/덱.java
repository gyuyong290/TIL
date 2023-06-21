import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = in.nextInt();
        Deque<Integer> que = new LinkedList<>();
        for(int i=0; i<n; i++){
            String cmd = in.next();
            switch(cmd){
                case "push_front":
                    que.offerFirst(in.nextInt());
                    break;
                case "push_back":
                    que.offerLast(in.nextInt());
                    break;
                case "pop_front":
                    if(que.isEmpty()) sb.append("-1\n");
                    else sb.append(que.pollFirst() + "\n");
                    break;
                case "pop_back":
                    if(que.isEmpty()) sb.append("-1\n");
                    else sb.append(que.pollLast() + "\n");
                    break;
                case "size":
                    sb.append(que.size()+"\n");
                    break;
                case "empty":
                    if(que.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "front":
                    if(que.isEmpty()) sb.append("-1\n");
                    else sb.append(que.peek() + "\n");
                    break;
                case "back":
                    if(que.isEmpty()) sb.append("-1\n");
                    else sb.append(que.peekLast() + "\n");
                    break;
            }
        }

        System.out.println(sb);

        in.close();
    }
}