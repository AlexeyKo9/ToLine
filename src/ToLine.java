import javax.swing.*;

public class ToLine {
    int[][] data;

    public ToLine(int[][] data){
        this.data = data;
    }

    public int[] resize() {
        int[] res = new int[data.length * data[0].length];
        int now = 0;
        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                res[now + j] = data1[j];
            }
            now += data1.length;
        }
        return res;
    }
}
