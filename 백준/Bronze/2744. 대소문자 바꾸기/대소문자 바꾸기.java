import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        char[] word = in.nextLine().toCharArray();

        for(int i=0; i<word.length; i++){
            if(word[i] > 90) word[i] -= 32;
            else if(word[i] < 97) word[i] += 32;
            System.out.print(word[i]);
        }
        in.close();;
    }
}