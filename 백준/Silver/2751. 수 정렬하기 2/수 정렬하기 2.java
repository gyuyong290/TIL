import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            al.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(al);

        for(int a : al){
            sb.append(a).append('\n');
        }
        System.out.println(sb);
    }
}