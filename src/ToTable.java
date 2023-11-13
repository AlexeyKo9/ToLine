import java.util.Arrays;

public class ToTable {
    int[] data;
    int x;
    int y;

    public ToTable(int[] data, int x, int y){
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] resArray = new int[x][y];
        int now = 0;
        for (int i = 0; i < x; i++) {
            for (int j = now; j < now + y; j++) {
                resArray[i][j - now] = data[j];
            }
            now += y;
        }
        return resArray;
    }
}
