import java.util.*;

public class LightsOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] press = new int[3][3];
        int[][] grid = new int[3][3];

        // Initial state: all lights ON
        for (int i = 0; i < 3; i++) {
            Arrays.fill(grid[i], 1);
        }

        // Input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                press[i][j] = sc.nextInt();
            }
        }

        int[] dx = {0, 0, 0, 1, -1};
        int[] dy = {0, 1, -1, 0, 0};

        // Apply toggles
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int toggles = 0;

                for (int d = 0; d < 5; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];

                    if (ni >= 0 && ni < 3 && nj >= 0 && nj < 3) {
                        toggles += press[ni][nj];
                    }
                }

                if (toggles % 2 == 1) {
                    grid[i][j] = 0;
                }
            }
        }

        // Output
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
