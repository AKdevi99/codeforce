import java.util.*;

public class BeautifulMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int[][] matrix = new int[5][5];
        int r=0;
        int c =0;
        int n=5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    r =i;
                    c=j;
                }
            }
        }
        
        int moves = Math.abs(r-2) + Math.abs(c-2);
        
        System.out.println(moves);

        
    }
}
