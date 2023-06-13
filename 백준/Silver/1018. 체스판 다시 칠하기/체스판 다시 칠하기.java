import java.util.Scanner;

public class Main {
    public static int checkerboard(char[][] arr, int x, int y){
        int black = 0, white = 0;
        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if((i+j)%2 == (x+y)%2){  // same color with (i,j)
                    if(arr[i][j] == 'B') white++;
                    else black++;
                } else {  // different color with (i,j)
                    if(arr[i][j] == 'B') black++;
                    else white++;
                }
            }
        }
        return black < white ? black : white;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        char[][] arr = new char[n][];
        for(int i=0; i<n; i++){
            arr[i] = in.next().toCharArray();
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-7; i++){
            for(int j=0; j<m-7; j++){
                int current = checkerboard(arr, i, j);
                if(min > current) min = current;
            }
        }
        System.out.println(min);

        in.close();
    }
}