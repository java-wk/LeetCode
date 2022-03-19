package shuati_2203;

import java.util.ArrayList;
import java.util.List;

public class 矩阵网格 {

    public List<Integer> queryWhite(int[][] area, int id) {
        List<Integer> set = new ArrayList<>();
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                int sq = compareSq(area, i, j, id);
                if (sq > 0) {
                    set.add(sq);
                }
            }
        }
        return set;

    }

    public int compareSq(int[][] area, int i, int j, int id) {
        if (i < 0 || i >= area.length || j < 0 || j >= area[i].length) {
            return 0;
        }
        if (area[i][j] != id) {
            return 0;
        }
        area[i][j] = id - 1;
        return 1 +
                compareSq(area, i + 1, j, id) +
                compareSq(area, i - 1, j, id) +
                compareSq(area, i, j + 1, id) +
                compareSq(area, i, j - 1, id) +
                compareSq(area, i + 1, j + 1, id) +
                compareSq(area, i + 1, j - 1, id) +
                compareSq(area, i - 1, j + 1, id) +
                compareSq(area, i - 1, j - 1, id);
    }


}
