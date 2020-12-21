package Day14;

import java.util.ArrayList;
import java.util.Collections;

public class Task48 {
    public static int compare(int[] row1, int[] row2, int col) {
        if (row2.length < (col + 1))
            return 1;

        if (row1.length < (col + 1) || row1[col] < row2[col])
            return -1;

        else if (row1[col] > row2[col])
            return 1;

        return 0;
    }

    public static int[][] arrSort(int[][] arr) {
        ArrayList<int[]> list = new ArrayList<>();

        Collections.addAll(list, arr);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (compare(list.get(j), list.get(j + 1), 0) == -1) {
                    int[] temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                } else if (compare(list.get(j), list.get(j + 1), 0) == 0) {
                    if (compare(list.get(j), list.get(j + 1), 1) == 1) {
                        int[] temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }

        int[][] new_arr = new int[arr.length][];
        for (int i = 0; i < list.size(); i++) {
            new_arr[i] = new int[list.get(i).length];
            System.arraycopy(list.get(i), 0, new_arr[i], 0, new_arr[i].length);
        }

        return new_arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {1, 4},
                {3, 2},
                {3, 3, 5}};

        int[][] new_arr = arrSort(arr);

        for (int[] row : new_arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
