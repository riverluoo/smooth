package com.riverluoo.smooth;

import java.util.ArrayList;
import java.util.List;

public class LinearSmooth {

    /**
     * 五点线性平滑
     *
     * @param in  原始数据
     * @param num 原始数据的长度
     * @return 处理后的数据
     */
    public static List<Double> linearSmooth5(List<Double> in, int num) {
        ArrayList<Double> out = new ArrayList<Double>();
        int i;
        if (num < 5) {
            for (i = 0; i <= num - 1; i++) {
                out.add(in.get(i));
            }
        } else {
            out.add(0, (3.0 * in.get(0) + 2.0 * in.get(1) + in.get(2) - in.get(4)) / 5.0);
            out.add(1, (4.0 * in.get(0) + 3.0 * in.get(1) + 2 * in.get(2) + in.get(3)) / 10.0);
            for (i = 2; i <= num - 3; i++) {
                out.add(i, (in.get(i - 2) + in.get(i - 1) + in.get(i) + in.get(i + 1) + in.get(i + 2)) / 5.0);
            }
            out.add(num - 2, (4.0 * in.get(num - 1) + 3.0 * in.get(num - 2) + 2.0 * in.get(num - 3) + in.get(num - 4)) / 10.0);
            out.add(num - 1, (3.0 * in.get(num - 1) + 2.0 * in.get(num - 2) + in.get(num - 3) - in.get(num - 5)) / 5.0);
        }

        return out;
    }

    /**
     * 三点线性平滑
     *
     * @param in
     * @param num
     * @return
     */
    public static List<Double> linearSmooth3(List<Double> in, int num) {
        ArrayList<Double> out = new ArrayList<Double>();

        return out;
    }
}
