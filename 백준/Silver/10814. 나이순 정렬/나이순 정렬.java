import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String[] members = new String[n];
        for(int i=0; i<n; i++){
            members[i] = in.nextLine();
        }

        Arrays.sort(members, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int age1 = Integer.parseInt(o1.split(" ")[0]);
                int age2 = Integer.parseInt(o2.split(" ")[0]);
                return age1 - age2;
            }
        });

        for(String s : members){
            System.out.println(s);
        }

        in.close();
    }
}