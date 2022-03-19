package shuati_2203;

import java.util.*;

public class 出现次数最高的k个元素 {
    /*
     * Top K Frequent Elements
     * Given a non-empty array of integers, return the k most frequent elements.
     * For example,
     * Given [1,1,1,2,2,3] and k = 2, return [1,2].
     * Note:
     * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
     * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
     * */

    //返回一个数组中，出现次数最多的k个数
    public List<Integer> topKFrequent(int[] nums, int k) {

        //先统计每个数字出现的次数，这个貌似不可避免，时间复杂度为O(n)
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = map.get(nums[i]);
            if (count == null) {
                count = 0;
            }
            map.put(nums[i], count + 1);
        }

        //然后应该可以使用优先队列了，
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, new Comp(map));

        for (int key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
                continue;
            }

            int small = pq.peek();
            if (map.get(small) < map.get(key)) {
                pq.poll();
                pq.add(key);
            }
        }
        return new ArrayList<Integer>(pq);
    }

    //注意构造函数，使用map来初始化
    class Comp implements Comparator<Integer> {

        HashMap<Integer, Integer> map;

        public Comp(HashMap<Integer, Integer> map) {
            this.map = map;
        }

        @Override  //通过key的value来排序
        public int compare(Integer o1, Integer o2) {
            return map.get(o1) - map.get(o2);
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arrayDemo = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5, 8};
        出现次数最高的k个元素 topK = new 出现次数最高的k个元素();
        List<Integer> list = topK.topKFrequent(arrayDemo, 4);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        int k = 3;
        System.out.println(list.get(k - 1));

    }
}





