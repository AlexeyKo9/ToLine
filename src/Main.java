import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 2, 3);
        int[][] arr = a.resize();
        ToLine b = new ToLine(new int[][] {{1, 5}, {3, 2}, {8, 6}});
        int[] arr1 = b.resize();
        System.out.println(Arrays.toString(b.resize()));
        for (int i = 0; i < 2; i++) {
            System.out.print("{");//идём по строкам
            for (int j = 0; j < 3; j++) {//идём по столбцам
                System.out.print(" " + arr[i][j] + " "); //вывод элемента
            }
            System.out.println("}");//перенос строки ради визуального сохранения табличной формы
        }
    }
}