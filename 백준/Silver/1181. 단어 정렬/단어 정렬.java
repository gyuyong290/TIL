import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeSet<String> words = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                else return o1.length()-o2.length();
            }
        });

        for(int i=0; i<n; i++){
            words.add(in.next());
        }

        for(String str : words){
            System.out.println(str);
        }

        in.close();
    }
}